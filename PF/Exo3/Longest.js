function longestWord(str) {
    return str.split(' ').reduce((longest, currentWord) => {
        return currentWord.length >= longest.length ? currentWord : longest;
    }, '');
}

console.log(longestWord('a b c d e fgh'));
console.log(longestWord('one two three'));
console.log(longestWord('red blue grey')); 