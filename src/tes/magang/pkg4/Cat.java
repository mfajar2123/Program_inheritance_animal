/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.magang.pkg4;

/**
 *
 * @author Fajar
 */
public class Cat extends Animal{
    
     void soundCat(){
         System.out.println("Sound: Meow.. Meow..");
    }
     void catCharacteristics() {
         System.out.println("Characteristics: neuroticism, extraversion, dominance, impulsiveness, and agreeableness");
     }
    
        public static void main(String[] args) {
            Cat kucing = new Cat();
            kucing.walk();
            kucing.name();
            kucing.catCharacteristics();
            kucing.soundCat();
        
        }
    }
