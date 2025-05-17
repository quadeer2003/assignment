// Example 1: Variable Hoisting with var
console.log("Example 1: Variable Hoisting with var");

// Using the variable before declaration
console.log("Value of x before declaration: " + x); // Will output "undefined"

// Variable declaration happens after usage
var x = 10;

console.log("Value of x after declaration: " + x); // Will output "10"

// Example 2: Variable Hoisting in Functions
console.log("\nExample 2: Variable Hoisting in Functions");

function demoHoisting() {
    // Using y before declaration
    console.log("Value of y inside function before declaration: " + y); // Will output "undefined"
    
    // Declaring and initializing y
    var y = 20;
    
    console.log("Value of y inside function after declaration: " + y); // Will output "20"
}

demoHoisting();

// Example 3: Function Hoisting
console.log("\nExample 3: Function Hoisting");

// Calling the function before declaration
console.log("Calling hoistedFunction before its declaration: " + hoistedFunction()); // Will work

// Function declaration (gets hoisted)
function hoistedFunction() {
    return "This function was called before its declaration";
}

// Example 4: let and const (Not Hoisted the Same Way)
console.log("\nExample 4: let and const (Not Hoisted the Same Way)");

console.log("Variables declared with 'let' and 'const' are hoisted but not initialized.");
console.log("They are in a 'temporal dead zone' until the declaration is reached.");

// This would cause a ReferenceError if uncommented:
// console.log("Value of z before declaration: " + z);

let z = 30;
console.log("Value of z after declaration: " + z);

// What's Happening Behind the Scenes
console.log("\nWhat's Happening Behind the Scenes");
console.log("When JavaScript processes the code, it moves all declarations to the top of their scope:");

console.log("// What you write:");
console.log("console.log(a);");
console.log("var a = 5;");

console.log("\n// How JavaScript processes it:");
console.log("var a;");
console.log("console.log(a); // undefined");
console.log("a = 5;");

console.log("\nThis is why variables used before declaration are undefined, not errors (with var)."); 