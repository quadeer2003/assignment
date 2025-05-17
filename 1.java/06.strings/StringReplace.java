class StringReplace {
    public static void main(String[] args) {
        String name = "mohammad abdul quadeer";
        System.out.println("Original string: " + name);
        
        // 1. replace(char oldChar, char newChar) - replaces all occurrences of a character
        String replacedA = name.replace('a', 'A');
        System.out.println("After replacing 'a' with 'A': " + replacedA);
        
        // 2. replace(CharSequence target, CharSequence replacement) - replaces all occurrences of a substring
        String replacedAbdul = name.replace("abdul", "ABDUL");
        System.out.println("After replacing \"abdul\" with \"ABDUL\": " + replacedAbdul);
        
        // 3. replaceFirst(String regex, String replacement) - replaces the first occurrence matching the regex
        String replaceFirstA = name.replaceFirst("a", "A");
        System.out.println("After replacing first 'a' with 'A': " + replaceFirstA);
        
        // 4. replaceAll(String regex, String replacement) - replaces all occurrences matching the regex
        String replacedSpaces = name.replaceAll(" ", "-");
        System.out.println("After replacing all spaces with hyphens: " + replacedSpaces);
        
        // 5. replaceAll with regex character classes
        String noVowels = name.replaceAll("[aeiou]", "*");
        System.out.println("After replacing all vowels with '*': " + noVowels);
        
        // 6. Chained replacement
        String chainedReplacement = name.replace('m', 'M').replace('a', 'A').replace('q', 'Q');
        System.out.println("After chained replacements: " + chainedReplacement);
        
        // 7. Replacing multiple characters with replaceAll
        String replacedMultiple = name.replaceAll("[md]", "X");
        System.out.println("After replacing 'm' and 'd' with 'X': " + replacedMultiple);
        
        // 8. Case-insensitive replacement using regex
        String caseInsensitiveReplacement = name.replaceAll("(?i)m", "X");
        System.out.println("After case-insensitive replacement of 'm': " + caseInsensitiveReplacement);
        
        // 9. Replacing a substring that occurs multiple times
        String repeatedSubstring = "mohammad abdul mohammad quadeer mohammad";
        String replacedRepeated = repeatedSubstring.replace("mohammad", "M");
        System.out.println("\nOriginal repeated string: " + repeatedSubstring);
        System.out.println("After replacing all occurrences of \"mohammad\": " + replacedRepeated);
        
        // 10. Replace to remove characters
        String removeChar = name.replace("a", "");
        System.out.println("\nAfter removing all 'a' characters: " + removeChar);
    }
} 