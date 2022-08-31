public class StringClassExamples {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    int n=5;
   // int totalColsInRow = row > n ? 2 * n - row : row;


    int m = n> 3 ? n+1 : n+2;
        System.out.println(m);


        String name = "muzammil";
          String condition = name.toLowerCase() =="muzammil" ? "equals " : "not equal";
        System.out.println(condition);


        String cat = "chinni";
        String condition2 = cat.toLowerCase() == "chinni" ? cat+ " HI" : " hoiii";
        System.out.println(condition2);
    }

}