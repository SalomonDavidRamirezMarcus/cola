/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author salomon.ramirez
 */
public class cola <T extends base> {
    LinkedList<T> elems;
    public cola(){
        elems = new LinkedList<>();
    }
    
    public void encolar(T elemento){
        elems.addLast(elemento);
    }
    
    public T decencolar(){
        return elems.removeFirst();
    }
    
    public boolean estaVacia(){
        return elems.isEmpty();
    }   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{");
        
        for (T elemento : elems){
            sb.append("").append(elemento.toString());
           
        }
        sb.append("{");
        return sb.toString();
    }
}
