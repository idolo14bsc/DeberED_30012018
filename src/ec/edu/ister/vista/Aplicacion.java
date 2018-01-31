package ec.edu.ister.vista;
import ec.edu.ister.modelo.Lista;
import java.util.Random;

/**
 *
 * Nombre: Cristian Calle
 * Ejercicio8.1. Escribir un método, en la clase Lista,	que devuelva cierto 
 * si la lista está vacía.
 */
public class Aplicacion {
    public static void main(String[] args) {
                
         Random r;
        int d;
        Lista lista;
        int k;
        r=new Random(); 
        lista=new Lista();                      // Crea una lista vacia
        k=Math.abs(r.nextInt()%55);             //Numero de nodos
                                                //Se insertan elementos de la lista
        for(;k>0;k--){
            d=r.nextInt()%99;
            lista.insertarCabezaLista(d);   
        }
                                                //Recorre la lista para escribir sus elementos
        System.out.println("Elementos de la lista generados al azar");
        lista.visualizar();  
                                                //Imprime falso porque si hay elementos en la lista 
        System.out.println("La lista se encuentra vacia:   "+lista.ListaVacia());
    }
    
    

}
