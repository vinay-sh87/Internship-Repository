const container = document.createElement('div');
container.setAttribute('id', 'container');
document.body.appendChild(container);
console.log(container.id);
container.style.marginTop = '2rem';

const heading = document.createElement('h1');
heading.innerHTML = 'Heading inserted from the script...';
container.appendChild(heading);
heading.style.fontSize = '2.25rem';
heading.style.textTransform = 'capitalize';
// heading.style.backgroundColor = "black";
// heading.style.color = "white";
heading.style.padding = "1rem";
heading.style.boxShadow = '2px 2px 5px black';


const text = document.createElement('p');
text.innerHTML = `Paragraph inserted from the script...`;
container.appendChild(text);
text.style.paddingTop = '5px';



