import java.util.ArrayList;
import java.util.StringJoiner;

class str1_join {
    public static void main(String[] a){
        // StringJoiner Class
        // Simple Constructors
        StringJoiner str1 = new StringJoiner(",");

        // Creating an Array List
        ArrayList<String> array_l1 = new ArrayList<>();

        array_l1.add("First One");          // Adding elements using add() methods
        array_l1.add("Second One");

        // Setting the value
        str1.setEmptyValue("Initial one is empty !");
        System.out.println("StringJoiner Object's String : " + str1);

        // Using length to get the length of the StringJoiner's String
        System.out.println("StringJoiner's Object String length : " + str1.length());

        // Another StringJoiner's Object
        StringJoiner str2 = new StringJoiner(":");
        str2.add(array_l1.get(0)).add(array_l1.get(1));

        // Merging both StringJoiner's Object
        str1.merge(str2);

        // Printing the StringJoiner's First Object after convertion into string
        System.out.println("StringJoiner's Object into String after getting merge : " + str1.toString());

        // Printing a new Length of the String
        System.out.println("New Length of the First StringJoiner Class's Object : " + str1.length());
    }   
}