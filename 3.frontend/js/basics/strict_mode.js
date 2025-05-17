console.log("JavaScript Strict Mode");
console.log("This demonstrates the use of strict mode in JavaScript and why undeclared variables cause errors.\n");

// Example 1: Without Strict Mode
console.log("Example 1: Without Strict Mode");

function withoutStrictMode() {
    try {
        // Without strict mode, this creates a global variable (bad practice)
        undeclaredVar = "I'm not declared, but I work without strict mode";
        console.log("Without strict mode: " + undeclaredVar);
        return true;
    } catch(error) {
        console.log("Error: " + error.message);
        return false;
    }
}

const resultWithoutStrict = withoutStrictMode();
console.log("Code executed successfully? " + resultWithoutStrict);

// Example 2: With Strict Mode
console.log("\nExample 2: With Strict Mode");

function withStrictMode() {
    "use strict"; // Enable strict mode for this function
    
    try {
        // With strict mode, this will cause an error
        undeclaredVarInStrict = "This will cause an error";
        console.log("This line won't be reached");
        return true;
    } catch(error) {
        console.log("Error with strict mode: " + error.message);
        console.log("This demonstrates that undeclared variables are not allowed in strict mode");
        return false;
    }
}

const resultWithStrict = withStrictMode();
console.log("Code executed successfully? " + resultWithStrict);

// Example 3: Global Strict Mode
console.log("\nExample 3: Global Strict Mode");
console.log("We will demonstrate strict mode in a separate function to simulate a separate script");

function demonstrateGlobalStrictMode() {
    "use strict"; // Enable strict mode for this function
    
    try {
        // This will cause an error in strict mode
        globalUndeclaredVar = "This will throw an error";
        console.log("This line won't be reached");
    } catch(error) {
        console.log("Error in global strict mode: " + error.message);
    }
}

demonstrateGlobalStrictMode();
