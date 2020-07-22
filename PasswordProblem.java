/*   Created by IntelliJ IDEA.
 *   Author: Nishant Mishra
 *   Date: 21-07-2020
 *   Time: 00:26
 *   File: PasswordProblem.java
 */
// que-> create Caesar Cipher Password as
        // 1) change all uppercase to lowercase
        // 2) char = char + 2
package myPractice;
import java.util.Scanner;
public class PasswordProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter Your Password");
        String inputPassword = scn.nextLine();
        StringBuilder pass = new StringBuilder("");
        String lowerCase = inputPassword.toLowerCase();
        for (int i = 0; i < inputPassword.length(); i++) {
            int p = (int) (lowerCase.charAt(i));
            int pa = p + 2;
            char pas = (char) pa;
            if (p == 122) {
                int z = 122 - 26;
                int s = z + 2;
                char t = (char)s;
                pass.append(t);
            } else {
                pass.append(pas);
            }
        }
        System.out.println("Its Caesar Cipher Code is \n"+pass);
    }
}

