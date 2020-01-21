/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.libreriacomplejos.entities;

import edu.eci.cnyt.libreriacomplejos.exceptions.LibreriaComplejosException;
import java.util.List;

/**
 *
 * @author sergio.bohorquez
 */
public class MatrizCompleja {
    private List<VectorComplejo> matriz;
    
    public MatrizCompleja(List<VectorComplejo> matriz){
        this.matriz = matriz;
    }
    public MatrizCompleja sumar(MatrizCompleja matrizOperar) throws LibreriaComplejosException{
        for (int i=0;i<this.matriz.size();i++){
           matriz.set(i,matriz.get(i).sumar(matrizOperar.get(i)));
        }
    return this;
    }
    public MatrizCompleja restar(MatrizCompleja matrizOperar){
        for (int i=0;i<this.matriz.size();i++){
           matriz.set(i,matriz.get(i).restar(matrizOperar.get(i)));
        }
    return this;
    }
    public MatrizCompleja inversa(MatrizCompleja matrizOperar){
        for (int i=0;i<this.matriz.size();i++){
           matriz.set(i,matriz.get(i).inversa());
        }
    return this;
    }
    private VectorComplejo get(int i){
        return matriz.get(i);
    }

    @Override
    public String toString() {
        return "MatrizCompleja{" + "matriz=" + matriz + '}';
    }
    
}
