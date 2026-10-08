import java.util.Scanner;

public class Q28WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String text = sentence.trim();

        int wordCount = 0;

        if (!text.isEmpty()) {
            String[] words = text.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Language: " + language);
        System.out.println("Number of Words: " + wordCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q28WordCounter w = new Q28WordCounter();

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        w.countWords(sentence);

        sc.close();
    }
}