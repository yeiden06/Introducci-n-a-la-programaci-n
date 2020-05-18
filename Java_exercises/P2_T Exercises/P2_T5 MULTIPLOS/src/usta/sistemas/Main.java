package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR:Juan David Neira Martinez
     *DATE:14/04/2020
     *DESCRIPTION:this program show multiplos
     */
        f_menu();
        f_multiplo();
    }
    public static void f_menu(){
        System.out.println("........................");
        System.out.println(".  SoftMultiplos       .");
        System.out.println(".   Version 1.0        .");
        System.out.println(".Created by: Juan David.");
        System.out.println("........................");
    }
    public static boolean f_multiplo(int n1, int n2){
        boolean multiplo = false;
        if (n1%n2 == 1){
            multiplo == true;
        }
    }
    return multiplo;
}
