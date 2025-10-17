/* Control Statements 
1. Conditional Statements
2. Looping Statements
3. Jump Statements */

/* Conditional Statements
1. if
2. if-else
3. switch */

// if 
let isLoggedIn = true;
if (isLoggedIn) {
    console.log("Welcome back to your dashboard!");
}

// if-else 
let isAddmin = true;
if (isAddmin && isLoggedIn) {
    console.log("Welcome back to the admin dashboard!");
} else {
    console.log("Welcome back to your dashboard!");
}

let premiumUser = true;
if (premiumUser && isLoggedIn) {
    console.log("Welcome back to the premium dashboard!")
} else if (isLoggedIn) {
    console.log("Welcome back to your dashboard!");
} else {
    console.log("Please login first!");
}

let number = 34;
if (number % 2 === 0) {
    console.log("Even");
} else {
    console.log("Odd");
}


let customerAge = 18;
let ticketPrice = undefined;
if (customerAge >= 60) {
    ticketPrice = 6;
} else if (customerAge >= 12) {
    ticketPrice = 12;
} else if (customerAge > 0) {
    ticketPrice = 8;
} else {
    console.log("Invalid age");
}
console.log(`Ticket Price : ${ticketPrice}`);


// nested if 
const user = {
    name: "Tim",
    age: 22,
    username: 'timmm',
    passsword: 'user@five'
}

let inputUsername = 'timmm';
let inputPassword = 'user@fiv';
if (inputUsername === user.username) {
    if (inputPassword === user.passsword) {
        console.log("Login Successful!");
    } else {
        console.log("Invalid Password!");
    }
} else {
    console.log("Invalid Username!");
}

// switch
let temperature = 39;
let message = "";
switch (true) {
    case (temperature >= 30):
        message = "It's Hot 🔥";
        break;
    case (temperature >= 16):
        message = "It's warm ☀️";
        break;
    case (temperature >= 0):
        message = "It's cold ❄️";
        break;
    case (temperature < 0):
        message = "It's freezing 🥶";
        break;
    default:
        message = "Invalid Temperature!";
}
console.log(message);



/* Looping Statements */
// for 
for (let i = 0; i < 5; i++) {
    console.log(`iteration : ${i + 1}`);
}
const fruits = ["apple", "banana", "pineapple", "mango", "orange"];
for (let i = 0; i < fruits.length; i++) {
    console.log(`${i + 1}. ${fruits[i]}`);
}

// while 
let itr = 1;
while (true) {
    console.log(itr);
    if (itr === 4) break;
    itr++;
}

// do-while 
let i = 0;
do {
    console.log(fruits[i]);
} while (false);

for (let i = 1; i <= 10; i++) {
    console.log(`7 * ${i} = ${7 * i}`);
}

let matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];
console.log(matrix);

for (let i = 0; i < matrix.length; i++) {
    let row = "";
    for (let j = 0; j < matrix[i].length; j++) {
        row += matrix[i][j] + " ";
    }
    console.log(row);
}