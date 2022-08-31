public class PalindromeString {
    public static void main(String[] args) {
        String pal = null;
        System.out.println( palcheck(pal));
    }

    static boolean palcheck(String pal){
        if(pal==null || pal.length()==0){
            return true;
        }
        for (int i = 0; i <=(pal.length()/2) ; i++) {
            char start = pal.charAt(i);
            char end = pal.charAt(pal.length()-1-i);
            if(start!= end){
                return false;
                }
        }
        return true;
    }
}
