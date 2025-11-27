// getting element by id 
const mainDiv = document.getElementById('main');
console.log(mainDiv);

// getting element by class name 
const textElements = document.getElementsByClassName('text');
console.log(textElements); // html collection of all elements having class name text

// getting elements by tag name 
const paragraphs = document.getElementsByTagName('p');
console.log(paragraphs); // html collection of all p elements

// using querySelector : gets the first matching element
const firstPara = document.querySelector('.text');
const mainDiv2 = document.querySelector('#main');
console.log(firstPara);
console.log(firstPara.textContent);

const newPara = document.createElement('p');
newPara.textContent = "New Paragraph";
newPara.classList.add('text');
mainDiv2.appendChild(newPara)
console.log(mainDiv2);

// using querySelectorAll : gets all the matching elements 
const allParas = document.querySelectorAll('.text');
console.log(allParas.item(0)); // first item
console.log(allParas.item(1).textContent); // second item


// reading and changing text 
const heading = document.querySelector('h1');
console.log(heading.textContent);

// innerHTML vs textContent 
const div = document.querySelector("#main");
div.textContent = "plain text..."; // sets only text
div.innerHTML = "<h2>h2 heading</h2>"; // sets html content


// working with attributes 
const element = document.querySelector("#main");

// get attribute
console.log(element.getAttribute("id"));

// set attribute 
element.setAttribute('class', 'main-div');
console.log(element.getAttribute("class"));

// check if attibute exists 
console.log(element.hasAttribute("id"));

// remove attribute 
element.removeAttribute('class');
console.log(element.hasAttribute('class'));


// working with classes 
const element2 = document.querySelector('.para');

// add a class 
element2.classList.add('highlight');
console.log(element2.hasAttribute('class'));
console.log(element2.getAttribute('class'));

// remove a class 
element2.classList.remove('highlight');
console.log(element2.getAttribute('class'));

// toggle a class : add if missing and remove if present 
element2.classList.toggle('highlight');
console.log(element2.getAttribute('class'));

// check if class exists
console.log(element2.classList.contains('highlight'));

// set attribute
const box = document.querySelector('.box');
box.setAttribute('class', 'styled');
console.log(box.getAttribute('class')); 
console.log(box.classList.contains('styled'));

// check if attribute exits
console.log(box.hasAttribute('id'));
box.setAttribute('id','box1');
console.log(box.hasAttribute('id'));

// remove attribute 
box.removeAttribute('id');
console.log(box.hasAttribute('id'));



// Creating New Elements and Inserting into DOM
// creating elements
const link = document.createElement('a');
link.textContent = "Go to Flipkart";
link.setAttribute('href', 'https://www.flipkart.com');
link.setAttribute('target','_blank');
link.setAttribute('alt','Flipkart Website');
link.classList.add('link')

// ways to insert into DOM 
box.appendChild(link); // at the end
box.prepend(link); // at the beginning
const lines = document.querySelectorAll('.line');
lines[0].before(link); // before the element
lines[0].after(link); // after the element

lines[1].replaceWith(link); // replace the element



// Traversing the DOM
const list = document.querySelector('.list-items');
console.log(list.parentElement);
console.log(list.parentNode);
console.log(list.children);
console.log(list.children[0]);
console.log(list.firstElementChild);
console.log(list.lastElementChild);

console.log(list.previousSibling);
console.log(list.previousElementSibling);
console.log(list.nextSibling);
console.log(list.nextElementSibling);


// traversal example
const activeItem = document.querySelector('.active');

console.log(activeItem.parentElement);
console.log(activeItem.nextElementSibling.textContent);
console.log(activeItem.nextElementSibling.previousElementSibling.textContent);