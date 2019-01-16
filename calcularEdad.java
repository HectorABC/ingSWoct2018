/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edad;

import java.io.BufferedWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.File;
import java.io.FileWriter;
/**
 *
 * @author Alberto Alarcon
 */
/*
FUNCIONAMIENTO DEL PROGRAMA.
1.	Inicialmente realizamos un import de las librer�as necesarias para los c�lculos que se explicaran m�s adelante. 
2.	Se declara una clase calcularEdad.
3.	Se declara la funci�n main que muestra los a�os.
4.	A continuaci�n se declara la funci�n calcular que recibe un tipo de dato Calendar fechaNac de las librer�as que se import� al inicio del programa, se declara fechaActual del tipo de dato Calendar que recibe como dato la fecha actual. Seguidamente se declaran los datos a�os, meses y d�as de tipo entero que reciben datos de los c�lculos entre los objetos fechaActual y fechaNac respectivamente, que es la resta entre la fecha actual y la de nacimiento para lo cual se usa la funci�n get del objeto Calendar que obtiene los datos respectivamente.
5.	Finalmente se procede a la compilaci�n y corrida del programa.
*/
public class calcularEdad {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        		// TODO Auto-generated method stub
		// Mostramos el resultado de llamar a la función calcular pasando
		// como parametro la fecha de nacimiento YYYY-MM-DD
                  int edad = calcular(new GregorianCalendar(2007,03,14));
        /* Escribe la edad en el fichero Edad*/  
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
                  
		System.out.println(calcular(new GregorianCalendar(2007,03,14)));
    }
        public static int calcular(Calendar fechaNac) {

        Calendar fechaActual = Calendar.getInstance();
        // Cálculo de las diferencias.

        int a�os = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int meses = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int dias = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.

        if(meses < 0 // Aún no es el mes de su cumpleaños
           || (meses==0 && dias < 0)) { // o es el mes pero no ha llegado el día.
            a�os--;
        }

        return a�os;

    }
    
}

