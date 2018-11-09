package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String [] names = new String [1000];
        int [] grades = new int [1000];
        int [] absences = new int [1000];
        String [] text = new String [1000];

        int index = -1;

        Scanner sf = new Scanner(new File("/Users/duckei/IdeaProjects/twp-read-this-2018-vk586/src/Imports.txt"));
        sf.nextLine();

        while(sf.hasNext())
        {
            index++;
            text[index] = sf.useDelimiter("\t").nextLine() + "\t";
            text[index] = text[index].replace("%", "");
        }
        System.out.println(text[7]);
        sf.close( );
        index++;

        for (int i = 0 ; i < index; i++)
        {
            Scanner sf2 = new Scanner(text[i]);
            sf2.useDelimiter("\t");
            names[i] = sf2.next() + " " + sf2.next();
            grades[i] = sf2.nextInt();
            absences[i] = sf2.nextInt();
            System.out.println(grades[i]);
        }

        Class obj = new Class(names, grades, absences);




        Scanner s = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        boolean cont = true;

        System.out.println("Hello, user.");

        while (cont) {
            System.out.println("\n(1) to enter a student name and retrieve their record.\n" +
                    "(2) to print out the class average.\n" +
                    "(3) to print out the numbers of A's, B's, C's, D's, and F's.\n" +
                    "(4) to exit.");
            int option = s.nextInt();

            if (option == 1) {
                System.out.println("Please enter the student's full name (First Name, Last Name).");
                String name = n.nextLine();
                System.out.println(obj.getInfo(name));
            }
            else if (option == 2) {
                System.out.println("Class average: " + obj.getAverage());
            }
            else if (option == 3) {
                System.out.println(obj.getNOG());
            }
            else if (option == 4) {
                cont = false;
            }
        }
    }
}
