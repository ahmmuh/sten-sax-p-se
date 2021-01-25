package com.codeAnytime;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner printer = new Scanner(System.in);
        Random randon = new Random();
        final int rock = 1;
        final int paper = 2;
        final int scissors = 3;
        int userChoice,computerChoice;
        System.out.println("Rock,papper, scissors");
        do {
            System.out.println("1: rock\n2: papper\n3: scissors\n-1: to quit:");
            userChoice = printer.nextInt();
            computerChoice = randon.nextInt(3) + 1;

            if (userChoice == rock){
                if (computerChoice == rock){
                    System.out.println("Rock vs Rock -> Tie  game");
                }
                else if (computerChoice == paper){
                    System.out.println(" Rock vs paper: you lose");
                }

                else if (computerChoice == scissors){
                    System.out.println(" Rock vs scissors: you win");
                }
            }

            //paper
            if (userChoice == paper){
                if (computerChoice == rock){
                    System.out.println("paper vs Rock -> Tie  game");
                }
                else if (computerChoice == paper){
                    System.out.println(" paper vs paper: you lose");
                }

                else if (computerChoice == scissors){
                    System.out.println(" paper vs scissors: you win");
                }
            }

            //scissors
            if (userChoice == scissors){
                if (computerChoice == rock){
                    System.out.println("scissors vs Rock -> Tie  game");
                }
                else if (computerChoice == paper){
                    System.out.println(" scissors vs paper: you win");
                }

                else if (computerChoice == scissors){
                    System.out.println(" paper vs scissors: you lose");
                }
            }
        }while (userChoice <0);
        System.out.println("Thanks for playing");

    }
}
