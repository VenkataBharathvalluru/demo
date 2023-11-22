import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String resultString = removeDuplicates(inputString);
        
        System.out.println("String after removing duplicate words: " + resultString);
        
        scanner.close();
    }

    private static String removeDuplicates(String inputString) {
        String[] words = inputString.split("\\s+");
        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Ignore case for comparison
        }

        StringBuilder result = new StringBuilder();
        Iterator<String> iterator = uniqueWords.iterator();

        while (iterator.hasNext()) {
            result.append(iterator.next());
            if (iterator.hasNext()) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}