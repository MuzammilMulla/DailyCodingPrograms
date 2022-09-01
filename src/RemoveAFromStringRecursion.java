public class RemoveAFromStringRecursion {
    public static void main(String[] args) {

        //removeA("", "abcaabc");
        System.out.println( removeA("abcaabc"));

    }


    static void removeA(String pro, String unpro) {
        if (unpro.isEmpty()) {
            System.out.println(pro);
            return;
        }

        char ch = unpro.charAt(0);

        if (ch == 'a') {
            removeA(pro, unpro.substring(1));
        } else {
            removeA(pro + ch, unpro.substring(1));
        }
    }

    static String removeA(String unpro) {
        if (unpro.isEmpty()) {
            return "";
        }
        char ch = unpro.charAt(0);
        if (ch == 'a') {
            return removeA(unpro.substring(1));
        } else {
            return ch + removeA(unpro.substring(1));
        }
    }
}
