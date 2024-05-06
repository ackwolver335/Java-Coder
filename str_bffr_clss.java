class str_bffr_clss {
    public static void main(String[] a){
        StringBuffer sb1 = new StringBuffer("Ack Wolver");
        sb1.append(" is a good guy");
        String normal_string = sb1.toString();

        System.out.println("String created using StringBuffer Class is : " + normal_string);

        // Methods of StringBuffer Class
        // 1. append() : It is used to concatenate to the given argument with the used string.
        StringBuffer sb2 = new StringBuffer("New One");
        sb2.append(" is the Boom One");
        System.out.println("StringBuffer object string after using append method : " + sb2);

        // 2. insert() : Inserts the given string with the string used with at a particular position.
        StringBuffer sb3 = new StringBuffer("A New One");
        sb3.insert(0,"This is ");
        System.out.println("StringBuffer Object after using insert() method : " + sb3);

        // 3. replace() : It is used for replacing the given string from a specified begin index and last index -1 as per the string
        StringBuffer sb4 = new StringBuffer("That is a good one !");
        sb4.replace(10,15,"disgusted");
        System.out.println("StringBuffer Class after using replace() method : " + sb4);

        // 4. delete() : It is used to delete the string used from a particular begin and start index.
        sb4.delete(1,10);
        System.out.println("StringBuffer Class after using delete() method : " + sb4);

        // 5. reverse() : It is used to reverse the string of the StringBuffer Class.
        sb4.reverse();
        System.out.println("String created using StringBuffer Class with reverse() method : " + sb4);

        // 6. capacity() : It is used to return the current capacity of the StringBuffer and the default capacity is 16
        System.out.println("The Capacity of the String Buffer is : " + sb4.capacity());

        // 7. length() : It returns the length of the StringBuffer, it is used with.
        System.out.println("Length of this String Buffer is : " + sb4.length());

        // 8. charAt() : Returns the value of the character available at that position in the sequence.
        System.out.println("Character at the third position of the Buffer String with charAt() method : " + sb4.charAt(2));

        // 9. deleteCharAt() : Deletes the particular character as per the given index passed in the argument
        sb4.deleteCharAt(11);
        System.out.println("Buffer String after deleting particular indexed character using deleteCharAt() method : " + sb4);

        // 10. ensureCapacity() : Ensures the capacity of the string as per the developer wants to define.
        sb4.ensureCapacity(20);
        System.out.println("Capacity of the String after ensuring with ensureCapacity() method : " + sb4.capacity());

        // 11. indexOf() : Returns the index of a particular char or string.
        System.out.println("Index of particular character using indexOf() method : " + sb1.indexOf("good"));

        // 12. substring() : It is used to trim or slice a particular part of the Buffer String 
        System.out.println("SusbString of the Buffer String after using substring() method : " + sb4.substring(5));

        // 13. setCharAt() : Used to set a particular character at a particular position in the Buffer String
        sb1.setCharAt(4, 'a');
        System.out.println("Buffer String after changing the character at 5th position is : " + sb1);

        // Constructors in String Buffer
        // 1. StringBuffer() : It by default reservers space for 16 characters without reallocation
        StringBuffer sbfr1 = new StringBuffer();

        // 2. StringBuffer(int size) :  This format of constructor specifies the spaces for the buffer and sets it.
        StringBuffer sbfr2 = new StringBuffer(30);

        // 3. StringBuffer(String) : It accepts the string argument that sets the initial content of StringBuffer and reservers space for 
        // 16 more character without reallocation
        StringBuffer sbfr3 = new StringBuffer("This is a String Buffer");
    }
}