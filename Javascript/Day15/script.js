// const user = { name: "Person Name", age: 21, gender: "male" };
// localStorage.setItem("user", user);

// const newPerson = localStorage.getItem("user");
// console.log(newPerson);

const user1 = { name: "Person 1 Name", age: 21, gender: "male" };
const user2 = { name: "Person 2 Name", age: 31, gender: "female" };
localStorage.setItem("user1", JSON.stringify(user1));
localStorage.setItem("user2", JSON.stringify(user2));

const info1 = JSON.parse(localStorage.getItem("user1"));
console.log(info1);
const info2 = JSON.parse(localStorage.getItem("user2"));
console.log(info2);


console.log(localStorage.length);
console.log(localStorage.key(0));
localStorage.removeItem("user1");
localStorage.clear();