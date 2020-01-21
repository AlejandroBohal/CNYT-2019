/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.libreriacomplejos.demo;

import edu.eci.cnyt.libreriacomplejos.entities.VectorComplejo;
import java.util.ArrayList;
import edu.eci.cnyt.libreriacomplejos.entities.Complejo;
import edu.eci.cnyt.libreriacomplejos.exceptions.LibreriaComplejosException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sergio.bohorquez
 */
public class Main {
    public static void main(String args[]){
        ArrayList<Complejo> vector1 = new ArrayList<>();
        vector1.add(new Complejo(0.5,2));
        vector1.add(new Complejo(0.3,2.2));
        ArrayList<Complejo> vector2 = new ArrayList<>();
        vector2.add(new Complejo(0.4,2));
        vector2.add(new Complejo(0.5,2.2));
        VectorComplejo vectorResultado = new VectorComplejo(vector1);
        VectorComplejo vectorASumar = new VectorComplejo(vector2);
        try {
            vectorResultado.sumar(vectorASumar);
        } catch (LibreriaComplejosException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(vectorResultado);
 
    }
}
