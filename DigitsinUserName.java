
/*
 * Question:
 * To create a profile social media "ThePastBook", user need to enter a string value in the form of username.
 * The user should enter the name, if user enters an incorrect string of digits the system autmomatically identifies the numbers in the string and remove them.
 * Write an algorithm to help the system identify the countof digits present in the username.
 *
 * Example:
 * Input: rah23ul
 * Output: 2
 *
 * Explanation:
 * The digits in the input are 2, 3. So, the count is 2.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int c = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= '0' && ch <= '9') {
                c++; 
            }
        }
        System.out.println(c);
    }
}
