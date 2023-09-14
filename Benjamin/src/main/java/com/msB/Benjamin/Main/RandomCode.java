package com.msB.Benjamin.Main;
import GenerateCode.CodeGenerator;
import GenerateCode.StaticVar;

import java.time.Instant;
import java.util.Random;
import java.util.random.*;



public abstract class RandomCode implements CodeGenerator, StaticVar {

    public static void main(String[] args){
        String random = generateRandomCode();
        Instant timestamp = Instant.now();
        System.out.println("El código alfanumerico aleatorio es: "+ random);
        System.out.println("El timestamp de esta operación es: "+timestamp);
    }

    private static String generateRandomCode() {
        StringBuilder builder= new StringBuilder(length);
        Random random = new Random();

        for (int i = 0; i< length; i++){
            int randomIndex = random.nextInt(characters.length());
            builder.append(characters.charAt(randomIndex));
        }
        return builder.toString();

    }
}