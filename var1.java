class var1{

    // Instance variables
    int num1 = 12;
    int number = 10;

    public int n1;                                              // public variable

    public static String name = "Ack Wolver";                   // static variable

    public var1(){                                              // Class Constructor
        System.out.println("Object Created !");                
    }

    public static void main(String[] a){

        int local = 234;
        System.out.println("Local Varible : " + local);

        var1 obj1 = new var1();
        System.out.println("First Class member : " + obj1.num1);
        System.out.println("Second Class member : " + obj1.number);

        obj1.number = 34;
        System.out.println("Value of Second Member after changing : " + obj1.number);
        
        System.out.println("Static variable inside the class : " + name);

        // Another Block of Code
        {
            int n1 = 23;
            System.out.println("Variable number inside another block : " + n1);
        }

    }

}