/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_queue;

/**
 *
 * @author laex2
 */
public class MyQueue extends Lista {
    //COMO LA FILA DE SUPERMERCADO
    //LOS ELEMENTOS SE AGREGAN AL FINAL DE LA LISTA
    //METODO ADD DE LA LISTA --> SIN CAMBIOS
    //SOLO PODEMOS ACCEDER AL INICIO DE LA LISTA
    public int peek() throws Exception{ //REGRESA EL VALOR DEL ELEMENTO AL INICIO DE LA LISTA
        return get(0);
    }
    
    public int poll() throws Exception{//REGRESA Y ELIMINA   EL ELEMENTO AL INICIO DE LA LISTA
        //GUARDAR EL VALOR
          int iVal = get(0);
        //ELIMINAR EL VALOR
        
        //ENVIAMOS EL VALOR
      
    }
}
