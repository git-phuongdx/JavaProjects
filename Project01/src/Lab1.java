import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Lab1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Question 1 :


         Scanner scn = new Scanner(System.in);
         System.out.println("Name : ");
         String myName = scn.nextLine();
         System.out.println("Average : ");
         double averagePoint = scn.nextDouble();
         System.out.println("\nMy Name : " + myName);
         System.out.println("My Average Points : " + averagePoint);
         System.out.printf("%s %f Points",myName,averagePoint);

         */
        /**
         * Question 2:


        System.out.println("Enter number a : ");
        int heightA = scn.nextInt();
        System.out.println("Enter number b : ");
        int widthB = scn.nextInt();
        int perimeter = (heightA + widthB) * 2;
        int acreage = heightA* widthB;
        int minEdge = Math.min(heightA , widthB);
        System.out.println("Perimeter of : " + heightA + " and " + widthB + " is: " + perimeter);
        System.out.println("Acreage of : " + heightA + " and " + widthB + " is: " + acreage);
        System.out.println("Min edge of : " + heightA + " and " + widthB + " is: " + minEdge);

         */
        /**
         * Question 3:

        System.out.println("Enter edge of cubic : ");
        int cubicA = scn.nextInt();
        System.out.println("Cubic volume with : " + cubicA + " is " + Math.pow(cubicA,3));
         */
        /**
         *  Question 4:

        System.out.println("enter number A : ");
        int a = scn.nextInt();
        System.out.println("enter number B : ");
        int b = scn.nextInt();
        System.out.println("enter number C : ");
        int c = scn.nextInt();
        double delta = (Math.pow(b,2) - 4 ) * a * c;
        double squareOfDelta = Math.sqrt(delta);
        System.out.println(delta);
        System.out.println(squareOfDelta);
         */
    }
}
