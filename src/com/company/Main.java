package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Import statements used.
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        //Variable named
        int pickANumber;

        //Program waiting for an input.
        System.out.println("- I'm think of a number between 1-100. \n- Can you guess what it is? \n- Type a number: ");
        pickANumber = userInput.nextInt();

        //Output generated.
        int randomNumberGenerator = random.nextInt(100) + 1;
        System.out.println("- The number the computer picked: " + randomNumberGenerator);

        //Second output when both numbers are picked.
        int difference = (randomNumberGenerator - pickANumber);
        System.out.println("- You were off by: " + difference);

    }
}
