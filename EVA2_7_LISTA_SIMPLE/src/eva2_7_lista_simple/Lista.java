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
public class Lista { //LISTA SIMPPLEMENTE ENLAZADA (LINKED LSIT)
     private Nodo inicio;//ACCESO A MI LISTA
    private Nodo fin;
    private int tama;
    
        public Lista(){
            inicio = null;//LISTA VACIA
            fin = null;
        }
    
    //AGREGAMOS NODOS
    public void add(Nodo nuevo){
        if(inicio == null){//LISTA VACIA
            inicio = nuevo;//CONECTAMOS EL PRIMER NODO A LA LISTA
            fin = nuevo;
        }else{
            //USAMOS TEMP PARA LLEGAR AL FINAL DE LA LISTA
            Nodo temp = inicio;
            //WHILE
            while(temp.getSiguiente() != null){//SIEMPRE QUE TEMP SEA != A NULL SE UTILIZARA EL CICLO
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);//CONECTAMOS AL FINAL DE LA LISTA EL NODO
        }
    }
    //IMPRIMIMOS LA LISTA
    public void printList(){
        Nodo temp = inicio;
        //WHILE
        while(temp != null){
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente();
            
            
        }        
    }
    //BORRAR LA LISTA
            public void clear(){
         inicio = null;
         fin = null;
        }
            
            //CONTAR LOS NODOS
            public int lenght(){ //O(N)
                int iCont = 0;                
                Nodo temp = inicio;
                while(temp != null){
                    iCont++;
                temp = temp.getSiguiente(); //MOVER A TEMP AL SIGUIENTE NODO
                }
                return iCont;
            }
            
            //LA LISTA ESTA VACIA: TRUE, CON NODOS: FALSE
            public boolean isEmpty(){
                if(inicio == null)
                    return true;
                else
                    return false;
            }
            //RECUPERAR UN VALOR DE UNA LISTA
            public int get(int pos ) throws Exception{
                //Verificacion
              
                if(isEmpty()){   //LISTA VACIA 
                    throw new Exception ("No hay valores almacenados en esta lista!!");
                }else{        //POSICION QUE NO EXISTA: POSICION NEGATIVA O QUE NOS PASEMOS      
                    //POS TIENE QUE ESTAR ENTRE 0 Y N-1  N --> ES EL TAMANO
                    if((pos  < 0) &&(pos >= lenght())) // SI POS ES MENOR A 0 O ES MAYOR A N-1
                    throw new Exception ("El valor "  + pos + "no es una posicion valida en la lista!!");
                }
             
                Nodo temp = inicio;
                for (int i = 0; i < pos; i++) {
                    temp = temp.getSiguiente();                    
                }
                return temp.getDato();
            }
}
    