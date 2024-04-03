// 3. Class
class new1{
    public void display(){
        System.out.println("Displaying the Content here !");
    }
}

// 5. Interface
interface player{
    final int id = 12;
    void display();
}

class player1 implements player{
    public void display(){
        System.out.println("Player have the required details entered !");
    }
}

class npdata{
    public static void main(String[] a){

        // Non-Primitive Data Types
        // 1. Strings
        String name = "Ack Wolver";
        System.out.println("A String data type in JAVA is : " + name);

        // 2. Array
        int[] ar1;
        ar1 = new int[4];

        ar1[0] = 23;            // initializing the array with some elements
        ar1[1] = 34;
        ar1[2] = 10;

        // 4. Object
        new1 first = new new1();
        first.display();

        // Interface Reference
        player1 pl1 = new player1();
        player one;
        one = pl1;
        one.display();

    }
}