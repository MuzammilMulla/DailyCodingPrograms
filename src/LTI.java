package QuestionsSolving;

public class LTI {
    public static void main(String[] args) {
        System.out.println(haystack(5, 1255135));
        System.out.println(charCount("muzammamil", 'm'));
    }

    static int haystack(int needle, int haystack){

        int count =0;
        while(haystack>0){
            if(haystack %10== needle) {
                count++;
            }
            haystack= haystack/10;
        }
        return count;
    }

    static int charCount(String str , char c){
        int count =0;
//        for (int i = 0; i <str.length() ; i++) {
//            if(str.charAt(i)== c){
//                count++;
//            }
//        }

        int i=0;
        while (i<str.length()){
            if(str.charAt(i)==c){
                count++;
            }
            i++;
        }
        return count;
    }
}
