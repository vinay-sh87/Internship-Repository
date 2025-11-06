const generateBtn = document.getElementById('generate-qr');
const qrCode = document.getElementById('qr-code');

generateBtn.addEventListener('click', async (event) => {
    const input = document.getElementById('text-field');
    const url = `https://api.qrserver.com/v1/create-qr-code/?size=150x150&data=${input.value}`;
    console.log(url);

    qrCode.innerHTML = '';

    const qrImage = document.createElement('img');
    qrImage.src = url;
    qrCode.appendChild(qrImage);
    const id = Date.now().toString();
    localStorage.setItem(id, url);
    
    let ids = JSON.parse(localStorage.getItem('ids')) || [];
    ids.push(id);
    localStorage.setItem('ids', JSON.stringify(ids));
    ids.forEach(id => {
        console.log(localStorage.getItem(id));
    });

    input.value = '';
});