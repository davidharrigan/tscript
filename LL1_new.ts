//
// David Harrigan
//

var symbols = [];
var terminals = [];
var non_terminals = [];
var null_deriving = [];

//
//
//
var Symbol = function(s, isTerminal) {
    this.symbol = s;
    this.isTerminal = isTerminal;
    this.start = false;
    this.null_deriving = false;
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
//
//
var getSymbol = function(s) {
    var i = 0; 
    var ret;
    while (i < symbols.length()) {
        if (symbols[i].symbol == s) {
            return symbols[i];
        }
        i = i+1;
    }
    return undefined;
};

//
//
//
var getNonTerminals = function(rows) {
    var ret = [];
    var i = 0;
    
    while (i < this.rows.length()) {
        var row = split(this.rows[i], "\ ");
        var match = false;
        var j = 0;

        while (j < ret.length()) {
            if (row[0] == ret[j].symbol) {
                match = true;
                if (row.length() > 1) {
                    ret[j].products.push(row.slice(1));
                    symbols[j].products.push(row.slice(1));
                }
                else {
                    ret[j].null_deriving = true;
                    symbols[j].null_deriving = true;
                }
            }
            j = j + 1;
        };

        if (!match) {
            ret.push(new Symbol(row[0], false));
            symbols.push(new Symbol(row[0], false));

            if (row.length() > 1) {
                ret[ret.length()-1].products.push(row.slice(1));
                symbols[symbols.length()-1].products.push(row.slice(1));
            } 
            else {
                ret[ret.length()-1].null_deriving = true;
                symbols[symbols.length()-1].null_deriving = true;
            }
        }

        i = i + 1;
    };

    symbols[0].start = true;
    return ret;
};

//
//
//
var getNullDeriving = function() {
    var ret = [];
    var i = 0;

    while (i < non_terminals.length()) {
        if (non_terminals[i].null_deriving == true) {
            ret.push(non_terminals[i].symbol);
        }
        i = i + 1;
    };
    return ret;
};

//
//
//
var getTerminals = function(rows) {
    var ret = [];
    var i = 0;
    
    while (i < this.rows.length()) {
        var row = split(this.rows[i], "\ ");
        var element = 1;

        while (element < row.length()) {
            var j = 0;
            var match = false;
            while (j < non_terminals.length()) {
                if (row[element] == non_terminals[j].symbol) {
                    match = true;
                }
                j = j + 1;
            };

            j = 0;
            while (j < ret.length()) {
                if (row[element] == ret[j].symbol) {
                    match = true;
                }
                j = j + 1;
            };
            
            if (!match) {
                ret.push(new Symbol(row[element], true));
            }

            element = element + 1; 
        };

        i = i + 1;
    };

    i = 0;
    while (i < ret.length()) {
        symbols.push(ret[i]);
        i = i + 1;
    }
    return ret; 
};


//
//
//
var getFirstSets = function() {
    
    // Recursive internal function
    var getFirst = function(non_terminal_char) {
        var i = 0; 
        var j = 0;
        var ret = [];
        
        non_terminal = getSymbol(non_terminal_char);

        // for each product
        while(i < non_terminal.products.length()) {
            j = 0;
            while(j < non_terminal.products[i].length()) {
                var sym = getSymbol(non_terminal.products[i][j]);

                if (sym.isTerminal) {
                    ret.push(sym);
                    break;
                }
                else {
                    firsts = getFirst(sym.symbol);
                    var k = 0;
                    while (k < firsts.length()) {
                        var x = 0;
                        var match = false;
                        while (x < ret.length()) {
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
                    
                    if (sym.null_deriving == false) {
                        break;
                    }
                }
                j = j + 1;
            };
            i = i + 1;
        };
        return ret;
    };

    var i = 0;
    var ret = []; 
    while (i < non_terminals.length()) {
        non_terminals[i].first_sets = getFirst(non_terminals[i].symbol);
        print non_terminals[i].toString() + ": " +  non_terminals[i].first_sets; 
        i = i + 1;
    }
};

var getFollowSets = function() {
    
    var getFollow = function(non_terminal_char) {
        var i = 0;
        var j = 0;
        var k = 0;
        var ret = [];

        target = getSymbol(non_terminal_char);
        if (target.start) {
            ret.push("$");
        }

        while (i < non_terminals.length()) {  // for each non_terminals
            var non_terminal = non_terminals[i];
            j = 0;
            while (j < non_terminal.products.length()) { //iterate each product sets
                
                k = 0;
                while (k < non_terminal.products[j].length()) { //each item in product
                    var item = getSymbol(non_terminal.products[j][k]);
                    if (item.symbol == target.symbol) {
                        var set = [];

                        // if it's the last element
                        if (k == non_terminal.products[i].length()-1) {
                            var set;
                            if (non_terminal.follow_sets == undefined) {
                                set = getFollow(non_terminal.symbol);
                            } 
                            else {
                                set = non_terminal.follow_sets;
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
                        while (x < set.length()) {
                            var y = 0;
                            var match = false;
                            while (y < ret.length()) {
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
    while (i < non_terminals.length()) {
        non_terminals[i].follow_sets = getFollow(non_terminals[i].symbol);
        print non_terminals[i].toString() + ": " +  non_terminals[i].follow_sets; 
        i = i + 1;
    }
};

var scan = readln();
var lines = scan;
while (scan) {
    scan = readln();
    lines = lines + scan;
};

rows = split(lines, '\n');
non_terminals = getNonTerminals(rows);
null_deriving = getNullDeriving();
terminals = getTerminals(rows);

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
