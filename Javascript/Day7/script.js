// for of loop -- used for iterable objects 
const favMovies = ["The Dark Knight", "Inception", "Interstellar"];
for (let movie of favMovies) {
    console.log(movie);
}

const text = "message";
for (let char of text) {
    console.log(char);
}


// for in loop -- used for enumerable properties
const user = {
    name: "Andrew",
    age: 30,
    city: "New York"
};

for (let key in user) {
    console.log(`${key} : ${user[key]}`);
}


// for each method
favMovies.forEach((movie, index, arr) => {
    console.log(`${index + 1}. ${movie}`);
})

const arr = [1, 2, 3, 4, 5];
let largest = arr[0]
arr.forEach(val => {
    if (val > largest) { largest = val; }
})
console.log("largest : ", largest);

arr.forEach((val, i, arr) => {
    arr[i] = val * 2;
})
console.log(arr);


const object = { name: "user" };
console.log(Object.getOwnPropertyDescriptor(object, "name"));
console.log(Object.getOwnPropertyDescriptors(object));
console.log(Object.keys(object));
console.log(Object.values(object));

/*
writable: Can the value be changed ?
enumerable: Will it show up in loops ?
configurable : Can it be deleted or changed later ? */

const obj1 = {};
Object.defineProperty(obj1, "id", {
    value: 33,
    enumerable: false
});

obj1.age = 28;
for (let v in obj1) {
    console.log(v, obj1[v]);
}

console.log(obj1.id);
