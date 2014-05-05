//
// David Harrigan
//

var symbols = [];
var terminals = [];
var non_terminals = [];
var null_deriving = [];

//
// Symbol function to store information of each symbol
//
var Symbol = function(s, isTerminal) {
    this.symbol = s;
    this.isTerminal = isTerminal;
    this.start = false;
    this.null_deriving = false;
    this.lambda = false;
    this.products = [];
    this.first_sets = [];
    this.follow_sets;
    this.predict_sets = [];

    this.toString = function() {
        return this.symbol;
    };

    return this;
};

//
// Returns a Symbol object from a given string input
//
var getSymbol = function(s) {
    var index = 0; 
    var ret;
    var len = symbols.length;
    while (index < len) {
        if (symbols[index].symbol == s) {
            return symbols[index];
        }
        index = index + 1;
    };
    return undefined;
};

//
// Returns a set of nonterminals
//
var getNonTerminals = function(rows) {
    var ret = [];
    var i = 0;
    
    while (i < this.rows.length) {
        var row = split(this.rows[i], "\ ");
        var match = false;
        var j = 0;

        while (j < ret.length) {
            if (row[0] == ret[j].symbol) {
                match = true;
                if (row.length > 1) {
                    ret[j].products.push(row.slice(1));
                    symbols[j].products.push(row.slice(1));
                }
                else {
                    ret[j].null_deriving = true;
                    symbols[j].null_deriving = true;
                    ret[j].lambda = true;
                    symbols[j].lambda = true;
                }
            }
            j = j + 1;
        };

        // we don't want any duplicates
        if (!match) {
            ret.push(new Symbol(row[0], false));
            symbols.push(new Symbol(row[0], false));

            if (row.length > 1) {
                ret[ret.length-1].products.push(row.slice(1));
                symbols[symbols.length-1].products.push(row.slice(1));
            } 
            else {
                ret[ret.length-1].null_deriving = true;
                symbols[symbols.length-1].null_deriving = true;
                ret[j].lambda = true;
                symbols[j].lambda = true;
            }
        }

        i = i + 1;
    };

    symbols[0].start = true;
    return ret;
};

//
// Checks whether the given set of product is null deriving
//
var isProductNullDeriving = function(product) {
    var k = 0;
    while (k < product.length) {
        var sym = getSymbol(product[k]);
        if (sym.null_deriving == false) {
            return false;
        }
        k = k + 1;
    }
    return true;
};


//
// Returns a set of null deriving nonterminals 
//
var getNullDeriving = function() {
    var ret = [];
    var i = 0;

    while (i < non_terminals.length) {
        if (non_terminals[i].null_deriving == true) {
            ret.push(non_terminals[i].symbol);
        } 
        else {
            var j = 0;
            while (j < non_terminals[i].products.length) {
                var null_derive = isProductNullDeriving(non_terminals[i].products[j]);
                if (null_derive) {
                    non_terminals[i].null_deriving = true;
                    symbols[i].null_deriving = true;
                    ret.push(non_terminals[i]);
                    break;
                }
                j = j + 1;
            }
        }
        i = i + 1;
    };
    return ret;
};

//
// returns a set of terminals 
//
var getTerminals = function(rows) {
    var ret = [];
    var i = 0;
    
    while (i < this.rows.length) {
        var row = split(this.rows[i], "\ ");
        var element = 1;

        while (element < row.length) {
            var j = 0;
            var match = false;
            while (j < non_terminals.length) {
                if (row[element] == non_terminals[j].symbol) {
                    match = true;
                }
                j = j + 1;
            };

            j = 0;
            while (j < ret.length) {
                if (row[element] == ret[j].symbol) {
                    match = true;
                }
                j = j + 1;
            };
            
            // we don't want any duplicates
            if (!match) {
                ret.push(new Symbol(row[element], true));
            }

            element = element + 1; 
        };

        i = i + 1;
    };

    i = 0;
    while (i < ret.length) {
        symbols.push(ret[i]);
        i = i + 1;
    }
    return ret; 
};

