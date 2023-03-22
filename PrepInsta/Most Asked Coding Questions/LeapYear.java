public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1988));
    }

    static boolean isLeapYear(int year){

        if(year %400 ==0|| year % 100!=0 && year%4==0){
            return true;
        }
        return false;
    }
}
