import java.util.Scanner;

class arr_cls{
    public static void main(String[] a){

        // Declaring an array here
        int arr[];

        // Allocating the memory space to it
        arr = new int[5];

        // for taking input
        Scanner scn = new Scanner(System.in);

        // Initialising the values of the array
        for(int i = 0;i < arr.length;i++){                              // length keyword to get the length of the array
            System.out.print("Enter a value for the element : ");
            arr[i] = scn.nextInt();
        }
        System.out.println();

        // Declaring an Array Literal
        int[] array1 = new int[]{1,2,3,4,5,6,7};

        System.out.print("Elements of an Array Literal : ");
        // Iterating over this Array
        for(int i = 0;i < array1.length;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // Defininga Multidimensional Array
        int[][] array2 = new int[3][3];

        // Getting the Rows and Columns of the Array
        System.out.println("Rows of the Array : " + array2.length);
        System.out.println("Column of the Array : " + array2[0].length);

        // Initiating a Multi-Dimensional Array
        for(int i = 0;i < array2.length;i++){
            for(int j = 0;j < array2[0].length;j++){
                System.out.print("Enter an element : ");
                array2[i][j] = scn.nextInt();
            }
            System.out.println();
        }
        scn.close();

        // Iterating over to the Array
        System.out.println("Element of the Array are mentioned below : ");
        for(int i = 0;i < array2.length;i++){
            for(int j = 0;j < array2[0].length;j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        // Cloning of 1D Array
        int[] arr1 = arr.clone();
        System.out.println("Printing the Array which is cloned : ");
        for(int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Passing the arrays to the function
        sum(arr);

        // Cloning Multidimensional Array
        int[][] array3 = array2.clone();

        System.out.println("Elements of Multidimensional Array : ");
        for(int i = 0;i < array3.length;i++){
            for(int j = 0;j < array3[0].length;j++){
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

        // Returning array from the methods or functions
        int[] array4 = arr1();
        System.out.println("\nElements of the array that is created by returning from a method : ");
        for(int i = 0;i < array4.length;i++){
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        // Creating Class Objects for Arrays
        byte[] bytearray = new byte[3];
        short[] shortarray = new short[3];
        String[] string_array = new String[3];
        
        // Printing the data to the user
        System.out.println("Class of first bytearray created : " + bytearray.getClass());
        System.out.println("Class of second shortarray created : " + shortarray.getClass());
        System.out.println("Class of third string_array created : " + string_array.getClass());
        System.out.println("SuperClass of third string_array created : " + string_array.getClass().getSuperclass());
    }

    public static void sum(int[] a){
        int result = 0;
        for(int i = 0;i < a.length;i++){
            result += a[i];
        }
        System.out.println("Sum of all the digits of the array is : " + result);
    }

    public static int[] arr1(){
        return new int[] {34,55,65};
    }   
}