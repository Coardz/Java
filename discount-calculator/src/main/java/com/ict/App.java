package com.ict;

import java.net.InetAddress;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Scanner scanner = new Scanner(System.in);
            InetAddress inetAddress = InetAddress.getLocalHost();
            String hostname =  inetAddress.getHostName();
            System.out.println("Hello " + hostname);

            System.out.println("Insert Age:");
            int age = Integer.valueOf(scanner.nextLine());

            System.out.println("Insert Cart Total:");
            int cart = Integer.valueOf(scanner.nextLine());

            if (age > 60) {
                double discountPrice = cart - (cart * 0.30);
                System.out.println("Your total:" + discountPrice);
            }
            else {
                System.out.println("Your total:" + cart);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
