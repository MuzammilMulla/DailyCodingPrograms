public class FirstUpperCaseLetter {
    public static void main(String[] args) {

        System.out.println(firstUpperCaseLetter("How are you",0));
    }

    static char firstUpperCaseLetter(String str, int i) {
        if(str.length()==0){
            System.out.println("No upper case found");
            return 0;
        }

        if (Character.isUpperCase(str.charAt(i))) {
            return str.charAt(i);
        }
        return firstUpperCaseLetter(str, i + 1);
    }
}
