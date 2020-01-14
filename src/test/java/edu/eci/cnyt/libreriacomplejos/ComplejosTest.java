/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cnyt.libreriacomplejos;

import edu.eci.cnyt.libreriacomplejos.entities.Complejo;
import edu.eci.cnyt.libreriacomplejos.entities.ComplejoPolar;
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
    
}
