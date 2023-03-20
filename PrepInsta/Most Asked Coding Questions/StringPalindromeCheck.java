import java.util.Scanner;

public class StringPalindromeCheck {
    public static void main(String[] args) {
        // take user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.next();

        //check Palindrome
       String revStr="" ;
        for (int i = str.length()-1; i >=0 ; i--) {
            revStr += str.charAt(i);
        }
        if(str.equals(revStr)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
        }
    }