//
// Given a list of products (right hand side elements), 
// calculates and returns the first sets of the input
//
var getFirstOfProduct = function(products, non_terminal) {
    var ret = [];  
    var i = 0;
    while(i < products.length) {
        var sym = getSymbol(products[i]);

        if (sym.isTerminal) {
            var k = 0;
            var match = false;
            while (k < ret.length) {
                if (ret[k].symbol == sym.symbol) {
                    match = true;
                    break;
                }
                k = k + 1;
            }
            if (!match) {
                ret.push(sym);
            }
            break;
        }
        else {
            var firsts; 
            if (!(sym.symbol == non_terminal)) {
                firsts = getFirst(sym.symbol);
            }
            else {
               firsts = sym.first_sets;
            }
            var k = 0;
            while (k < firsts.length) {
                var x = 0;
                var match = false;

                while (x < ret.length) {
                    if (ret[x].symbol == firsts[k].symbol) {
                        match = true; 
                    }
                    x = x + 1;
                }

                if (!match) {
                    ret.push(firsts[k]);
                }
                k = k + 1;
            }
        }

        if (sym.null_deriving == false) {
            break;
        }
        i = i + 1;
    };
    return ret;
};

//
// Returns a set of all first sets from a given nonterminal 
//
var getFirst = function(non_terminal_char) {
    var i = 0; 
    var j = 0;
    var ret = [];
    
    // for each product
    var non_terminal = getSymbol(non_terminal_char);
    while(i < non_terminal.products.length) {
        var result = getFirstOfProduct(non_terminal.products[i], non_terminal_char);
        non_terminal.products[i].first = result;

        j = 0; 
        while (j < result.length) {
            var k = 0;
            var match = false;
            while (k < ret.length) {
                if (result[j] == ret[k]) {
                    match = true;
                    break;
                }
                k = k + 1;
            }
            
            if (!match) {
                ret.push(result[j]);                
            }
            j = j + 1;
        }
        i = i + 1;
    };
    return ret;
};

//
// Calculates first sets of all nonterminals
//
var getFirstSets = function() {
    var i = 0;
    var ret = []; 
    while (i < non_terminals.length) {
        non_terminals[i].first_sets = getFirst(non_terminals[i].symbol);
        symbol = getSymbol(non_terminals[i].symbol);
        symbol.first_sets = non_terminals[i].first_sets;
        print non_terminals[i].toString() + ": " +  non_terminals[i].first_sets; 
        i = i + 1;
    }
};

//
// Calculates follow sets of all nonterminals
//
var getFollowSets = function() {
    
    //
    // Recursive inner function. Returns a follow set for a 
    // given nonterminal. 
    //
    var getFollow = function(non_terminal_char, prevFollow) {
        var i = 0;
        var j = 0;
        var k = 0;
        var ret = [];

        target = getSymbol(non_terminal_char);
        if (target.start) {
            ret.push("$");
        }
        
        while (i < non_terminals.length) {  // for each non_terminals
            var non_terminal = non_terminals[i];
            j = 0;
            while (j < non_terminal.products.length) { //iterate each product sets
                k = 0;
                var prevTarget = false;
                while (k < non_terminal.products[j].length) { //each item in product
                    var item = getSymbol(non_terminal.products[j][k]);
                    
                    if ((item.symbol == target.symbol) || 
                       (item.null_deriving && prevTarget)) {
                        var set = [];

                        // if it's the last element
                        if (k == non_terminal.products[j].length-1) {
                            if (!(non_terminal.symbol == item.symbol)) {
                                if (non_terminal.follow_sets == undefined &&
                                   !(prevFollow == non_terminal.symbol )) {
                                    set = getFollow(non_terminal.symbol, target.symbol);
                                } 
                                else if (!(non_terminal.follow_sets == undefined)){
                                    set = non_terminal.follow_sets;
                                }
                            }

                        }
                        else {
                            var next = getSymbol(non_terminal.products[j][k+1]);
                            if (next.isTerminal == false) {
                                set = next.first_sets;
                            }
                            else {
                                set.push(next.symbol);
                            }
                        }

                        var x = 0;
                        while (x < set.length) {
                            var y = 0;
                            var match = false;
                            while (y < ret.length) {
                                if (set[x] == ret[y]) {
                                    match = true;
                                    break;
                                }
                                y = y + 1;
                            }
                            if (!match) {
                                ret.push(set[x]);
                            }
                            x = x + 1;
                        }
                        prevTarget = true;
                    }
                    else {
                        prevTarget = false;
                    }
                    k = k + 1;
                }
                j = j + 1;
            }
            i = i + 1;
        }
        return ret;
    };
    
    var i = 0;
    while (i < non_terminals.length) {
        non_terminals[i].follow_sets = getFollow(non_terminals[i].symbol);
        symbol = getSymbol(non_terminals[i].symbol);
        symbol.follow_sets = non_terminals[i].follow_sets;
        print non_terminals[i].toString() + ": " +  non_terminals[i].follow_sets; 
        i = i + 1;
    }
};

