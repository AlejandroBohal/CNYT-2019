/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.libreriacomplejos;

import edu.eci.cnyt.libreriacomplejos.entities.Complejo;
import edu.eci.cnyt.libreriacomplejos.entities.ComplejoPolar;
import edu.eci.cnyt.libreriacomplejos.entities.MatrizCompleja;
import edu.eci.cnyt.libreriacomplejos.entities.VectorComplejo;
import edu.eci.cnyt.libreriacomplejos.exceptions.LibreriaComplejosException;
import java.util.ArrayList;
import org.junit.Assert;

import org.junit.Test;

/**
 *
 * @author 2146516
 */
public class ComplejosTest {
    
    @Test
    public void deberiaSumar(){
       Complejo complejo1 = new Complejo(1.0,2.0);
       Complejo complejo2 = new Complejo(3.0,4.0);
       complejo1 = complejo1.sumar(complejo2);
       Assert.assertTrue(complejo1.equals(new Complejo(4.0,6.0)));
       
       
    }
    @Test
    public void deberiaRestar(){
       Complejo complejo1 = new Complejo(2.0,2.0);
       Complejo complejo2 = new Complejo(2.0,4.0);
       complejo1 = complejo1.restar(complejo2);
       Assert.assertTrue(complejo1.equals(new Complejo(0.0,-2.0)));
       
       
    }
    @Test
    public void deberiaMultiplicar(){
       Complejo complejo1 = new Complejo(-2.2,2.0);
       Complejo complejo2 = new Complejo(-2.2,4.0);
       complejo1 = complejo1.multiplicar(complejo2);
       Assert.assertTrue(complejo1.equals(new Complejo(-3.16,-13.2)));
       
    }
    @Test
    public void deberiaDividir(){
       Complejo complejo1 = new Complejo(-4.2,3.0);
       Complejo complejo2 = new Complejo(2.2,1.0);
       complejo1 = complejo1.dividir(complejo2);
       Assert.assertTrue(complejo1.equals(new Complejo(-1.068493,1.849315)));
    }
    @Test
    public void deberiaSacarModulo(){
       Complejo complejo1 = new Complejo(5.0,3.43);
       Assert.assertTrue(complejo1.modulo()-6.063406 <= 0.00001);
       
    }
    @Test
    public void deberiaSacarConjugado(){
       //prueba 1
       Complejo complejo1 = new Complejo(5.0,3.43);
       complejo1 = complejo1.conjugado();
       Assert.assertTrue(complejo1.equals(new Complejo(5.0,-3.43)));
       //prueba 2
       Complejo complejo2 = new Complejo(32143.33,-331421);
       complejo2 = complejo2.conjugado();
       Assert.assertTrue(complejo2.equals(new Complejo(32143.33,331421)));
       // prueba 3
       Complejo complejo3 = new Complejo(0.0,0.0);
       complejo3 = complejo3.conjugado();
       Assert.assertTrue(complejo3.equals(new Complejo(0.0,0.0)));
       
    }
    @Test
    public void deberiaConvertirAPolar(){
        Complejo complejo1 = new Complejo(5.0,3.43);
        ComplejoPolar complejoPrueba = complejo1.cartesianaAPolar();
        Assert.assertTrue(complejoPrueba.equals(new ComplejoPolar(6.063406633,0.601268065)));
    }
    @Test
    public void deberiaSumarVectores() throws LibreriaComplejosException{
        ArrayList<Complejo> vector1 = new ArrayList<>();
        vector1.add(new Complejo(0.5,2));
        vector1.add(new Complejo(0.3,2.2));
        ArrayList<Complejo> vector2 = new ArrayList<>();
        vector2.add(new Complejo(0.4,2));
        vector2.add(new Complejo(0.5,2.2));
        VectorComplejo vectorResultado = new VectorComplejo(vector1);
        VectorComplejo vectorASumar = new VectorComplejo(vector2);
        vectorResultado.sumar(vectorASumar);
        System.out.println(vectorResultado);
    }
    @Test
    public void deberiaRestarVectores(){
        ArrayList<Complejo> vector1 = new ArrayList<>();
        vector1.add(new Complejo(0.5,2));
        vector1.add(new Complejo(0.3,2.2));
        ArrayList<Complejo> vector2 = new ArrayList<>();
        vector2.add(new Complejo(0.4,2));
        vector2.add(new Complejo(0.5,2.2));
        VectorComplejo vectorResultado = new VectorComplejo(vector1);
        VectorComplejo vectorARestar = new VectorComplejo(vector2);
        vectorResultado.restar(vectorARestar);
        System.out.println(vectorResultado);
    }
    @Test
    public void deberiaSacarInversoVector(){
        ArrayList<Complejo> vector1 = new ArrayList<>();
        vector1.add(new Complejo(0.5,2));
        vector1.add(new Complejo(0.3,2.2));
        vector1.add(new Complejo(0.4,2));
        vector1.add(new Complejo(0.5,2.2));
        VectorComplejo vectorResultado = new VectorComplejo(vector1);
        vectorResultado.inversa();
        System.out.println(vectorResultado);
    }
    @Test
    public void deberiaSacarInversoMatriz(){
        ArrayList<Complejo> vector1 = new ArrayList<>();
        vector1.add(new Complejo(0.1,1));
        vector1.add(new Complejo(0.2,2.2));
        vector1.add(new Complejo(0.3,3));
        vector1.add(new Complejo(0.4,4.2));
        ArrayList<Complejo> vector2 = new ArrayList<>();
        vector2.add(new Complejo(0.5,2.5));
        vector2.add(new Complejo(0.6,2.6));
        vector2.add(new Complejo(0.7,2.0));
        vector2.add(new Complejo(0.8,2.2));
        ArrayList<Complejo> vector3 = new ArrayList<>();
        vector3.add(new Complejo(0.9,1.2));
        vector3.add(new Complejo(1.0,4.2));
        vector3.add(new Complejo(1.1,2.2));
        vector3.add(new Complejo(1.2,3.2));
        ArrayList<Complejo> vector4 = new ArrayList<>();
        vector4.add(new Complejo(1.3,2.1));
        vector4.add(new Complejo(1.4,2.2));
        vector4.add(new Complejo(1.5,9.2));
        vector4.add(new Complejo(1.6,7.2));
        ArrayList<VectorComplejo> matriz = new ArrayList<>();
        matriz.add(new VectorComplejo(vector1)); matriz.add(new VectorComplejo(vector2));
        matriz.add(new VectorComplejo(vector3)); matriz.add(new VectorComplejo(vector4));
        MatrizCompleja matrizCompleja = new MatrizCompleja(matriz);
        System.out.println(matrizCompleja.inversa(matrizCompleja));
    }
    
    
}
