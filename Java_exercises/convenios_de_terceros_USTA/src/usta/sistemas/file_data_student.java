package usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file_data_student {
    //AUTHOR:Juan David Neira Martinez
    //DATE: 09/06/2020
    //DESCRIPTION:this software shows the information about file d:/students.txt
    public static boolean f_add_student(String p_name,String p_lastname,String p_faculty) {
        //DESCRIPTION: this method create new line into a file d:/students.txt
        boolean result;
        try {
            File myFile = new File("d:/students.txt");
            if(myFile.exists()){
                //instanciamos el archivo con TRUE para agregar nuevas lineas
                FileWriter myFile2 = new FileWriter(myFile,true);
                //cargar la data del archivo en memoria
                BufferedWriter datamyFile = new BufferedWriter(myFile2);
                datamyFile.write("\n"+p_name+"|"+p_lastname+"|"+p_faculty);
                datamyFile.close();
                result = true;
            }else{
                result = false;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String[][] f_all_data_students(){
        //DESCRIPTION: this method returns all data (all lines) of file d:/students.txt
        String[][] matrix_students;
        String linea_texto, linea_tmp;
        int row=0, total_lines=0, separador1, separador2;
        try{
            File myFile = new File("d:/students.txt");
            if(myFile.exists()){
                Scanner myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()){
                    total_lines++;
                    myFile2.nextLine();
                }
                myFile2.close();
                myFile2=null;
                matrix_students = new String[total_lines][3];
                myFile2 = new Scanner(myFile);
                while (myFile2.hasNextLine()){
                    linea_texto=myFile2.nextLine();
                    separador1= linea_texto.indexOf("|");
                    if(separador1!=-1) {  //garantizamos que la linea de texto tenga datos
                        matrix_students[row][0] = linea_texto.substring(0, separador1);  //solo el nombre del estudiante
                        linea_tmp = linea_texto.substring(separador1 + 1);
                        separador2 = linea_tmp.indexOf("|");
                        matrix_students[row][1] = linea_tmp.substring(0, separador2);   //solo el apellido
                        matrix_students[row][2] = linea_tmp.substring(separador2 + 1);   //solo la facultad
                        row++;
                    }
                }
                myFile2.close();
                return  matrix_students;
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
