/* 
declration of variables using
var --> can be redeclared and reassigned
let --> only can be reassigned
const --> can't be redeclared or reassigned


scope : area where the variable is accessible
following are the type of scopes available in javascript
1. global scope --> anywhere in the code 
2. function scope --> inside the function only
3. block scope --> inside the block only


*/

// 1. global scope 
let global = 23;
console.log(global);

{
    console.log(global);
}
function getGlobal() {
    return global;
}
console.log(getGlobal());

// 2. function scope
function fscope() {
    let str = "message"; // only accessible inside 
    console.log(str);
}
fscope();
// console.log(str); // error

// 3. block scope
{
    let age = 34; // only accessible inside this block
    console.log(age);
}
// console.log(age); // error


if (!!0) {
    console.log("truthy value");
} else {
    console.log("falsy value");
}

/* 
var --> function scope 
let --> block scope
const --> block scope

            global      block       function
var          ✅         ❌(leaks)     ✅
let          ✅         ✅            ✅
const        ✅         ✅            ✅
*/
{
    var number = 444;
    console.log("Inside the block", number);
}
console.log("Outside the block", number);



/* data types 
1. Primitives --> immutable, assigning one variable to another gets a copy
--> number, boolean, string, bigint, null, undefined, symbol
2. Reference --> mutable, assigning one variable to another gets reference 
--> [], {}, function(){}
*/

let a = 20;
console.log(a)
let b = a; // gets a copy 
console.log(b);
b = 34;
console.log(a);

// immutable 
let str = 'message';
console.log(str);
str[0] = 'a'; // can't be modified
console.log(str);

// mutable
const arr = [1, 2, 3];
console.log(arr);
arr[0] = 34; // can be modified
console.log(arr);


console.log(typeof 34);
let temp;
console.log(typeof temp);
console.log(typeof Symbol('$'));
console.log(typeof true);
console.log(typeof 'message');
let x = 230000000n;
let y = BigInt(29039940000000000);
console.log(typeof x);
console.log(typeof y);

const array = [34, 'string', undefined, { key: "value" }, [3, 2, 3, 4]];
console.log(array);
const newArray = array;
console.log(newArray);
newArray.push("new value");
console.log(newArray); // newArray is holding the reference of array
console.log(array); 
