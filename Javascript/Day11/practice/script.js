const input = document.getElementById('inputBox');
const output = document.getElementById('keys-output');

input.addEventListener('keydown', (event) => {
    output.innerHTML = `Key Pressed: ${event.key}`;
});
input.addEventListener('keyup', (event) => {
    output.innerHTML += `<br>Key Released: ${event.key}
    <br>Key Code: ${event.keyCode}`;
});


// const searchBox = document.getElementById('searchBox');
// const items = document.querySelectorAll('#itemList li');
// const list = document.getElementById('itemList');


// searchBox.addEventListener('keyup', (event) => {
//     const searchText = event.target.value.toLowerCase();

//     items.forEach((item, index) => {
//         const text = item.textContent.toLowerCase();
//         console.log(text.includes(searchText));
//         if (text.includes(searchText)) {
//             item.classList.remove('hide');
//         } else {
//             item.classList.add('hide');
//         }
//     })
// });

// using js to show items
const items = ['Apple', 'Banana', 'Orange', 'Pineapple', 'Watermelon', 'Strawberry'];
const searchBox = document.getElementById('searchBox');
const listContainer = document.getElementById('itemList');


const displayFilterItems = (searchText) => {
    listContainer.innerHTML = '';
    if(searchText.trim() === '') return;
    const filteredItems = items.filter(item => item.toLowerCase().includes(searchText));
    filteredItems.forEach(item => {
        const li = document.createElement('li');
        li.textContent = item;
        listContainer.appendChild(li);
    });

    if (filteredItems.length === 0) {
        const li = document.createElement('li');
        li.textContent = 'No items found';
        listContainer.appendChild(li);
    }
}

searchBox.addEventListener('keyup', (event) => {
    const searchText = event.target.value.toLowerCase();
    displayFilterItems(searchText);
});

