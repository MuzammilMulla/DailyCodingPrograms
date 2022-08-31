import java.util.Arrays;

public class AlphabetSeries {
    public static void main(String[] args) {
        String series = " ";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series= series + "\t"+ch;
        }
        System.out.println(series);

        String name= "Muzamil";
        System.out.println(Arrays.toString(name.toCharArray()));


    }
}
