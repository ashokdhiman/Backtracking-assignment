package DSA.Arrays.Assignment;

public class Assignment_1_Arrays {
    static int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[max]) max=i;
        }
        return max;
    }

    static int secondMax(int[] arr){
        arr[max(arr)]=Integer.MIN_VALUE;
        return arr[max(arr)];
    }
    public static void main(String[] args) {
//      Q1: Write a program to print the sum of all the elements present on even indices in the given array.
//          Input 1: arr[] = {3,20,4,6,9}
//          Output 1: 16
        int[] arr1={3,20,4,6,9};
        int sum=0;
        for(int i=0;i<arr1.length;i+=2){
            sum+=arr1[i];
        }
        System.out.println("Sum of elements at even position is : "+sum);
        System.out.println();

//      Q2: Write a program to traverse over the elements of the array using for each loop and print all even
//          elements.
//          Input 1: arr[] = {34,21,54,65,43}
//          Output 1: 34 54
        int[] arr2={34,21,54,65,43};
        System.out.print("The even elements are : ");
        for(int i:arr2){
            if(i%2==0) System.out.print(i+"\t");
        }
        System.out.println("\n");

//      Q3: Write a program to calculate the maximum element in the array.
//          Input 1: arr[] = {34,21,54,65,43}
//          Output 1: 65
        int max=Integer.MIN_VALUE;
        for(int i:arr2){
            if(i>max) max=i;
        }
        System.out.println("The Maximum element is : "+max);
        System.out.println();

//      Q4:Write a program to find out the second-largest element in a given array.
//         Input 1: arr[] = {34,21,54,65,43}
//         Output 1: 54

        System.out.println("The second largest element is : "+secondMax(arr2));
        System.out.println();

//      Q5:Given an array. Find the first peak element in the array. A peak element is an element that is greater than
//         its just left and just right neighbor.
//         Input 2:  arr[] = {1 4,7,3,2,6,5}
//         Output 1: 7
        int[] arr3={1,4,7,3,2,6,5};
        for(int i=0;i<arr3.length-1;i++){
            if(arr3[i]>arr3[i+1]) {
                System.out.println("The first peak element is : "+arr3[i]);
                break;
            }
        }

        System.out.println("\nSpiC AD :)");
    }
}
