class New1{
    public void display(){                          // Identifier
        System.out.println("Hello World !");
    }
}

class Identify{
    public static void main(String[] a){
        int number = 12;                    // Identifier
        System.out.println("The value of the number is : " + number);

        New1 obj1 = new New1();             // Identifier
        obj1.display();                     // Identifier
    }
}