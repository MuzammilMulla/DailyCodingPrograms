public class CountingRecursion {
    public static void main(String[] args) {
        System.out.println(count(5));
    }
    static int count(int num){
        //base case
        if(num==0) return 0;
        System.out.print(num+ " ");
        //RC
        return count(num-1);
    }
}
