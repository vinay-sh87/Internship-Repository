// API --> API stands for Application Programming Interface it is a way used to communicate between two servers 

// Promise --> Promise in javascript is an object that represents the eventual completion or failure of an asynchronous operation. 

const promise = new Promise((resolve, reject) => {
    const status = true;
    if (status) {
        resolve();
    } else {
        reject();
    }
});
promise.then(() => {
    console.log("Resolved")
}).catch(() => {
    console.log("Rejected")
});

const evenCheck = new Promise((res, rej) => {
    let number = 23;
    if (number % 2 == 0) {
        res();
    } else {
        rej();
    }
});
evenCheck.then(() => {
    console.log("Number is even");
}).catch(() => {
    console.log("Number is odd");
})

const user = new Promise((res, rej) => {
    fetch("https://api.github.com/users/vinay-sh87")
        .then((response) => {
            console.log(response);
            let data = response.json();
            console.log(data)
        }).catch((error) => {
            console.log(error);
        });
});


