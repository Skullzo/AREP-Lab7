package edu.escuelaing.arep;
/**
 * Clase encargada de realizar los respectivos calculos para convertir de grados Fahrenheit a grados Celsius.
 * @author  Alejandro Toro Daza
 * @version 1.0.  (17 de Marzo del 2021) 
 */
public class MathServices {
    /**
     * Metodo encargado de realizar las operaciones correspondientes para poder realizar la respectiva conversion de grados Fahrenheit a grados Celsius.
     * @param i Parametro que indica la lista de los elementos a evaluar.
     * @return Retorna el valor ingresado pero ya convertido en grados Celsius.
     */
    public static Integer square(Integer i){
        i = (i - 32 ) * 5 / 9;
        return i;
    }
}