/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.libreriacomplejos.entities;

import edu.eci.cnyt.libreriacomplejos.exceptions.LibreriaComplejosException;
import java.util.ArrayList;
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
    public MatrizCompleja(double[][][] vector){
        
        MatrizCompleja matriz = new MatrizCompleja(new ArrayList());
        for(int i=0;i<vector.length;i++){
            VectorComplejo vectorAnadir = new VectorComplejo(new ArrayList());
            for(int j=0;j<vector[i].length;j++){
                Complejo complejoAnadir = new Complejo(vector[i][j][0],vector[i][j][1]);
                vectorAnadir.add(complejoAnadir);
                }
            matriz.add(vectorAnadir);
            }
        this.matriz = matriz.getMatriz();
    
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
    public void add(VectorComplejo v){
        matriz.add(v);
    }
    private VectorComplejo get(int i){
        return matriz.get(i);
    }

    public List<VectorComplejo> getMatriz() {
        return matriz;
    }

    public void setMatriz(List<VectorComplejo> matriz) {
        this.matriz = matriz;
    }
    public MatrizCompleja multiplicacionEscalar(Complejo complejo){
        for(int i=0;i<matriz.size();i++){
            for(Complejo c: matriz.get(i).getVector()){
                c.multiplicar(complejo);
            }
        }
        return this;
    }
    @Override
    public String toString() {
        return "MatrizCompleja{" + "matriz=" + matriz + '}';
    }
    
}
