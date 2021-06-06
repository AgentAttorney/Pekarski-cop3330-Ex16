package Ex016;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Pekarski
 */

public class Example16 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();

        String legality = (age >= 16) ? "You are legally able to drive." : "You are not legally able to drive.";
        System.out.println(legality);
    }
}
