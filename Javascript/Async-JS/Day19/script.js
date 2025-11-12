// old way 
// new Promise((resolve, reject) => {
//     fetch('https://api.github.com/users/vinay-sh87')
//         .then((response) => {
//             return response.json();
//         })
//         .then((data) => {
//             resolve(data);
//         })
//         .catch((error) => {
//             reject(error);
//         })
// })
//     .then((data) => {
//         console.log(data);
//     })
//     .catch((error) => {
//         console.log(error);
//     })



// // new way 
// async function getUser() {
//     const response = await fetch('https://api.github.com/users/vinay-sh87');
//     const data = await response.json();
//     console.log(data);
//     return data;
// }
// const user = getUser();
// console.log(user.name);


const name = document.getElementById('name');
const bio = document.getElementById('bio');
const locate = document.getElementById('location');
const company = document.getElementById('companyName');
const userInput = document.getElementById('userInput');
const searchBtn = document.getElementById('fetchBtn');

const fetchInfo = async () => {
    if (!userInput.value.trim()) {
        alert('Please enter a username');
        return;
    }
    const url = `https://api.github.com/users/${userInput.value}`;
    try {
        const response = await fetch(url);
        if (!response.ok) throw new Error("User not found");
        const data = await response.json();
        name.textContent = data.name || 'N/A';
        bio.textContent = data.bio || 'No bio found';
        locate.textContent = data.location || 'No location available';
        company.textContent = data.company || 'N/A company info';
        localStorage.setItem('inputValue', JSON.stringify(userInput.value));
    }
    catch (error) {
        name.textContent = 'User not found';
        bio.textContent = '';
        locate.textContent = '';
        company.textContent = '';
    }
}

if (localStorage.getItem('inputValue')) {
    userInput.value = JSON.parse(localStorage.getItem('inputValue'));
    fetchInfo();
}

searchBtn.addEventListener('click', () => {
    fetchInfo();
});
