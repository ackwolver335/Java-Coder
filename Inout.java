// Important packages for using
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;

class Inout{
    public static void main(String[] a)
    throws IOException
    {

        // Input Using Buffered Reader
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));

        // Taking Input
        System.out.print("Enter a string here : ");
        String str = bfn.readLine();                                    // Reading String

        System.out.print("Enter a number here : ");
        int i1 = Integer.parseInt(bfn.readLine());                      // Taking Integer

        // Printing Output
        System.out.println("String you have entered : " + str);
        System.out.println("Integer you have entered : " + i1);

        String name;

        // Using try and catch block
        try{  
            System.out.print("Enter your name : ");
            name = bfn.readLine();
            System.out.println("Your entered string or name : " + name);
        }
        catch(Exception e){}

        // Taking input using Scanner Class
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string here : ");
        String s2 = scn.nextLine();

        System.out.print("Enter a number here : ");
        int num1 = scn.nextInt();

        System.out.print("Enter a floating-pointing number : ");
        float num2 = scn.nextFloat();

        System.out.print("Enter a Byte here : ");
        byte b1 = scn.nextByte();

        System.out.print("Enter a Boolean value here : ");
        boolean bool1 = scn.nextBoolean();

        System.out.print("Enter a double floating point number : ");
        double num3 = scn.nextDouble();

        System.out.print("Enter a long integer : ");
        long num4 = scn.nextLong();

        System.out.print("Enter a short number : ");
        short num5 = scn.nextShort();

        // Ways of Output
        System.out.print("This is printed using normal print()");
        System.out.println("\nThis is printed using println() function or method !");

        // Formatted Output
        char c1 = 'a';
        System.out.printf("This is normal character output using %c\n",c1);
        System.out.printf("This is changed to Capital Letter now %C\n",c1);

        int number = 100;
        System.out.printf("Formatted Integer : %,d%n\n",number);

        double n1 = 3.14123;
        System.out.printf("Simple Formatting of double : %f\n",n1);
        System.out.printf("Printing Double with 3 digits after decimal : %5.3f\n",n1);
        System.out.printf("Printing Double with 2 digits after decimal : %5.2f\n",n1);

        boolean bool2 = true;
        System.out.printf("Boolean Formatting simple : %b\n",bool2);
        System.out.printf("Boolean Formatting in Bold : %B\n",bool2);

        String str1 = "Ack Wolver";
        System.out.printf("String all in upper case using formatting : %S\n",str1);
        System.out.printf("String all in lower case using formatting : %s\n",str1);

        scn.close();
    }
}