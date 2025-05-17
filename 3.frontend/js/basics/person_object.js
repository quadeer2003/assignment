// Creating a person object with firstname and lastname properties
const person = {
    firstname: "John",
    lastname: "Doe"
};

// Method 1: Accessing object properties using dot notation
console.log("Method 1: Dot Notation");
console.log(`First Name: ${person.firstname}`);
console.log(`Last Name: ${person.lastname}`);
console.log(`Full Name: ${person.firstname} ${person.lastname}`);

// Method 2: Accessing object properties using bracket notation
console.log("\nMethod 2: Bracket Notation");
console.log(`First Name: ${person["firstname"]}`);
console.log(`Last Name: ${person["lastname"]}`);
console.log(`Full Name: ${person["firstname"]} ${person["lastname"]}`);

// Demonstrating a benefit of bracket notation - using variables as property names
console.log("\nBonus: Using Variables with Bracket Notation");

const firstProperty = "firstname";
const secondProperty = "lastname";

console.log(`Accessing with variable (${firstProperty}): ${person[firstProperty]}`);
console.log(`Accessing with variable (${secondProperty}): ${person[secondProperty]}`);

// Demonstrating adding a new property using both methods
console.log("\nAdding New Properties");

// Adding with dot notation
person.age = 30;
console.log(`Added 'age' with dot notation: ${person.age}`);

// Adding with bracket notation
person["email"] = "john.doe@example.com";
console.log(`Added 'email' with bracket notation: ${person["email"]}`);

// Displaying the final object
console.log("\nFinal Person Object:");
console.log(JSON.stringify(person, null, 2)); 