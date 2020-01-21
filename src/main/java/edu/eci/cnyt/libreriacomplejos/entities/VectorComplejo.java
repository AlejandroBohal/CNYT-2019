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
public class VectorComplejo {
    private List<Complejo> vector;
    
    public VectorComplejo(List<Complejo> vector){
        this.vector = vector;
    }
    public VectorComplejo sumar(VectorComplejo vectorComplejo) throws LibreriaComplejosException{
        if (vectorComplejo.size() != this.size()){
            throw new LibreriaComplejosException (LibreriaComplejosException.getMessage(this.size(),vectorComplejo.size()));
        }
        for (int i=0;i<vector.size();i++){
            vector.set(i, vector.get(i).sumar(vectorComplejo.get(i)));
        }
        return this;
    }
    public VectorComplejo restar(VectorComplejo vectorComplejo){
        for (int i=0;i<vector.size();i++){
            vector.set(i, vector.get(i).restar(vectorComplejo.get(i)));
        }
        return this;
    }
    public VectorComplejo inversa(){
        for (int i=0;i<vector.size();i++){
            vector.set(i, vector.get(i).negativo());
        }
        return this;
    }
    public VectorComplejo multiplicacionEscalar(Complejo complejo){
        for (int i=0;i<vector.size();i++){
            vector.set(i, vector.get(i).multiplicar(complejo));
        }
        return this;
    }
    public Complejo get(int i){
        return vector.get(i);
    }
    public List<Complejo> getVector() {
        return vector;
    }
    
    public void setVector(List<Complejo> vector) {
        this.vector = vector;
    }
    private int size(){
        return vector.size();
    }
    @Override
    public String toString() {
        return "VectorComplejo{" + "vector=" + vector + '}';
    }
    
    
}   
