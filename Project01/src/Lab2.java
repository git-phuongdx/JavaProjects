import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import java.util.Scanner;

public class Lab2 {
    // public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        /** Question 1
        System.out.println("Please input number a : ");
        Scanner scn = new Scanner(System.in);
        Integer numberA = scn.nextInt();
        System.out.println("Please input number b : ");
        Integer numberB = scn.nextInt();
        if ( numberA == 0 ) {
            if (numberB == 0 ) {
                System.out.println("We've plenty of results");
            } else {
                System.out.println("We don't have any results");
            }
        } else {
            Integer ResultX = - numberA / numberB;
            System.out.println("Result of number A : s" + numberA + " and number B : " + numberB + " is " + ResultX);
        }
         **/
        /** Question 2 **/
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number A : ");
        Integer numberA = scn.nextInt();
        System.out.println("Input number B : ");
        Integer numberB = scn.nextInt();
        System.out.println("Input number C : ");
        Integer numberC = scn.nextInt();
        if ( numberA == 0 ) {
            if ( numberB == 0 ) {
                System.out.println("We don't have any results");
            } else {
                Integer resultLinear = + ( - numberA / numberB );
                System.out.println("We only have one result" + " x = "  + resultLinear);
            }
        }
        float delta = numberB * numberB - 4 * numberA * numberC;
        float x1 ;
        float x2 ;
        if ( delta < 0 ) {
            System.out.println("We don't have any result1");
        } else if ( delta == 0 ) {
            x1 = - ( numberB / ( 2 * numberA ));
            System.out.println("We have two same result: " + "x1 = x2 " + x1);
        } else {
            x1 = (float) ( (- numberB - Math.sqrt(delta)) / ( 2 * numberA) );
            x2 = (float) ( (- numberB + Math.sqrt(delta)) / ( 2 * numberA) );
            System.out.println("We only have two extinction numbers : " + x1 + " and " + x2);
        }

    }

}
