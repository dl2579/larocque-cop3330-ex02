package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        String str;
        System.out.println( "What is the input string?" );

        Scanner scanner = new Scanner(System.in);
        str =  scanner.nextLine();

        System.out.printf("%s has %d characters%n", str, str.length());
    }
}
