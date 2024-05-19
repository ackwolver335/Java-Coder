import java.util.Scanner;

class arr_jagg{
    public static void main(String[] a){
        // Declaring a Multi-dimensional Array [Jagged Array]
        int[][] arr1 = new int[2][];

        arr1[0] = new int[3];   // first row
        arr1[1] = new int[2];   // second row

        // Initializing array with some data in it
        int data = 1;
        for(int i = 0;i < arr1.length;i++){
            for(int j = 0;j < arr1[i].length;j++){
                arr1[i][j] = data;
                data++;
            }
        }

        // Printing the data in front of the user
        System.out.println("Data of the Array : ");
        for(int i = 0;i < arr1.length;i++){
            for(int j = 0;j < arr1[i].length;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scn = new Scanner(System.in);                           // Scanner for taking input from the user

        // Jagged Array creation on the basic of user's input
        System.out.print("Enter the number of subarrays you want in your array : ");
        int sub_arrays = scn.nextInt();

        int[][] jagged_arr = new int[sub_arrays][];

        for(int i = 0;i < jagged_arr.length;i++){
            System.out.print("Enter the sub-array length for " + (i + 1) + " part of the array : ");
            int size1 = scn.nextInt();
            jagged_arr[i] = new int[size1];
        }

        // Adding some data elements
        for(int i = 0;i < jagged_arr.length;i++){
            for(int j = 0;j < jagged_arr[i].length;j++){
                System.out.print("Enter the value for sub-array " + (i + 1) + " elements : ");
                jagged_arr[i][j] = scn.nextInt();
            }
        }

        // Printing the data in front of the users
        System.out.println("Data item of jagged array taken from the user : ");
        for(int i = 0;i < jagged_arr.length;i++){
            for(int j = 0;j < jagged_arr[i].length;j++){
                System.out.print(jagged_arr[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}