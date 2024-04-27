import java.nio.charset.Charset;

class strClass{
    public static void main(String[] a){

        // From Part 1
        // Creating a string here
        String str1 = new String("Example String");
        System.out.println("Intro to Strings : \nFirst String together with space allocation for it : " + str1);

        // String Literals
        String str2 = "This is a Literal String";
        System.out.println("Literal String : " + str2);

        StringBuffer str3 = new StringBuffer("Buffered String");                // String Categories
        StringBuilder str4 = new StringBuilder("Builder String");

        System.out.println("String Buffer Class : " + str3);
        System.out.println("String Builder Class : " + str4);

        // ASCII Code
        byte asci[] = {65,67,75};
        String my_name = new String(asci);
        System.out.println("My name created using array and ascii code is : " + my_name);

        // Joining Characters
        byte char1[] = {'A','c','k'};
        String my_name1 = new String(char1);
        System.out.println("My name using character combined Array is :" + my_name1);

        // From Part 2
        String s1 = "String Literal";                                           // String Literals
        String s2 = new String("String with Allocation ");             // String created using new Keyword

        System.out.println("\nString Class : ");
        System.out.println("String created using default keyword : " + s1);
        System.out.println("String created using new keyword : " + s2);

        // String Constructors
        // 1. String(byte_array)
        byte arr1[] = {65,67,75};
        String myname = new String(arr1);
        
        // 2. String(byte_array,Charset)
        byte arr2[] = {65,66,67,68};
        Charset cs1 = Charset.defaultCharset();
        String bytecs1 = new String(arr2,cs1);

        // 3. String(byte_array,int start_index,int length)
        byte bt_arr[] = {23,42,12,67,34};
        String s3 = new String(bt_arr,1,4);

        // 4. String(byte[] byte_arr,int start_index,int length,Charset char_set)
        byte[] by_arr = {23,45,89,78,56};
        Charset cs2 = Charset.defaultCharset();
        String s4 = new String(by_arr,1,3,cs2);

        // 5. String(char[] char_arr)
        char[] chr1 = {'c','o','d','i','n','g','_','n','e','e','d','s'};
        String s5 = new String(chr1);

        // 6. String(int[] uni_code,int start_index,int length)
        int[] uni_code = {71,75,79,80,82};
        String s6 = new String(uni_code,1,3);

        // 7. String(StringBuffer s_buffer)
        StringBuffer s_buffer = new StringBuffer("coding.needs");
        String s7 = new String(s_buffer);

        // 8. String(StringBuilder s_builder)
        StringBuilder s_builder = new StringBuilder("coding.needs");
        String s8 = new String(s_builder);

        System.out.println("String Constructors >>");
        System.out.println("String using byte_array : " + myname);
        System.out.println("String using byte_array and Charset : " + bytecs1);
        System.out.println("String using start index and last index : " + s3);
        System.out.println("String using index and charset method : " + s4);
        System.out.println("String Allocation using string array : " + s5);
        System.out.println("String Allocation using uni_code of characters : " + s6);
        System.out.println("String allocated using StringBuffer Class is : " + s7);
        System.out.println("String allocated using StringBuilder Class : " + s8);

        // String Class Methods
        // 1. length() [int] : Returns the number of characters available in the string
        System.out.println("\nString Class Methods >> ");
        System.out.println("Length of 'Hello World!' using length() : " + ("Hello World!".length()));

        // 2. charAt(int i) : Returns the character according to the index given by the user or developer
        String string1 = "coding.needs";
        System.out.println("Character at 2nd position in String : " + string1 + " is : " + string1.charAt(1));

        // 3. substring(int i) : Returns a substring from the given string after substituting from the given index.
        System.out.println("Substring of String : " + string1 + " till the end"  + " is : " + string1.substring(4));
        System.out.println("Specific Partition of the same String is : " + string1.substring(3,7));

        // 4. concat(string s1) : Used for joining two or more strings together.
        String string2 = "Joined Together";
        System.out.println("First String : " + string1 + "\nSecond String : " + string2);
        String joined = string1.concat(string2);
        System.out.println("Output after joining both the strings together : " + joined);

        // 5. indexOf(string s) : Returns the first occurence of the word in the string
        String string3 = "Love is not pure";
        System.out.println("First Occurence of 'not' in " + string3 + " is : " + "not".indexOf(string3));
        System.out.println("Finding the Occurence by giving the starting index : " + "not".indexOf(string3,3));

        // 6. lastIndexOf(String s) : Returns the last index of the passed character or word in the selected string
        System.out.println("Last index of 'o' in String : " + string3 + " is : " + string2.lastIndexOf('o'));

        // 7. equals(String s) : Returns true if the selected string are equal and false if not.
        System.out.println("Checking if both the strings are equal or not : " + string1.equals(string2));

        // 8. equalsIgnoreCase(String s) : Works similar to equals just by ignoring the cases of the characters.
        System.out.println("Checking if the strings are equal or not by ignoring the cases : " + string2.equalsIgnoreCase(string3));

        // 9. int compareTo(String anotherstring) : Used to compare two strings lexicographically
        System.out.println("Return of compareTo() method from both the strings : " + string1.compareTo(string2));

        // 10. int compareToIgnoreCase(String anotherstring) : Works similar to compareTo() method just by ignoring the case of characters.
        System.out.println("Returns of compareToIgnoreCase() method from both Strings : " + string1.compareToIgnoreCase(string2));

        // 11. toLowerCase() : Used to convert all the character of the string into lowercase
        System.out.println("Converting all the character of first string to lowercase : " + string1.toLowerCase());

        // 12. toUpperCase() : Used to convert all the character of string into UPPERcase
        System.out.println("Converting all the characters of second string to uppercase : " + string2.toUpperCase());

        // 13. trim() : Returns the string after removing the whitespaces from the corners but don't remove the spaces in between
        String string4 = " Spaces aside ! ";
        System.out.println("Original String : " + string4);
        System.out.println("String after using Trim Method in it : " + string4.trim());

        // 14. replace(char oldchar,char newchar) : Used to replace a particular string character from a new one
        string4.replace('a','r');
        System.out.println("String after replacing the 'a' character is : " + string4);

        // 15. contains(String s) : Returns boolean value for checking if the word is available in the string or not
        System.out.println("Checking if this is contained in the string : " + string4.contains(string3));

        // 16. toCharArray() : Returns array of character from the given string
        char[] char_arr1 = string1.toCharArray();
        System.out.print("Array of characters available in the string :- ");
        for(int i  = 0;i < char_arr1.length;i++){
            System.out.print(char_arr1[i] + " ");
        }
        System.out.println();

        // 17. startWith(String s) : Returns Boolean value if the string startwith the given partition
        System.out.println("Checking if the partition is available in the String : " + string1.startsWith("Hello"));
        
        // 18. endsWith(String s) : Returns Boolean value if the string endswith the given partition
        System.out.println("Checking if the partition is available in the string : " + string1.endsWith("World!"));
    }
}