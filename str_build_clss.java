class str_build_clss{
    public static void main(String[] a){
        
        // StringBuilder Class
        StringBuilder str1 = new StringBuilder();
        str1.append("This is a general string !");
        System.out.println("StringBuilder Class String is : " + str1);

        // Another way to print the string of StringBuilder Class
        System.out.println("String Object created with StringBuilder Class : " + str1.toString());              // converted to normal string

        // Constructors in StringBuilder Class
        // 1. StringBuilder() : It is used to build string with no characters with initial capacity of 16 characters
        StringBuilder str2 = new StringBuilder();

        // 2. StringBuilder(int capacity) : It is used to build or create a string by initialising the string by providing a particular
        // capacity to the string, by specifying it in the form of arguments
        StringBuilder str3 = new StringBuilder(20);

        // 3. StringBuilder(CharSequence seq) : It is used for creating a string builder that have the same characters as specified in the 
        // CharSequence passed while creating the Object for it
        StringBuilder str4 = new StringBuilder("WelcometoStringBuilder");

        // 4. StringBuilder(String str) : It is used for creating a StringBuilder Class object by passing any particular string as an arguments
        String st1 = "Ack Wolver";
        StringBuilder str5 = new StringBuilder(st1);

        // Methods of StringBuilder Class
        // 1. append() : This method is used in order to extend the string stored in object created using StringBuilder Class
        StringBuilder string1 = new StringBuilder("Normal String");
        System.out.println("String in StringBuilder Class's Object : " + string1);
        string1.append(" is a good String");
        System.out.println("String after using append() method : " + string1);

        // 2. appendCodePoint(ASCII CODE) : This method is used in order to add character using their ASCII Code for getting them added in the String Created
        string1.appendCodePoint(67);
        System.out.println("String from StringBuilder Class after appending data using appendCodePoint() method : " + string1);

        // 3. capacity() : This method is used to get the capacity of the current string
        System.out.println("The Capacity of the current string is : " + string1.capacity());

        // 4. charAt() : This method is used to get the character present at the index passed in it as the argument
        System.out.println("Character at the second index in this string is : " + string1.charAt(1));

        // 5. codePointAt() : This method is used for getting the character present at the particular index
        int unicode = string1.codePointAt(10);
        System.out.println("Character at the 11th position in the string is : " + unicode);

        // 6. codePointBefore() : This method is used for getting the character present the passed index as argument in the method
        int unicode1 = string1.codePointBefore(4);
        System.out.println("Character present at the 4rth position in the String is : " + unicode1);

        // 7. codePointCount() : This method is used in order to get the count from a range in the format of a unicode
        int unicode_count = string1.codePointCount(1, 10);
        System.out.println("Count of an element using unicode characters : " + unicode_count);

        // 8. delete() : This method is used in order to delete the particular partition of the string created using StringBuilder Class
        string1.delete(1,4);
        System.out.println("String after deleting some of its part using delete() method : " + string1);

        // 9. ensureCapacity() : This method is used in order to ensure or modify the capacity of string also after assigning, there is space
        // for further 16 more characters but reallocation is not done in this
        string1.ensureCapacity(30);
        System.out.println("The Current Capacity of the String is : " + string1.capacity());

        // 10. getChars() : This method is used for extracting the characters from a particular range of the string and then putting 
        // it inside any particular array, also putting these to a specific
        char[] arr1 = new char[7];
        string1.getChars(0, 7, arr1, 0);
        System.out.println("Array created with the hep of StringBuilder getchar() method : ");
        for(int i = 0;i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // 11. indexOf() : This method is used in order to check the index of a particular part of the string and also it has an optional
        // argument for getting the search after a particular index
        System.out.println("Index of particular part of string using indexOf() : " + string1.indexOf("String"));

        // 12. insert() : This method is used for inserting the string representation of the boolean alternate argument into this sequence.
        string1.insert(0, true);
        System.out.println("The first string after inserting using insert() method : " + string1);

        // 13. lastIndexOf() : Used to check the last occurence of the string passed as the argument in this method.
        System.out.println("The Last Index of String is : " + string1.lastIndexOf("good"));

        // 14. length() : This method is used for returning the length of the string used with.
        System.out.println("The Length of the first string is : " + string1.length());

        // 15. replace() : This method is used for replacing the string from the first and last index for placing in the string.
        string1.replace(0,4,"End");
        System.out.println("String after using replace method is : " + string1);

        // 16. reverse() : This method is used for reversing the String from initial to final index.
        string1.reverse();
        System.out.println("The String after reversing using reverse() method : " + string1);

        // 17. setCharAt() : It is used for setting up the character at a particular index in the String.
        string1.setCharAt(1,'a');
        System.out.println("String after using setCharAt() method for placing it to a particular position : " + string1);

        // 18. setLength() : It is used for setting up the length of the String
        string1.setLength(10);
        System.out.println("The String after setting up the length using setLength() : " + string1);

        // 19. subSequence() : It is used for setting up or creating a sub-sequence from the string
        System.out.println("String after creating subSequence using this method : " + string1.subSequence(3, 7));

        // 20. substring() : It is used for creating a substring from a particular String by passing the indexes of start and ending position
        System.out.println("String after creating a particular partition of using substring() method is : " + string1.substring(3,7));

        // 21. toString() : This method is used for converting the allocated string to a normal String Data Type.
        System.out.println("String after converting to a data type String : " + string1.toString());

        // trimToSize() : This method is used for triming the size of the string
        StringBuilder string4 = new StringBuilder("New String");
        System.out.println("The String Capacity before triming to the size : " + string4.capacity());
        string4.trimToSize();
        System.out.println("The String after triming the size : " + string4.capacity());
    }
}