import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number= sc.nextInt();

        System.out.println("The entered number is "+ number);

        //solution
        int reversedNum =0;

        while(number != 0){
           int lastDigit = number%10;
           number=number/10;
            System.out.print(lastDigit);
        }




    }
}
