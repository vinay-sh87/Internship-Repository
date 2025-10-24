// Math object methods

console.log(Math.round(4.5)); // Rounds to nearest integer
console.log(Math.ceil(4.2)); // Rounds up to next integer
console.log(Math.floor(4.8)); // Rounds down to previous integer
console.log(Math.trunc(4.9)); // Removes decimal part
console.log(Math.sign(-5)); // Returns -1 for negative, 1 for positive, 0 for zero
console.log(Math.pow(2, 3)); // 2 raised to the power of 3
console.log(Math.sqrt(16)); // Square root of 16
console.log(Math.abs(-10)); // Absolute value
console.log(Math.max(1, 2, 3, 4, 5)); // Returns the largest number
console.log(Math.min(1, 2, 3, 4, 5)); // Returns the smallest number




let randomNumber = Math.random(); // Generates a random number between 0 and 1
console.log(randomNumber);

console.log(Math.floor(1000 + Math.random() * 9000)); // Generates a random 4-digit number

let min = 1, max = 6;
console.log(Math.floor((Math.random() * (max - min + 1) + min))); // Generates a random number between min and max (inclusive)

console.log(Math.floor((Math.random() * (max - min) + min))); // Generates a random number between min and max (exclusive)


const otpBtn = document.getElementById("otpBtn");
const otpDisplay = document.getElementById("otpDisplay");
otpBtn.addEventListener('click', () => {
    let otp = Math.floor(1000 + Math.random() * 9000);
    otpDisplay.innerText = `Your OTP is: ${otp}`;
    otpDisplay.style.fontSize = "24px";
    otpDisplay.style.fontWeight = "bold";
})