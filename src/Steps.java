public class Steps {
    public static void main(String[] args) {
        System.out.println(countSteps(20));
    }

    static int countSteps (int steps){

        if(steps< 0){
            return 0;
        }
        if(steps ==0){
            return 1;
        }
        int ans = countSteps(steps -1 ) +countSteps(steps-2);

        return ans ;
    }
}
