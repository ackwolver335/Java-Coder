import java.lang.reflect.Array;
import java.util.Arrays;

class arr_reflect{
    public static void main(String[] a){
        // Getting the size of an array first
        int size1 = 4;

        // Declaring an actual array first
        int[] arr1 = (int[])Array.newInstance(int.class, size1);
        System.out.println("Array : " + Arrays.toString(arr1));

        // Adding some elements to the Array created
        Array.setInt(arr1,0,23);
        Array.setInt(arr1,1,45);
        Array.setInt(arr1,2,66);
        Array.setInt(arr1,3,90);
        System.out.println("Array after adding some elements : " + Arrays.toString(arr1));

        // Retrieving the element from the Array
        System.out.println("Retrieving a particular element from the array : " + Array.getInt(arr1,2));

        // Some Methods of Reflected Arrays
        // 1. get() : This method is used in order to get the value of the element as per the given index in the array
        System.out.println("Getting the element of the array using get() method : " + ((int)Array.get(arr1,2)));

        // 2. getBoolean() : This method is used to get the value of the specified index in the Boolean Array
        boolean arr[] = {true,false,true,false};
        System.out.println("Getting the value of element using getBoolean() method : " + Array.getBoolean(arr,1));

        // 3. getByte() : This method is used in order to get the value of the element if the data type of array is byte
        byte arr2[] = {'a','c','b'};
        System.out.println("Getting the value of element using getByte() method : " + Array.getByte(arr2,0));

        // 4. getLength() : This method is used to get the length of the array
        System.out.println("Length of the first array is : " + Array.getLength(arr));

        // 5. set() : This method is used in order to set a particular value of the array's element
        System.out.println("Array Before setting the value of its element : \n" + Arrays.toString(arr));
        Array.set(arr,2,false);
        System.out.println("Array after changing the value of the element : " + Arrays.toString(arr));
    }
}