import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 4, 1},
                {12, 342, 78, 2, 24},
                {234, 435, 1243, 675, 76},
                {34, 765, 1234, 765, 345}
        };

       int [] ans = search(arr, 2);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }

            }
        }
        return new int[]{-1,-1};
    }
}

