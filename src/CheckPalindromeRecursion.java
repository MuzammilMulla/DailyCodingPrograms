public class CheckPalindromeRecursion {
    public static void main(String[] args) {
        String str = "booboob";
        System.out.println(isPalindrome(str,0,str.length()-1));
    }
    
    static boolean isPalindrome(String str, int i, int j){
        
        // base condition
        if(i > j || i==j){
            return true;
        }
        if(str.charAt(i) != str.charAt(j)){
            return false;
        }
        else{
           return isPalindrome(str,i+1,j-1);
        }
    }
}
