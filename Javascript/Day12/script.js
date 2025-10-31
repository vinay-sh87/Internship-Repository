// form events 
// submit, change, focus, blur 

const input = document.getElementById('inputBox');
const btn = document.getElementById('click-btn');

btn.addEventListener('click', () => {
    console.log(input.value);
})


const form = document.getElementById('formactions');
const name = document.getElementById('name');
const age = document.getElementById('age');
const email = document.getElementById('email');
const message = document.getElementById('message');
const output = document.getElementById('output');

const users = [];
let idCount = 1;

form.addEventListener('submit', (event) => {
    console.log(name.value);
    console.log(age.value);
    console.log(email.value);
    console.log(message.value);
    users.push({
        id: idCount++,
        name: name.value,
        age: age.value,
        email: email.value,
        message: message.value
    });
    console.log(users);
    output.innerHTML += `<p>ID: ${idCount - 1}, Name: ${name.value}, Age: ${age.value}, Email: ${email.value}, Message:  ${message.value}</p>`
    event.preventDefault();
});

const courses = document.getElementById('courses');
const result = document.getElementById('result');

courses.addEventListener('change',(event)=>{
    result.innerHTML = `Selected: ${courses.value}`;
    console.log(event.target.value);
})

form.addEventListener('focus',(event)=>{
    console.log(`Focused on: ${event.target.id}`);
},true);

form.addEventListener('blur',(event)=>{
    console.log(`Blurred on: ${event.target.id}`);
},true);