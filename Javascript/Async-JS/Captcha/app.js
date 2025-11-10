const button = document.getElementById("generate-btn");
function generateCaptcha() {
    const capt = document.querySelector(".captcha");
    const array = [
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z",
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "0",
    ];
    let captcha = "";
    let stored = [];
    for (let i = 0; i < 5; i++) {
        // captcha += array[Math.floor(Math.random()*array.length)];
        stored.push(array[Math.floor(Math.random() * array.length)]);
    }
    captcha = stored.join("");
    capt.innerHTML = captcha.toUpperCase();
    console.log(stored);
    button.disabled = true;
    setTimeout(() => {
        button.disabled = false;
    }, 2000);
}

button.addEventListener("click", generateCaptcha);
setTimeout(generateCaptcha, 3000);