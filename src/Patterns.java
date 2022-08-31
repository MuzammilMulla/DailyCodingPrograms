public class Patterns {
    public static void main(String[] args) {

        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
      //  int n=5;
//        for (int row = 1; row<=n; row++) {
//            for (int column = 1; column <= row ; column++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //*****
        //*****
        //*****
        //*****
        //*****
//        for (int row  = 1; row  <=n ; row ++) {
//            for (int col = 1; col <=n; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //*****
        //****
        //***
        //**
        //*
//        for (int row = 1; row<=n; row++) {
//            for (int column = 1; column <= n-row+1 ; column++ ){     //  n-i+1
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
//        for (int row = 1; row <=n ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }


        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*

//        for (int row = 0; row <2*n; row++) {
//            int totalColsInRow = row > n ? 2 * n - row : row;
//            for (int col = 0; col <totalColsInRow ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //*
        //* *
        //* * *
        //* * * *
        //* * * * *
        //  int n=5;
//        for (int row = 1; row<=n; row++) {
//            for (int column = 1; column <= row ; column++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        int n=5;
        int i=1;

        while(i <= n){
            int j =1;
            while(j <= i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
