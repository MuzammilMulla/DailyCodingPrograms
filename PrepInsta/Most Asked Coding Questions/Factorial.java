public class Factorial {
    public static void main(String[] args) {
        int ans = fact(4);
        System.out.println(ans);
    }

    static int fact(int number){
        //base condition
        if(number==0 || number==1){
            return 1;
        }
        //Rc
        return number* fact(number-1);
    }
}
