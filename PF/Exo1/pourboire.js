function calculateTip(amount, rating) {
    let tipPercentage;
    switch (rating.toLowerCase()) {
        case 'terrible':
            tipPercentage = 0;
            break;
        case 'poor':
            tipPercentage = 0.05;
            break;
        case 'good':
            tipPercentage = 0.1;
            break;
        case 'great':
            tipPercentage = 0.15;
            break;
        case 'excellent':
            tipPercentage = 0.2;
            break;
        default:
            return "Rating not recognised";
    }
    return Math.ceil(amount * tipPercentage);
}

console.log(calculateTip(20, "ExcellEnt"));  
console.log(calculateTip(26.95, "good")); 
console.log(calculateTip(20, "hi")); 