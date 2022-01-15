package basic1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //Declare input object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is - " + name);

        System.out.println("Enter your birth year");
        int birthYear = scanner.nextInt();
        System.out.println("Your birth year - " + birthYear);

        //Version 1
        System.out.println("Your name is - " + name +" and you are " + (2021-birthYear) + " years old");






    }
}
