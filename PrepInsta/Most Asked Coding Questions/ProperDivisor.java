package OutsideCodes;

public class ProperDivisor {
    public static void main(String[] args) {

        int num=496;
        int ans=0;
        //to get proper divisor
        for (int i = 1; i < num; i++) {
            if(num % i == 0){
                ans = i + ans;
            }
        }
        if(ans==num) System.out.println(num + " is a perfect number");
        else System.out.println(num + " is not a perfect number");
        }
    }

