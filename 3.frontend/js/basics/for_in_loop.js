// Example 1: Using for/in with an object
console.log("For/In Loop with an Object:");

const person = {
    firstName: "John",
    lastName: "Doe",
    age: 30,
    occupation: "Developer",
    country: "USA"
};

console.log("Properties of the person object:");
for (let property in person) {
    console.log(`${property}: ${person[property]}`);
}

// Example 2: Using for/in with an array
console.log("\nFor/In Loop with an Array:");

const colors = ["Red", "Green", "Blue", "Yellow", "Purple"];

console.log("Indices and values of the colors array:");
for (let index in colors) {
    console.log(`Index ${index}: ${colors[index]}`);
}

// Example 3: Inherited properties
console.log("\nFor/In Loop with Inherited Properties:");

// Creating a constructor function
function Vehicle(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
}

// Adding a method to the prototype
Vehicle.prototype.getDescription = function() {
    return `${this.year} ${this.make} ${this.model}`;
};

// Creating an instance
const myCar = new Vehicle("Toyota", "Corolla", 2020);

console.log("Properties of myCar object (including inherited):");
for (let prop in myCar) {
    console.log(`${prop}: ${typeof myCar[prop]}`);
}

// Example 4: Using hasOwnProperty to filter out inherited properties
console.log("\nUsing hasOwnProperty with For/In Loop:");

console.log("Own properties of myCar object (excluding inherited):");
for (let prop in myCar) {
    if (myCar.hasOwnProperty(prop)) {
        console.log(`${prop}: ${myCar[prop]}`);
    }
} 