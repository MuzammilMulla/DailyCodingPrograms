import java.util.Scanner;

public class isVowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter character:");
        char c=sc.next().charAt(0);
        System.out.println(isVowel(c));


    }
    static boolean isVowel(char c){
        if(c=='a' || c== 'e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;


    }

}
