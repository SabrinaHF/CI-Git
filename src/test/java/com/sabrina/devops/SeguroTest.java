package com.sabrina.devops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SeguroTest {

    @Test
    public void valorAbaixoDoLimite(){

        String resultado = Seguro.verificarCobertura(150000);
        assertEquals("Valor dentro do limite de cobertura do FGC.", resultado);
    }

    @Test
    public void valorAcimaDoLimite(){

        String resultado = Seguro.verificarCobertura(1000);
        assertEquals("Valor fora do limite de cobertura do FGC!", resultado);
    }

    @Test 
    public void valorNegativo(){
        String resultado = Seguro.verificarCobertura(-5000);
        assertEquals("Valor inválido!", resultado);
    }
}
