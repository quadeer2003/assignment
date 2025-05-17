import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet of type String with at least 10 elements
        HashSet<String> programmingLanguages = new HashSet<>();
        
        // Adding elements to HashSet
        System.out.println("1. Adding elements to HashSet:");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("Go");
        programmingLanguages.add("Swift");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Scala");
        
        // Display the HashSet
        System.out.println("\nProgramming Languages HashSet: " + programmingLanguages);
        
        // Size of HashSet
        System.out.println("\n2. Size of HashSet:");
        System.out.println("Size: " + programmingLanguages.size());
        
        // Check if an element exists in HashSet
        System.out.println("\n3. Checking if an element exists:");
        boolean hasJava = programmingLanguages.contains("Java");
        System.out.println("Contains 'Java'? " + hasJava);
        
        boolean hasRust = programmingLanguages.contains("Rust");
        System.out.println("Contains 'Rust'? " + hasRust);
        
        // Remove an element from HashSet
        System.out.println("\n4. Removing an element:");
        boolean removedPHP = programmingLanguages.remove("PHP");
        System.out.println("Removed 'PHP'? " + removedPHP);
        System.out.println("HashSet after removal: " + programmingLanguages);
        
        // Iterate through HashSet using Iterator
        System.out.println("\n5. Iterating through HashSet using Iterator:");
        Iterator<String> iterator = programmingLanguages.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Iterate through HashSet using enhanced for loop
        System.out.println("\n6. Iterating through HashSet using enhanced for loop:");
        for (String language : programmingLanguages) {
            System.out.println(language);
        }
        
        // Add duplicate element (HashSet doesn't allow duplicates)
        System.out.println("\n7. Trying to add a duplicate element:");
        boolean addedDuplicate = programmingLanguages.add("Java");
        System.out.println("Added duplicate 'Java'? " + addedDuplicate);
        System.out.println("HashSet after trying to add duplicate: " + programmingLanguages);
        
        // Create another HashSet
        HashSet<String> webLanguages = new HashSet<>();
        webLanguages.add("JavaScript");
        webLanguages.add("PHP");
        webLanguages.add("HTML");
        webLanguages.add("CSS");
        System.out.println("\nWeb Languages HashSet: " + webLanguages);
        
        // Union of two HashSets
        System.out.println("\n8. Union of two HashSets:");
        HashSet<String> unionSet = new HashSet<>(programmingLanguages);
        unionSet.addAll(webLanguages);
        System.out.println("Union Set: " + unionSet);
        
        // Intersection of two HashSets
        System.out.println("\n9. Intersection of two HashSets:");
        HashSet<String> intersectionSet = new HashSet<>(programmingLanguages);
        intersectionSet.retainAll(webLanguages);
        System.out.println("Intersection Set: " + intersectionSet);
        
        // Difference of two HashSets
        System.out.println("\n10. Difference of two HashSets:");
        HashSet<String> differenceSet = new HashSet<>(programmingLanguages);
        differenceSet.removeAll(webLanguages);
        System.out.println("Difference Set (Programming Languages - Web Languages): " + differenceSet);
        
        // Check if HashSet is empty
        System.out.println("\n11. Checking if HashSet is empty:");
        boolean isEmpty = programmingLanguages.isEmpty();
        System.out.println("Is empty? " + isEmpty);
        
        // Clear the HashSet
        System.out.println("\n12. Clearing the HashSet:");
        programmingLanguages.clear();
        System.out.println("HashSet after clearing: " + programmingLanguages);
        System.out.println("Is empty now? " + programmingLanguages.isEmpty());
        
        // Create HashSet from another collection
        System.out.println("\n13. Creating HashSet from another collection:");
        HashSet<String> newHashSet = new HashSet<>(webLanguages);
        System.out.println("New HashSet created from web languages: " + newHashSet);
    }
} 