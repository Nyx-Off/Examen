function countMealOptions(list) {
    var result = {};
    for (var i = 0; i < list.length; i++) {
        var meal = list[i].Repas;
        if (result[meal]) {
            result[meal]++;
        } else {
            result[meal] = 1;
        }
    }
    return result;
}

var list1 = [
    {FirstName: 'Noah', lastName: 'M.', pays: 'Suisse', continent: 'Europe', age: 19, langue: 'C', Repas: 'végétarien'},
    {FirstName: 'Anna', lastName: 'R.', pays: 'Liechtenstein', continent: 'Europe', age: 52, langue:'JavaScript', Repas: 'standard'},
    {FirstName: 'Ramona', lastName: 'R.', pays: 'Paraguay', continent: 'Amériques', age: 29, langue: 'Ruby', Repas: 'vegan'},
    {FirstName: 'George', lastName: 'B.', pays: 'Angleterre', continent: 'Europe', age: 81, langue: 'C', Repas: 'végétarien'},
];

console.log(countMealOptions(list1));