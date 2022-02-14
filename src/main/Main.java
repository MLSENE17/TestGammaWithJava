package main;

import main.Stage1.FizzBuzz1;
import main.Stage2.FizzBuzz2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exitMenu=false;
        do{
            System.out.println("\n *****Menu*****");
            System.out.println("1 => FOR  STAGE 1");
            System.out.println("2 => FOR  STAGE 2");
            Scanner sc=new Scanner(System.in);
            int saisi= sc.nextInt();
            switch (saisi){
                case 1: System.out.println("Debut de FizzBuzz Etape 1"); FizzBuzz1.fizzBuzz(100);break;
                case 2: System.out.println("Debut de FizzBuzz Etape 2");FizzBuzz2.fizzBuzz(100);break;
            }
            System.out.println("Taper y pour continuer ou un autre touche pour quitter");
            String saisiExit=sc.next();
            if(!saisiExit.equalsIgnoreCase("y")){
                exitMenu=true;
            }
        }while(!exitMenu);
    }
}
