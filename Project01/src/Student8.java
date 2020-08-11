import sun.java2d.windows.GDIWindowSurfaceData;

import java.util.Scanner;

public class Student8 {
    /** public static final double PI = 3.141592; // so Pi
    public static final float G = 9.798f;

    public static void main(String[] args) {
        final double PI = 3.141592; // so Pi
        final float G = 9.798f;
        System.out.println(G);
        showGValue();
        showPiValue();
    }

    public static void showGValue() {
        System.out.println(G);

    }

    public static void showPiValue() {
        System.out.println(PI);
    } **/

    public int rollNo;
    public String name;
    static String college = "Harvard Lang University";

    Student8(int r , String n) {
        rollNo = r;
        name = n ;
    }
    void display() {
        System.out.println(rollNo + " - " + name + " - " + college);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter student roll number here: ");
        int rollNo = scn.nextInt();
        System.out.println("Enter student name here: ");
        String name = scn.nextLine();
        System.out.println("Continue to add more student...");

        Student8 s1 = new Student8(rollNo,name);
        Student8 s2 = new Student8(rollNo,name);
        s1.display();
        s2.display();
        /** Student8 s1 = new Student8(123, "Le A");
        Student8 s2 = new Student8(124, "Le B");
        s1.display();
        s2.display(); **/

    }


}
