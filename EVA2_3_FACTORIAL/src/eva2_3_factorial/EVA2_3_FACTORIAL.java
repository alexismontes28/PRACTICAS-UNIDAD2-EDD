/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_factorial;

/**
 *
 * @author Alexis
 */
public class EVA2_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Factorial de 5 = " + factorial(5));

    }

    public static int factorial(int iVal){ //FACTORIAL USANDO FACTORIAL
        if (iVal == 0) //SE DETIENE RECURSIVIDAD
            return 1;
        else
            return iVal * factorial(iVal -1); //SE EJECUTA USANDO RECURSIVIDAD
    }

    public static int factorialFor(int iVal){ //FACTORIAL CON UN CICLO
        int iTemp = 0;
        for (int i = iVal; i > 0; i--){
            iTemp = iTemp+1;
        }
        return iTemp;
    }
    }
