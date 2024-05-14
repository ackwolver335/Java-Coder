import java.util.Arrays;
import java.util.Scanner;

class arr_multi{
    public static void main(String[] a){

        // Multidimensional Arrays
        // 2-D Arrays
        
        int[][] arr1 = new int[2][2];
        arr1[0][0] = 12;
        System.out.println("First Element of first dimension : " + arr1[0][0]);

        Scanner scn = new Scanner(System.in);
        // Properly Implementing a 4*4 2D array
        int r1,c1,val = 1;
        System.out.print("Enter the number of rows you want in your array : ");
        r1 = scn.nextInt();
        System.out.print("Enter the number of column you want in your array : ");
        c1 = scn.nextInt();

        int[][] arr2 = new int[r1][c1];
        for(int i = 0;i < r1;i++){
            for(int j = 0;j < c1;j++){
                arr2[i][j] = val;
                val++;
            }
        }

        System.out.println("2D array after initiating as per your choice : " + Arrays.toString(arr2));
        System.out.println("Similar Array in Tabular Format Below !");
        for(int i = 0;i < r1;i++){
            for(int j = 0;j < c1;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        val = 1;
        // 3D Arrays
        int r2,c2,z2;
        System.out.print("Enter the number of rows you want in your 3D array : ");
        r2 = scn.nextInt();
        System.out.print("Enter the number of columns you want in your 3D array : ");
        c2 = scn.nextInt();
        System.out.println("Enter the number of zindex you want in your 3D array : ");
        z2 = scn.nextInt();

        int[][][] array1 = new int[r2][c2][z2];                                             // Array Initialized
        for(int i = 0;i < r2;i++){
            for(int j = 0;j < c2;j++){
                for(int k = 0;k < z2;k++){
                    array1[i][j][k] = val;
                    val++;
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("3D array in proper format below !");
        for(int i = 0;i < r2;i++){
            for(int j = 0;j < c2;j++){
                for(int k = 0;k < z2;k++){
                    System.out.print(array1[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        scn.close();
    }    
}