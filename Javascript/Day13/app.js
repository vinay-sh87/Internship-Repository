const display = (text) => {
    console.log(text);
}

const sum = (first, second, callback, callback2) => {
    const result = first + second;
    callback(result);
    callback2();
}

const sayHii = () => {
    console.log("Hii");
}

sum(10, 20, display, sayHii);


const runTask = (task, onSuccess, onComplete) => {
    console.log("⏳ Running task...");
    setTimeout(() => {
        const result = task();
        onSuccess(result);
        if (onComplete) onComplete();
    }, 1000);
};

runTask(
    () => 10 + 20,
    (result) => console.log("Result:", result),
    () => console.log("All done! 🎉")
);



// 🌟 CallbackRunner Library
class CallbackRunner {
    constructor(task) {
        this.task = task;       // The main function to execute
        this.onSuccess = null;  // Called when task completes successfully
        this.onError = null;    // Called if an error occurs
        this.onComplete = null; // Always runs at the end
    }

    // Register the success callback
    success(callback) {
        this.onSuccess = callback;
        return this; // enables chaining
    }

    // Register the error callback
    error(callback) {
        this.onError = callback;
        return this; // enables chaining
    }

    // Register a final callback (always runs)
    complete(callback) {
        this.onComplete = callback;
        return this; // enables chaining
    }

    // Run the task
    run() {
        console.log("🚀 Running task...");

        try {
            const result = this.task(); // Execute the main function

            if (this.onSuccess) {
                this.onSuccess(result);
            }
        } catch (err) {
            if (this.onError) {
                this.onError(err);
            } else {
                console.error("⚠️ Unhandled error:", err);
            }
        } finally {
            if (this.onComplete) {
                this.onComplete();
            }
        }
    }
}



// A sample task
const addNumbers = () => {
    const a = 10, b = 20;
    return a + b;
};

// Create a runner for it
new CallbackRunner(addNumbers)
    .success((result) => console.log("✅ Success! Result =", result))
    .error((err) => console.log("❌ Error:", err.message))
    .complete(() => console.log("🎯 Task finished!\n"))
    .run();

// Example with an error
new CallbackRunner(() => {
    throw new Error("Something went wrong!");
})
    .success((result) => console.log("✅ Result:", result))
    .error((err) => console.log("🔥 Caught error:", err.message))
    .complete(() => console.log("🎯 Task finished (with error)\n"))
    .run();
