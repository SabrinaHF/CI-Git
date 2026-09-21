    package com.sabrina.devops;



    public class Seguro 
    {
        public static String verificarCobertura(double valorSaldo){

            if(valorSaldo < 0){
                return "Valor inválido!";
            }else if(valorSaldo > 250000){
                return "Valor fora do limite de cobertura do FGC!";  
            }
            return "Valor dentro do limite de cobertura do FGC.";
        }
 
    }
