/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_lista_simple;

/**
 *
 * @author laex2
 */
public class EVA2_7_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear una Lista
       Lista miLista = new Lista();
        /* int[] miArreglo = new int [1000];
        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i] = (int)(Math.random() * 1000);
        }
        for (int i = 0; i < miArreglo.length; i++) {
            miLista.add(new Nodo(1));
        }    
        System.out.println(miLista);    */
         
    
      miLista.add(new Nodo(100));
      miLista.add(new Nodo(200));
      miLista.add(new Nodo(300));
      miLista.add(new Nodo(400));
      miLista.printList();
        System.out.println("Cantidad de nodos: " + miLista.lenght());
      
        try {
            System.out.println("Posicion " + miLista.get(10));
        } catch (Exception ex) {   //AQUI SE REMUEVE EL ERROR
            ex.printStackTrace(); //IMPRIME EL ERROR
        }
        
        }
   }

