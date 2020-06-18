package usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_convenios {
    //AUTHOR:Juan David Neira Martinez
    //DATE:09/06/2020
    //DESCRIPTION:this method save the convenios
    public static boolean f_add_convenio(String p_codigo, String p_Nombre_tercero, String p_objetivo, String p_tiempo) {
        //DESCRIPTION: this method create new line into a file d:/convenios.txt
        boolean result;
        try {
            File myFile = new File("d:/convenios.txt");
            if (myFile.exists()) {
                //instanciamos el archivo con TRUE para agregar nuevas lineas
                FileWriter myFile2 = new FileWriter(myFile, true);
                //cargar la data del archivo en memoria
                BufferedWriter datamyFile = new BufferedWriter(myFile2);
                datamyFile.write("\n" + p_codigo + "|" + p_Nombre_tercero + "|" + p_objetivo + "|" + p_tiempo);
                datamyFile.close();
                result = true;
            } else {
                result = false;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public static String[][] f_all_convenios(){
        //DESCRIPTION: this method returns all data (all lines) of file d:/convenios.txt
        String[][] matrix_convenios;
        String linea_texto, linea_tmp;
        int row=0, total_lines=0, separador1, separador2;
        try{
            File myFile = new File("d:/convenios.txt");
            if(myFile.exists()){
                Scanner myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()){
                    total_lines++;
                    myFile2.nextLine();
                }
                myFile2.close();
                myFile2=null;
                matrix_convenios = new String[total_lines][3];
                myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()){
                    linea_texto=myFile2.nextLine();
                    separador1= linea_texto.indexOf("|");
                    if(separador1!=-1) {  //garantizamos que la linea de texto tenga datos
                        matrix_convenios[row][0] = linea_texto.substring(0, separador1);
                        linea_tmp = linea_texto.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix_convenios[row][1] = linea_tmp.substring(0, separador2);
                        matrix_convenios[row][2] = linea_tmp.substring(separador2 + 1);
                        row++;
                    }
                }
                myFile2.close();
                return  matrix_convenios;
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}