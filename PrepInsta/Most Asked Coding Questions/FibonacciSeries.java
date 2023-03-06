public class FibonacciSeries {
    public static void main(String[] args) {

        System.out.println(fibonacci(10));
    }

     static int fibonacci(int number) {
        //base case
        if(number==0) return 0;
        if(number==1) return 1;


        //RC
        return fibonacci(number-1) + fibonacci(number-2);

    }
}

