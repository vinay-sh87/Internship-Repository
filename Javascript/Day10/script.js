const heading = document.getElementById('heading');
heading.textContent = 'Heading inserted from the script...';

const text = document.getElementById('paragraph')
text.innerHTML = "paragraph inserted from the script...";
text.innerHTML = `<b>Hello</b> <span style="display:none;">Hidden</span> World`;
console.log(text.innerHTML); // HTML inside the element
console.log(text.innerText); // visible texts only
console.log(text.textContent); // reads all the text


const container = document.querySelector('.container');
container.innerHTML = `<div class="input-group"><label>Name: <input type="text" class="name"></label></div>
<div class="input-group"><label>Email: <input type="email" class="email"></label></div>
`;

const input = document.querySelector('.name');
input.addEventListener('keyup', (event) => {
    if(event.key === 'Enter' || event.key === 'Escape' || event.key === 'Tab'){
        console.log(input.value);
        const name = document.createElement('p');
        name.innerHTML = `Name: ${input.value}`;
        container.appendChild(name);
        input.value = '';
    }
    console.log(event.key); 
})