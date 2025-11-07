console.log("synchronous task");
setTimeout(() => {
    console.log("asynchronous task after 5 seconds");
}, 5000);
console.log("synchronous task");

setTimeout(() => {
    console.log("asynchronous task after 2 seconds");
}, 2000);
setTimeout(() => {
    console.log("asynchronous task after 2 seconds second task");
}, 2000);


// function f() {
//     console.log("F");
// }
// console.log(f.name, f.arguments);

// const map = new Map();
// const cart = [
//     { name: "Phone", price: 1000, quantity: 1 },
//     { name: "TV", price: 2000, quantity: 2 },
//     { name: "Laptop", price: 3000, quantity: 3 }
// ];

// cart.forEach((item) => {
//     map.set(item.name, item);
// });
// console.log(map);
// console.log(map.get("Phone"));
// console.log(map.has("Phone"));
// console.log(map.size);

// const list = cart.reduce((acc, item) => {
//     acc[item.name] = item;
//     return acc;
// }, {});
// console.log(list);