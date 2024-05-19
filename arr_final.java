class arr_final{
    // Using the concept of final keyword with default member of the class
    int number = 12;
    public static void main(String[] a){

        // Defining a final array
        final int[] arr = {1,2,3,4,5};
        System.out.println("Final Array's Elements are : ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr[3] = 12;                        // Changing Elemen's value
        System.out.println("Elements are changing the value of one element : ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // In this code block we don't have much difference we just have used to final keyword with the concept of Arrays
        // Clearing the final keyword with same class object and its members
        final arrfinal obj1 = new arrfinal();
        obj1.number = 22;

        /*
        
        We can't reassign some value to one which is been declared as final
        
        Example :
        final arrfinal obj1 = new arrfinal();
        arrfinal obj2 = new arrfinal();

        obj1 = obj2                     // This will cause an error as we can't assign the same value to it
        
        */
    }
}