import java.util.*;

// custom wrapper class
class numbers{

    // some private members
    private int num1 = 0;
    private int num2 = 0;

    // member methods
    public void insert(int n1){
        this.num2++;
        if(n1 <= this.num1)
            return;
        this.num1 = n1;
    }

    public int first(){
        return this.num1;
    }

    public int second(){
        return this.num2;
    }
}

class wrap{
    public static void main(String[] a){

        // Wrapper Classes and their objects
        char ch = 'a';

        // Conversion [Autoboxing]
        Character z = ch;

        // Checking in the output
        System.out.println("Character Wrapper class : " + z);
        System.out.println("Character normal wrapper class : " + ch);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(20);                                                  // autoboxing

        // Printing the values now
        System.out.println(arrayList.get(0));

        // Unboxing using the get() method
        int num = arrayList.get(0);
        System.out.println("Value of it after unboxing : " + num);

        // Using the classes here
        numbers num11 = new numbers();
        num11.insert(12);
        num11.insert(11);
        num11.insert(23);

        // Method names and uses here
        System.out.println("Top or first level number : " + num11.first());
        System.out.println("Last or second level number : " + num11.second());

    }
}