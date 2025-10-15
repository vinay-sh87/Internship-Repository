// object 
const employee = {
    name: "Iron Man",
    age: 45,
    salary: 1000000,
    location: {
        city: "New York",
        state: "NY",
        country: "USA",
        planet: "Earth"
    }
};
console.log(employee.name);
console.log(employee["age"]);
console.log(employee.location.city);
console.log(employee.location["planet"]);

employee.location.planet = "Mars";
console.log(employee.location.planet);

employee["profession"] = "Actor";
console.log(employee);

delete employee.age;
console.log(employee);

const emp = { ...employee }; // copying employee object
console.log(emp);

delete emp.salary;
console.log(emp);
console.log(employee);


const student = {
    name: "Abhishek",
    age: 20,
    branch: 'CS',
    address: {
        city: "Lucknow",
        country: "India"
    },
    subjects: ["Operating System", "DSA", "DBMS"]
}
console.log(student);
console.log(student.subjects[0]);


// function 
function listItems(items) { // items : parameter
    let total = 0;
    for (let i = 0; i < items.length; i++) {
        console.log(`${i + 1}. ${items[i].item}`);
        total += items[i].price;
    }
    console.log(`Total: ${total}`);
}

const cart = [{ item: "Backpack", price: 2300 },
{ item: "Shoes", price: 2000 },
{ item: "Bluetooth Speaker", price: 3500 },
{ item: "Watch", price: 1500 }];
listItems(cart); // function  call (cart : argument)

/* 
hoisting -- JavaScript moves declarations to the top of their scope(before code execution)
temporal dead zone -- The Temporal Dead Zone is the time period between when a variable is hoisted and when it is initialized. */

