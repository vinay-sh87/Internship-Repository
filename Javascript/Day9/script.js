// DOM Manipulation -- selecting and modifying elements in the document object model (DOM) using JavaScript

// 1. getElementById() - selects a single element by its relevent id
let heading = document.getElementById("head-one");
console.log(heading); // Outputs: <h1 id="head-one">Main Heading</h1>
console.log(heading.textContent); 
heading.textContent = "Updated Main Heading";
heading.style.color = "teal";

// 2. querySelector() - selects the first element that matches a specified CSS selector
let secondHeading = document.querySelector(".box1 h1");
console.log(secondHeading.textContent); // Outputs: <h1>Second Heading</h1>

// 3. querySelectorAll() - selects all the elements that match a specified css selector and returns a node list
let texts = document.querySelectorAll(".text");
texts.forEach((text)=>{
    text.style.fontSize = "20px";
    text.style.color = "#fff";
    text.style.backgroundColor = "black";
    text.style.padding = "10px";
    text.style.textAlign = "center";
    text.style.borderRadius = "5px";
    text.style.letterSpacing = "0.5px";
});
console.log(texts); // Outputs: NodeList(4) [p.text, p.text, p.text]

// 4. getElementsByClassName() - selects all elements with the specified class name and returns an HTMLCollection
let boxes = document.getElementsByClassName("box");
console.log(boxes); // Outputs: HTMLCollection(4)
console.log(boxes[0].innerHTML); // Outputs: <h1>Second Heading</h1><p class="text">This is the second paragraph.</p> 
boxes[0].style.border = "2px solid black";

let count = 0;
Array.from(boxes).forEach((box)=>{ // Converting HTMLCollection to Array to use forEach
    box.innerHTML = `Box ${++count}`;
});
console.log(boxes); // Outputs: HTMLCollection(4)

