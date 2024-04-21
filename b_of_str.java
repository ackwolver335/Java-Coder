class b_of_str{
    public static void main(String[] a){
        String s1 = new String("New String");
        System.out.println("Basic String using new keyword : " + s1);

        String const1 = "Constant Value !";
        System.out.println("String Literal value : " + const1);

        StringBuffer s_buffer = new StringBuffer("Buffered Value");
        System.out.println("String Buffer Class : " + s_buffer);

        StringBuilder s_builder = new StringBuilder("Builder Value");
        System.out.println("String Buider Class's String : " + s_builder);

        System.out.println("Immutable String : " + const1);
        const1 = const1.concat("is now changed !");
        System.out.println("Changed String value : " + const1);

        System.out.println("\nStrings with and without new keyword : \n");
        System.out.println("String without new Keyword : ");
        System.out.println(const1);
        System.out.println("\nString with new keyword : ");
        System.out.println(s1 + " " + s_buffer + " " + s_builder);

        byte asc1[] = {65,67,75};
        System.out.print("Array of Ascii : ");
        for(int i = 0;i < asc1.length;i++){
            System.out.print(asc1[i] + " ");
        }
        String combined_str = new String(asc1);
        System.out.println("\nString created using array of Array : " + combined_str);

        char chr1[] = {'A','c','k'};
        System.out.print("Array of Character : ");
        for(int i = 0;i < chr1.length;i++){
            System.out.print(chr1[i] + " ");
        }
        String combined_st = new String(chr1);
        System.out.println("\nArray of Character : " + combined_st);
    }
}