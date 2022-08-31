public class MaxWealth {
    public static void main(String[] args) {
      int [][] accounts = {
              {1,2,3},
              {4,5,6},
              {7,8,9}
      };
        System.out.println(wealth(accounts));
    }


    public static int wealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int column = 0; column < accounts[row].length; column++) {
                sum += accounts[row][column];
            }

            if (sum > ans) {
                ans = sum;

            }
        }
        return ans;
    }
}
