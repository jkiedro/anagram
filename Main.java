import java.util.Scanner;
public class Main {

    static char[] buble_sort(String word) {
        char[] arr_word = word.toCharArray();

        int temp;

        for (int i = 0; i < arr_word.length - 1; i++) {
            for (int j = 0; j < arr_word.length - 1; j++) {
                if (arr_word[j] > arr_word[j + 1]) {
                    temp = arr_word[j];
                    arr_word[j] = arr_word[j + 1];
                    arr_word[j + 1] = (char) temp;
                }
            }
        }
        return arr_word;
    }

    static void comp(String word1, String word2) {
        if (word1.length() == word2.length()) {
            char[] chars1 = buble_sort(word1);
            char[] chars2 = buble_sort(word2);
            for (int x = 0; x < word1.length(); x++) {
                if (chars1[x] != chars2[x]) {
                    System.out.println("Podany wyraz NIE jest anagramem.");
                }
            }
            System.out.println("Podany wyraz jest anagramem.");
        } else {
            System.out.println("Podany wyraz NIE jest anagramem.");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszy wyraz:");
        String word1 = scan.nextLine();
        System.out.println("Podaj drugi wyraz:");
        String word2 = scan.nextLine();

       Main.comp(word1, word2);
    }
}
