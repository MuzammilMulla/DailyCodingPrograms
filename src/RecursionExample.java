
//          RECURSION uses STACK
public class RecursionExample {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("hello");
//        }
//        int i=0;
//        while( i<5){
//            System.out.println("hello world");
//            i++;
//        }

        //System.out.println(fibo(20));  //6765


//    static  int fibo(int n){
//        if (n <2){
//            return n;
//        }
//        return fibo(n-1) + fibo(n-2);
//    }
        int n =5;
        System.out.println(factorial(5));
    int [] arr = { 1,3,4,3,4,67,8,90};

    int target = 67;
        System.out.println(bsRecursion(arr,target, 0, arr.length-1));
        System.out.println(namePrint("muzamil"));
}
        static void duplicate(int [] arr){
            int [] blank = new int[20];

            for (int i = 0; i <blank.length ; i++) {
                if( blank[i]  != arr[i]){

                }
            }

        }

    static int bsRecursion (int [] arr,int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m]==  target){
            return m;
        }
        if(target < arr[m]){
            return  bsRecursion(arr, target, s, m-1);
        }
        else{
            return bsRecursion(arr,target,m+1,e);
        }
    }

    static String namePrint(String name ){
        return  "hI" + name;
    }

    static int factorial(int n ){
        if (n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }
}

