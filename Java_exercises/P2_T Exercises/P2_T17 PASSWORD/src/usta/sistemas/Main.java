package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan David Neira Martinez
     *DATE:23/04/2020
     *DESCRIPTION:This software asks for a password or until the number 352,259 or 569
     */
        f_menu();
        int n_intentos = 1;
        boolean option = f_input_passwords();
        while (n_intentos <= 3 && option == false) {
            System.err.println("The password is wrong, try again: ");
            n_intentos += 1;
            option = f_input_passwords();
        }
        if (n_intentos == 4) {
            System.out.println("You cannot get into the platform");
        }else{
            System.out.println("Welcome to the platform");
        }
    }

    public static void f_menu() {
        System.out.println("...........................");
        System.out.println(".   SoftPassword          .");
        System.out.println(".   V1.0 22/04/2020       .");
        System.out.println(". Created by: juan david  .");
        System.out.println("...........................");
    }

    public static boolean f_input_passwords() {
        //DESCRIPTION: This method returns the value of the password
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the password");
        boolean pass = false;
        int password = keyboard.nextInt();
        if (password == 352 || password == 259 || password == 569) {
            pass = true;
        }
        return pass;
    }
}
