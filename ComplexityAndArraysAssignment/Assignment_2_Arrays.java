package DSA.Arrays.Assignment;

public class Assignment_2_Arrays {

    static void middleRC(int[][] arr){
        System.out.println("\nElements at middle row and column are : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i== arr.length/2 || j==arr.length/2){
                    System.out.print(arr[i][j]+"\t");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        Q2: write a program to print the elements above the secondary diagonal in a user inputted
//        square matrix.
//        Input:
//                1 2 3
//                4 5 6
//                7 8 9

//        Output : 1 2 4
        int[][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Elements above secondary diagonal are : ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                if(j<arr1.length-i-1) System.out.print(arr1[i][j]+"\t");
            }
        }
        System.out.println();

//        Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
//        in any order.
//        Input :
//                1 2 3
//                4 5 6
//                7 8 9

//        Output 1: 1 3 5 7  9
        System.out.println("Elements on both the diagonals are : ");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(i==j || j==arr1.length-i-1){
                    System.out.print(arr1[i][j]+"\t");
                }
            }
        }
        System.out.println();

//        Q5: Write a function which accepts a 2D array of integers and its size as arguments and
//        displays the elements of middle row and the elements of middle column. Printing can
//        be done in any order.
//        [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]
//        Input 1:
//                1  2  3  4  5
//                3  4  5  6  7
//                7  6  5  4  3
//                8  7  6  5  4
//                1  2  37 8  0
//
//        Output : 3 5 5 6 37 7 6 4 3
        System.out.println("Enter the dimensions : ");

        int[][] arr={
                {1,2,3,4,5},
                {3,4,5,6,7},
                {7,6,5,4,3},
                {8,7,6,5,4},
                {1,2,37,8,0}
        };
        middleRC(arr);


        System.out.println("\nSpiC AD :)");
    }

}
