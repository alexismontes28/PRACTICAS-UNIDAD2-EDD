/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_8_lista_doble;

/**
 *
 * @author laex2
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int tama;
    
    public ListaDoble(){
        inicio = null;//LISTA VACIA
        fin = null;
    }
    
    
      //AGREGAR NODOS
        public void add(int valor){
            Nodo Nuevo = new Nodo(valor);
            //Hay nodos en la lista?
            if(inicio == null){
            inicio = Nuevo; //CONECTAMOS EL PRIMER NODO A LA LISTA
            fin = Nuevo;
        }else{
                fin.setSiguiente(Nuevo);
                Nuevo.setPrevio(fin);
                fin = Nuevo; //NOS MOVEMOS AL FINAL DE LA LISTA
                }
        tama++;
        }
        
   

}
