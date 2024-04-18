class loops{
    public static void main(String[] a){

        // Different Loops in JAVA
        // 1. For Loop
        for(int i = 0;i < 11;i++){
            System.out.println("Value of var is : " + i);
        }

        int arr[] = {12,34,56,77};
        // For-each Loop
        for(int value : arr){
            System.out.println("Value is : " + value);
        }

        // 2. While Loop
        int i1 = 0;
        while(i1 < 11){
            System.out.println("Value of var is : " + i1);
            i1++;
        }

        // 3. Do-while Loop
        System.out.println("Using Do-While Loop : ");
        do{
            System.out.println("The Value of number is : " + i1);
            i1--;
        } while(i1 > 0);

        // Jump Statements
        // 1. Break
        for(int i = 0;i < arr.length;i++){
            System.out.println("Element is : " + arr[i]);
            // Skipping the second element
            if(i == 1){
                break;
            }
        }

        // 2. Continue
        for(int i = 0;i < arr.length;i++){
            if(i == 2){
                continue;
            }
            System.out.println("Value is : " + arr[i]);
        }

        // Labels
        first_label : {
            int i2= 12;
            if(i2 == 12){
                System.out.println("Local Variable : " + i2);
                break first_label;
            }
        }

        // Using the user-defined function to find the maximum value
        System.out.println("Maximum value from all the value : " + max1(arr));
    }

    public static int max1(int[] num){
        int max_1 = num[0];
        for(int val : num){
            if(val > max_1){
                max_1 = val;
            }
        }
        return max_1;       // use of return statements
    }
}