//
// Returns a predict set for a given nonterminal
//
var getPredict = function(non_terminal_char) {
    var i = 0; 
    var ret = [];
    var non_terminal = getSymbol(non_terminal_char); 
    
    while (i < non_terminal.products.length) {
        ret.push(getFirstOfProduct(non_terminal.products[i], non_terminal_char));
        if (isProductNullDeriving(non_terminal.products[i])) {
            ret[ret.length - 1].push("$");
        }
        i = i + 1;
    };

    if (non_terminal.lambda) {
        ret.push(non_terminal.follow_sets);
    }
    
    return ret;
};

//
// Calculates predict sets for all products
//
var getPredictSets = function() {
    var i = 0;
    var ret = [];
    while (i < non_terminals.length) {
        non_terminals[i].predict_sets = getPredict(non_terminals[i].symbol);
        
        var j = 0;
        while (j < non_terminals[i].products.length) {
            print non_terminals[i] + " -> " + non_terminals[i].products[j] + ":";
            print non_terminals[i].predict_sets[j] + "\n"; 
            j = j + 1;
        }
        if (non_terminals[i].lambda) {
            print non_terminals[i] + " -> lambda: ";
            print non_terminals[i].predict_sets[j] + "\n";
        }

        symbol = getSymbol(non_terminals[i].symbol);
        symbol.predict_sets = non_terminals[i].predict_sets;

        i = i + 1;
    }
};

//
// Checks whether the given grammar is LL(1)
//
var isLL1 = function() {
    var ret = true;
    var i = 0;

    var isUniqueSet = function(non_terminal_char) {
        var symbol = getSymbol(non_terminal_char);
        var i = 0; 
        var j = 0;

        while (i < symbol.predict_sets.length) {
            j = 0; 
            while (j < symbol.predict_sets.length) {
                if (!(j == i)) {
                    var x = 0;
                    while (x < symbol.predict_sets[i].length) {
                        var y = 0;
                        while (y < symbol.predict_sets[j].length) {
                            if (symbol.predict_sets[i][x] == symbol.predict_sets[j][y]) {
                                return false;
                            }
                            y = y + 1;
                        }
                        x = x + 1;
                    }
                }
                j = j + 1;
            }
            i = i + 1; 
        }
        return true;
    };
    
    while (i < non_terminals.length) {
        if (isUniqueSet(non_terminals[i].symbol) == false) {
            return false;
        }
        i = i + 1;
    }
    return true;
};

var scan = readln();
var lines = scan;
while (scan) {
    scan = readln();
    lines = lines + scan;
};


rows = split(lines, '\n');
non_terminals = getNonTerminals(rows);
terminals = getTerminals(rows);
null_deriving = getNullDeriving();

// Part 1
print "\nStart Symbol";
print non_terminals[0].symbol;

print "\nNonterminals";
print non_terminals;

print "\nTerminals";
print terminals;

// Part 2
print "\nNull-Deriving Nonterminals";
print null_deriving;

// Part 3 
print "\nFirst Sets";
getFirstSets();

// Part 4
print "\nFollow Sets";
getFollowSets();

// Part 5
print "\nPredict Sets";
getPredictSets();

var LL = isLL1();
if (LL) {
    print "\nThe grammar is LL(1)\n";
}
else {
    print "\nThe grammar is NOT LL(1)\n";
}
