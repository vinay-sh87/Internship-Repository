// 1. Arithmetic Operators
console.log("Additon: ", 34 + 22);
console.log("Subtraction: ", 34 - 22);
console.log("Multiplication: ", 34 * 22);
console.log("Division: ", 34 / 22);
console.log("Modulus: ", 34 % 22);
console.log("Exponentiation: ", 3 ** 4);

// 2. Assignment Operators
let val = 6;
val += 2;
console.log(val); // 8
val -= 3;
console.log(val); // 5
val *= 3;
console.log(val); // 15
val /= 3;
console.log(val);  // 5
val %= 2;
console.log(val); // 1
val **= 3;
console.log(val); // 1

// 3. Comparison Operators
console.log(34 == "34");
console.log(34 === "34"); // strict equality check
console.log(10 != "10");
console.log(10 !== "10");
console.log(false < true);
console.log(true > false);

// 4. Logical Operators
console.log((34 > 3) && (5 > 8)); // false
console.log((34 > 3) || (5 > 8)); //  true
console.log(!true && false); // false
console.log(!10); // false
console.log(34 > 3 && 5 || 8); // 5

// 5. Unary Operators
// unary plus --> converts into positive integer
let x = '5';
console.log(+x);
console.log(typeof +x);

// unary minus --> converts into negative integer
let y = '5';
console.log(-y);
console.log(typeof -y);

let number = 44;
console.log(number++); // 44
console.log(++number); // 46
console.log(number--); // 46
console.log(--number); // 44


// 6. Ternary Operator
let output = 34 > 5 ? 34 : 5;
console.log(output);

let marks = 80;
let grade = (marks >= 90) ? "A" : (marks >= 80) ? "B" : (marks >= 60) ? "C" : (marks >= 33) ? "D" : "F";
console.log(grade);






// practice questions
console.log();
console.log(0 == ""); // true
console.log(0 === ""); // false

console.log("5" - 3); // 2
console.log("5" + 3); // 53
console.log("5" ** 3); // 125

console.log(true + false);

console.log(null || 'text1' && 'text2'); // text2 && returns the first falsy value or last truthy value

console.log(0 || null || undefined || "JS" || false); // JS || returns the first truthy value or last falsy value

let n = 10;
let m = (x > 5) ? (x < 15 ? "A" : "B") : "C";
console.log(y); // A


console.log([] == 0); // true ([] --> "" == 0 --> true)
console.log([] == []); // false (js compares reference not content)
