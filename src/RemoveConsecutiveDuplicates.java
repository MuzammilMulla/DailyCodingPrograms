//Input : aabccba
//Output : abcba
public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
         String str =  "aabccba";
        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0) == str.charAt(1)){
           return removeDuplicates(str.substring(1));
        }
        else{
            return str.charAt(0 ) + removeDuplicates(str.substring(1));
        }
    }
}
