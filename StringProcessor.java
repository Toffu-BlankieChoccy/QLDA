public class StringProcessor {
    private String inputString;

    public StringProcessor(String inputString) {
        this.inputString = inputString;
    }

    public String toUppercase() {
        return inputString.toUpperCase();
    }

    public String toLowercase() {
        return inputString.toLowerCase();
    }

    public String reverseCase() {
        char[] charArray = inputString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String(charArray);
    }

    public int findSubstring(String substring) {
        return inputString.indexOf(substring);
    }

    public String extractSubstring(int start, int end) {
        return inputString.substring(start, end);
    }

    public String replaceSubstring(String oldSubstring, String newSubstring) {
        return inputString.replace(oldSubstring, newSubstring);
    }

    public boolean isPalindrome() {
        String reversedString = new StringBuilder(inputString).reverse().toString();
        return inputString.equals(reversedString);
    }

    public int countWords() {
        String[] words = inputString.split("\\s+");
        return words.length;
    }

    public void characterFrequency() {
        int[] frequency = new int[256]; // Assuming ASCII characters
        for (char c : inputString.toCharArray()) {
            frequency[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println("Character '" + (char) i + "': " + frequency[i] + " times");
            }
        }
    }

  public class Main {
    public static void main(String[] args) {
        String inputText = "Hello, World!";
        StringProcessor processor = new StringProcessor(inputText);

        String uppercaseText = processor.toUppercase();
        System.out.println("Uppercase: " + uppercaseText);

        String lowercaseText = processor.toLowercase();
        System.out.println("Lowercase: " + lowercaseText);

        String reversedText = processor.reverseCase();
        System.out.println("Reversed Case: " + reversedText);

        String substringToFind = "World";
        int index = processor.findSubstring(substringToFind);
        System.out.println("Index of '" + substringToFind + "': " + index);

        int startIndex = 7;
        int endIndex = 12;
        String extractedText = processor.extractSubstring(startIndex, endIndex);
        System.out.println("Extracted substring: " + extractedText);

        String oldSubstring = "Hello";
        String newSubstring = "Hi";
        String replacedText = processor.replaceSubstring(oldSubstring, newSubstring);
        System.out.println("Replaced Substring: " + replacedText);


        boolean isPalindrome = processor.isPalindrome();
        System.out.println("Is Palindrome: " + isPalindrome);


        int wordCount = processor.countWords();
        System.out.println("Word Count: " + wordCount);


        System.out.println("Character Frequency:");
        processor.characterFrequency();

    }
}

}
