//
// David Harrigan
// 
//

var rows = [];
var non_terminals = [];
var terminals = [];
var null_deriving = [];
var first_sets = [];

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
            if (row[0] == ret[j]) {
                match = true;
            }
            j = j + 1;
        };

        if (!match) {
            ret.push(row[0]);
        }

        if (row.length() == 1) {
            j = 0;
            match = false;
            while (j < null_deriving.length()) {
                if (row[0] == null_deriving[j]) {
                    match = true;
                }
                j = j + 1;
            };
            if (!match) {
                null_deriving.push(row[0]);
            }
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
                if (row[element] == non_terminals[j]) {
                    match = true;
                }
                j = j + 1;
            };

            j = 0;
            while (j < ret.length()) {
                if (row[element] == ret[j]) {
                    match = true;
                }
                j = j + 1;
            };
            
            if (!match) {
                ret.push(row[element]);
            }

            element = element + 1; 
        };

        i = i + 1;
    };
    return ret; 
};

//
//
//
var getFirstSets = function() {

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

// Part 1
print "Start Symbol";
print non_terminals[0];

print "\nNonterminals";
print non_terminals;

print "\nTerminals";
print terminals;
print "\n";

// Part 2
print "Null-Deriving Nonterminals";
print null_deriving;

