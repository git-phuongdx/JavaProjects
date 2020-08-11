import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n" ,
                Integer.TYPE , Integer.BYTES , Integer.MIN_VALUE , Integer.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n" ,
                Short.TYPE , Short.BYTES , Short.MIN_VALUE , Short.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n" ,
                Long.TYPE , Long.BYTES , Long.MIN_VALUE , Long.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n" ,
                Byte.TYPE , Byte.BYTES , Byte.MIN_VALUE , Byte.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n" ,
                Double.TYPE , Double.BYTES , Double.MIN_VALUE , Double.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n" ,
                Float.TYPE , Float.BYTES , Float.MIN_VALUE , Float.MAX_VALUE);
        System.out.printf("Type: %-10s Size: %-2s Min: %-20s Max: %-20s\n" ,
                Character.TYPE , Character.BYTES , Character.MIN_VALUE , Character.MAX_VALUE);

        int randomNumber = (int)(Math.random() *  101 );
        System.out.println(randomNumber);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int yourNumber = scn.nextInt();
        // System.out.println((int)(Math.random() * 101 ));
        if (yourNumber > randomNumber) {
            System.out.println("Your Number :" + yourNumber + "\tgreater than my number : " + randomNumber);
        } else {
            System.out.println("Your Number :" + yourNumber + "\tless than my number : " + randomNumber);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your time");
        int time = sc.nextInt();
        String result = ( time > 1 && time < 12) ? "Morning" : "Afternoon";
        System.out.println("\t It is " + result);



        /*
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String myName = scn.nextLine();
        System.out.println("Enter your age: ");
        String myAge = scn.nextLine();
        System.out.println("Enter your gender: ");
        String myGender = scn.nextLine();
        System.out.println("Enter your hometown: ");
        String myHome = scn.nextLine();
        System.out.println("Name: " + myName + "\t" + "Age: " + myAge + "\t" + "\t" +
                "Gender: " + myGender + "\t" +  "HomeTown: " + myHome + "\t"); */

    }
}
