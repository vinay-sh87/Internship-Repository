async function fetchData() {
    try {
        const response = await fetch('https://api.example.com/data');

        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        const data = await response.json();

        const list = document.getElementById('user-list');
        data.forEach((user) => {
            const listItem = document.createElement('li');
            listItem.textContent = `${user.name} - ${user.email}`;
            list.appendChild(listItem);
        });
    } catch (error) {
        console.error("Error fetching data: ", error)
    }
}