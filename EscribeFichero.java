/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto Alarcon
 */
import java.io.*;

public class EscribeFichero
{
    public static void main(String[] args)
    {
       /* FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("c:/prueba.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < 10; i++)
                pw.println("Linea " + i);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }*/
        int edad = 41;
        File archivo;
        BufferedWriter buferescritor;
        FileWriter escritor;
        try {
            escritor = new FileWriter("Edad");
            buferescritor = new BufferedWriter(escritor);
            buferescritor.write(edad);
            buferescritor.close();
            escritor.close();
            
            
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}