public class ReverseStringRecursion {
    public static void main(String[] args) {
        String str= "muzamil";
        System.out.println(reverse(str));
    }
     public static String reverse(String str){

        //base condition
       if(str.isEmpty()){
           return str;
        }
      return reverse(str.substring(1))+ str.charAt(0);
    }
}
