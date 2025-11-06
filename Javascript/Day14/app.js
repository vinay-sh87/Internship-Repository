let age = 23;
let text = `Age is ${age}`;
console.log(text);

// let input = prompt("Enter your name");
// console.log(`Name is ${input}`);

// let first = prompt("Enter first number");
// let second = prompt("Enter second number");
// let sum = Number(first) + Number(second);
// console.log(`Sum is ${sum}`);

str = prompt("Enter numbers separated by space ");
arr = str.split(" ");
console.log(arr);
let result = arr.reduce((a, b) => Number(a) + Number(b));
let maximum = arr.reduce((first, second) => {
    if (first > second) return first;
    else return second;
});
let minimum = arr.reduce((first, second) => {
    if (first < second) return first;
    else return second;
    
})
console.log(`Sum of the numbers is ${result}`);
console.log(`Maximum number is ${maximum}`);
console.log(`Minimum number is ${minimum}`);

