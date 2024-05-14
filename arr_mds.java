import java.util.Arrays;

class arr_mds{
    public static void main(String[] a){
        
        // Array's Methods
        // 1. asList() : Used to convert the element as list
        int[] arr1 = {65,67,66,68};
        System.out.println("Array as List : " + Arrays.asList(arr1));

        // 2. binarySearch() : Used to find the element using binarySearch algorithm
        // We can also use it by specifying the range as binarySearch(ArrayName,startindex,endindex,key)
        System.out.println("Element 66 is found at index : " + Arrays.binarySearch(arr1, 66));

        // 3. compare() : Used to compare the arrays in order to check if the elments of two arrays matches or not
        int[] arr2 = {66,67};
        System.out.println("Checking if the elments of the array matches or not : " + Arrays.compare(arr1,arr2));

        // 4. compareUnsigned() : Works similar to compare() method just by checking the Unsigned integer on the place of 16-bit integer
        
        // 5. copyOf() : It is used to create a copy of one array using already created array together by reassigning values to it
        System.out.println("Original Array : " + Arrays.toString(arr1));
        System.out.println("Array after creating a copy of it : " + Arrays.toString(Arrays.copyOf(arr1,10)));

        // 6. copyOfRange() : This method works similar to the copyOf() method just the difference of having a proper range to retrieve data from original array

        // 7. deepEquals() : Used to check if two arrays are equal or not deeply and returns a boolean value as per it
        int[][] array1 = {{1,2,3,4,5}};
        int[][] array2 = {{1,2,3}};
        System.out.println("Checking if the arrays are equal or not deeply : " + Arrays.deepEquals(array1, array2));

        // 8. deepHashCode() : Used to check the hash code of the array deeply.
        System.out.println("Hash Code of the first array deply : " + Arrays.deepHashCode(array2));

        // 9. deepToString() : Used to convert the Array object into a String
        System.out.println("Getting the Deeply converted String after using deepToString() method : " + Arrays.deepToString(array1));

        // 10. equals() : Used to check if two arrays are equal or not
        System.out.println("Checking if the two arrays are equal or not : " + Arrays.equals(array1,array2));

        // 11. fill() : Used to fill a particular key value to the whole selected array
        System.out.println("Array Before filling it using fill() method : " + Arrays.toString(arr1));
        Arrays.fill(arr1,33);
        System.out.println("Array after filling it with a key value using fill() method : " + Arrays.toString(arr1));
    }
}