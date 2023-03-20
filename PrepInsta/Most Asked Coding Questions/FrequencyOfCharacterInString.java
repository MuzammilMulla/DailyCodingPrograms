import java.util.Scanner;

public class FrequencyOfCharacterInString {
    public static void main(String[] args) {
        // take user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.next();

        System.out.println("Enter character");
        char c= sc.next().charAt(0);


        int counter =0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) == c){
                counter++;
            }
        }
        System.out.println("Frequency of "+c+" is "+ counter);
    }
}
