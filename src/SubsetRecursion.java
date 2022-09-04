//abc
//ab
//ac
//a
//bc
//b
//c
//
public class SubsetRecursion {
    public static void main(String[] args) {
        subset("", "abc");
    }

    static void subset(String p, String un){  //p--> processed , un--> unprocessed
        if(un.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= un.charAt(0);
        subset(p+ch,un.substring(1));
        subset(p,un.substring(1));
    }
}
