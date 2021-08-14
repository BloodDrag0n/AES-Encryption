package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n\t1) Encrption\n\t2) Decryption");
        System.out.print("Your Choice: ");
        int choice = sc.nextInt();
        String secretKey = null;
        String originalString = null;
        switch (choice) {
            case 1:
                System.out.println("\nEnter your security code: ");
                secretKey = sc.next();
                System.out.println("Enter your Text: ");
                sc.nextLine();
                originalString = sc.nextLine();
                String encryptedString = AES.encrypt(originalString, secretKey);
                System.out.println("The Encrypted Message:\n" + encryptedString);
                break;
            case 2:
                System.out.println("\nEnter your security code: ");
                secretKey = sc.next();
                System.out.println("Enter your Text: ");
                sc.nextLine();
                originalString = sc.nextLine();
                String decryptedString = AES.decrypt(originalString, secretKey);
                System.out.println("The Decrypted Message:\n" + decryptedString);
                break;
            default:
                System.out.println("Enter a valid Choice!");
                break;
        }
        System.out.println("\n\n");
        if (true) {
            main(args);
        }
    }
}