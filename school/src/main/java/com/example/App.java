package com.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{

    
    static boolean authentication() {
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        boolean success = false;
        
        try {
            while (true) {
                System.out.println("Attepmt:" + attempt);
                System.out.println("Insert Your Name:");
                String name = scanner.nextLine();
                System.out.println("Insert Your Passowrd");
                String password = scanner.nextLine();
    
                if (name.equals("user") && password.equals("pass")) {
                    return true;
                }
                else {
                    attempt++;
                    System.out.println("Wrong");
                }

                // prevent bruteforce
                if (attempt > 3) {
                    return false;
                }

            }

        } finally {
            scanner.close();
        }
    }
    

    public static void main( String[] args )
    {

        System.out.println("Welcome to the program");

        if (authentication()) {
            System.out.println("Successfuly");
        }
        else {
            System.out.println("Bruteforce Detected");
        }
    }
}
