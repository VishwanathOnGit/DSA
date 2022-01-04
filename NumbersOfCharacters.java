import java.util.*;

public class NumbersOfCharacters {

    public static void main(String[] args) {
        int[] CountArray = new int[26];
        Arrays.fill(CountArray, 0);
        String s;
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (Character.isLetter(ch)) {
                CountArray[ch - 'a']++;
            }
        }

        for (int i = 0; i < CountArray.length; i++) {
            if (CountArray[i] != 0) {
                System.out.print((char) (i + 'a'));
                System.out.print(CountArray[i]);
            }
        }
    }
}
