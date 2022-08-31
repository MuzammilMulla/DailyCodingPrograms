public class ReachNumber {
    public static void main(String[] args) {
        reachDest(0, 10);
    }

    static int reachDest(int s, int d){
//        int s = 1;
//        int d = 10;
        if(s == d){
            System.out.println("reached");
            return 0;
        }
        s++;
        System.out.println(s);
        return  reachDest(s, d);
    }
}
