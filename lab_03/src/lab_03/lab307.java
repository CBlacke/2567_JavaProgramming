package lab_03;
import java.util.*;
public class lab307 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


        System.out.print("Text: ");
        String text = scanner.nextLine();


        if (isPalindrome(text)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }

        scanner.close();
    }


    public static boolean isPalindrome(String text) {

        String cleanText = text.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleanText.length() - 1;


        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

	}

}
