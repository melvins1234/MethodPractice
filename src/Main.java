import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();


        System.out.println("Total of words: " + countWords(inputString));
        System.out.println("Total of vowels: " + countVowel(inputString));
    }
    public static int countWords(String words){
//        String[] wordsSplit = words.split("\\s+");
//        return wordsSplit.length;
        return words.split("\\s+").length;
    }
    public static int countVowel(String words){
        String[] vowels = {"a","e","i","o","u"};
        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            for (String letter : vowels){
                if (String.valueOf(words.charAt(i)).equals(letter))
                    count++;
            }
        }
        return count;
    }
}
