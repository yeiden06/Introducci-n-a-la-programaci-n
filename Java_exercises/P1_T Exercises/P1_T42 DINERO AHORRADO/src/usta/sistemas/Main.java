package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Juan David Neira Martinez
	 *DATE: 01/04/2020
	 *DESCRIPTION: This software determines the money
	 */
        Scanner keyboard = new Scanner(System.in);
        f_menu(); //Llamo el método llamado f_menu();
        System.out.println("Input your salary: ");
        int salary = keyboard.nextInt();
        f_saved_money(salary);
    }
    public static void f_menu(){
        //Description: Show the menu
        System.out.println("..................");
        System.out.println(".  SoftSaveMoney .");
        System.out.println(".   Version:1.0  .");
        System.out.println(". Maker:Juan David.");
        System.out.println("..................");
    }
    public static void f_saved_money (int p_salary){
        //Description: This method calculates the total saved money in a year
        double saved_money = ((p_salary*0.15)*4)*12;
        System.out.println("The total saved money in a year is: "+saved_money);
    }
}
