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
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter Your Password");
        String inputPassword = scn.nextLine();
        String password = "";
        for (char i : inputPassword.toCharArray()){
            if (Character.isUpperCase(i)){
                password += (char) (Character.toLowerCase(i) + 2);
            }
            else {
                password += (char) (i + 2);
            }
        }
        System.out.println("Its Caesar Cipher Code is \n"+password);
    }
}

