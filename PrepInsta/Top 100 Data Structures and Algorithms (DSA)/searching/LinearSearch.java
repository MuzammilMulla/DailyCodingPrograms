package DSA;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,34,765,21,675,123};
        int search= 765;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==search){
                System.out.println(search+ " found at index "+i);
                return;
            }
        }
        System.out.println("not found");


    }
}
