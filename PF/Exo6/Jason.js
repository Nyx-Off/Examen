function killcount(counselers, jasonIntelligence) {
    var victims = []; 

    for (var i = 0; i < counselers.length; i++) {
        var counselor = counselers[i]; 
        var name = counselor[0]; 
        var intelligence = counselor[1];

        if (intelligence < jasonIntelligence) {
            victims.push(name);
        }
    }

    return victims;
}

console.log(killcount([['Tiffany',4],['Jack',6],['Megan',7],['Tyler',3]], 6));