public class LengthOfStringRecursion {
    public static void main(String[] args) {
        String str = "muza";
        System.out.println(lengthOfStringRecursion(str, 0,0));

    }
    static int lengthOfStringRecursion(String str, int i, int count){
        if(str.length() ==0){
            return 0;
        }
        if(i == str.length()){
            return count;
        }
        return lengthOfStringRecursion(str,i+1,count+1);
    }
}
