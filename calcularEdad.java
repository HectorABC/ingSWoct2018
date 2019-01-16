/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edad;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Alberto Alarcon
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
		System.out.println(calcular(new GregorianCalendar(1977,03,14)));
    }
        public static int calcular(Calendar fechaNac) {

        Calendar fechaActual = Calendar.getInstance();
        // Cálculo de las diferencias.

        int años = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int meses = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int dias = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.

        if(meses < 0 // Aún no es el mes de su cumpleaños
           || (meses==0 && dias < 0)) { // o es el mes pero no ha llegado el día.
            años--;
        }

        return años;

    }
    
}
