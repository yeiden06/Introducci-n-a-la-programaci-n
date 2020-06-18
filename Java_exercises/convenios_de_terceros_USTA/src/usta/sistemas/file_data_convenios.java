package usta.sistemas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class file_data_convenios {
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
}