package util;
import java.util.Scanner;
import java.util.InputMismatchException;
public class InputHelper {
    public static int readInt(Scanner sc, String msg) {
        while(true) {
            try{
                System.out.println(msg);
                return sc.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Enter valid Input!");
                sc.nextLine();
            }
        }
    }
    public static String readString(Scanner sc,String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }
    public static double readDouble(Scanner sc, String msg) {
        while(true) {
        try{
            System.out.println(msg);
            return sc.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println("Enter valid Input!");
            sc.nextLine();
        }}
    }
}