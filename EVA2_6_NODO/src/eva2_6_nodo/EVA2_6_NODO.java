/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_nodo;

/**
 *
 * @author laex2
 */
public class EVA2_6_NODO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo inicio = new Nodo();
        inicio.datos = 100;
        inicio.referencia = new Nodo();
        inicio.referencia.datos = 200;
        inicio.referencia.referencia = null;
        System.out.println( inicio.referencia);
    }
    
}

class Nodo{
    int datos; //GUARDAMOS INFORMACION
    Nodo referencia; //NOS PERMITE DECLARAR NODOS Y CADENAS (LISTAS)
}