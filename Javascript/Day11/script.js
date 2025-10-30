const btn = document.getElementById('clickme');

btn.onclick = () => {
    console.log("clicked!");
}

btn.addEventListener('click', (event) => {
    console.log('clicked');
    console.log(event.clientX);
})

document.addEventListener('mousemove', (e) => {
    console.log(e.clientX);
})


const name = document.getElementById('name');
const email = document.getElementById('email');
const phone = document.getElementById('phone');
const id = document.getElementById('id');
const output = document.querySelector('.output');

const submit = document.getElementById('submit-btn');

submit.addEventListener('click', (event) => { /* dblclick -- on double click */
    event.preventDefault(); /* stops the default behaviour for an event */
    output.innerHTML = `
    <p>Name : ${name.value}</p>
    <p>Email : ${email.value}</p>
    <p>Phone : ${phone.value}</p>
    <p>Id : ${id.value}</p>`;
    setTimeout(() => {
        output.innerHTML = ''
    }, 3000);
});

const box = document.getElementById('box');
box.addEventListener('mouseover', (event) => {
    box.style.backgroundColor = 'crimson';
    box.innerHTML = `X position : ${event.clientX} <br> Y position : ${event.clientY} <br> Width: ${box.offsetWidth} <br> Height: ${box.offsetHeight}`;

});
box.addEventListener('mouseout', () => {
    box.style.backgroundColor = 'black';
    box.innerHTML = 'Box';
});

box.addEventListener('mousedown', () => {
    console.log("Mouse Clicked!");
})
box.addEventListener('mouseup', () => {
    console.log("Mouse Up!");
})

// addEventListener('submit', (event) => {
//     event.preventDefault();
//     console.log("Form Submitted!");
// });