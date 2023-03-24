package OutsideCodes;

public class DifferenceofSumOfOddEven {
    public static void main(String[] args) {
        //TCS Question
        //Given a maximum of 100 digit numbers as input,
        // find the difference between the sum of odd and even position digits.
        int evenSum=0;
        int oddSum =0;
        for (int i = 0; i <=10 ; i++) {
            if(i %2==0){
                 evenSum=i+evenSum;
            }else{
                oddSum= i+ oddSum;
            }
        }
        System.out.println("even sum is "+ evenSum);
        System.out.println("odd sum is " +oddSum);

        int result1=oddSum-evenSum;
        System.out.println("odd sum- even sum is " + result1);


        int result2=evenSum-oddSum;
        System.out.println("even sum- odd sum is " + result2);


    }
}