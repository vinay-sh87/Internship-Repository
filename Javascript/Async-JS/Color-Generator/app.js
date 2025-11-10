const startBtn = document.getElementById("start");
const stopBtn = document.getElementById("stop");
const box = document.getElementById("box");

const generatecolor = () => {
    let hex = "0123456789ABCDEF";
    let color = "#";
    for (let i = 0; i < 6; i++) {
        color += hex[Math.floor(Math.random() * hex.length)];
    }
    box.style.backgroundColor = color;
};

let intervalId;
startBtn.addEventListener("click", () => {
    intervalId = setInterval(generatecolor, 1000);
});
stopBtn.addEventListener("click", () => {
    clearInterval(intervalId);
});