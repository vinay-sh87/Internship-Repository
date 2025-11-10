const stopBtn = document.getElementById('stop');

setTimeout(() => {
    for (let i = 0; i < 10; i++) {
        const output = setTimeout(() => {
            console.log(i);
        }, i * 1000);
        stopBtn.addEventListener('click', () => {
            clearTimeout(output);
        });
    }
}, 5000); // time in miliseconds : executes the callback after the time passed


let count = 0;
const interval = setInterval(() => {
    console.log(++count);
}, 1000);
stopBtn.addEventListener('click', () => {
    clearInterval(interval);
});

