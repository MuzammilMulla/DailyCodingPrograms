public class FindEvenNoLeetCode {
    public static void main(String[] args) {
        int [] array = { 12, 3, 23, 1232, 43};
        System.out.println(find(array));
    }
    static int find(int[] array){
        int c=0;
        for (int i = 0; i <array.length ; i++) {
              if(digits(array[i]) % 2 == 0){
                c++;
            }
        } return c;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }

}
