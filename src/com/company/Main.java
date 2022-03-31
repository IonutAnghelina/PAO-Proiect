package com.company;

import com.company.entities.*;
import com.company.services.LibraryService;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {


        StoryBook b1 = new StoryBook(200, "Editura Polirom", (float) 12.5, "Petre Ispirescu", "Povesti pentru copii", 35, true);
        Distributor d1 = new Distributor("Distributor 1", 100);
        PremiumClient c1 = new PremiumClient("Ionut Anghelina", 20, 1);
        StoryBook b3 = new StoryBook(100, "Editura Alpha", (float) 17.5, "Ion Creanga", "Povesti cu talc", 25, false);
        Distributor d3 = new Distributor("Distributor 2", 200);
        PremiumClient c3 = new PremiumClient("Mihai Popescu", 5, 2);
        CookingBook b2 = new CookingBook(100, "Editura Art", 10, 100, "Jamie Oliver", "100 Recipes for you");
        PremiumClient c4 = new PremiumClient("Andrei Popa", 5, 3);

        LibraryService l = LibraryService.getInstance();

        Library l1 = new Library();

        l.addLibrary(l1);
        l1.setName("Libraria noua");
        l1.setAddress("Strada Academiei, nr 14");
        l1.setNoEmployees(10);
        l.addItem(l1, b1);
        l.addDistributor(l1, d1);
        l.addClient(l1, c1);
        l.addItem(l1, b2);
        l.removeItem(l1, b2);
        l.updateItem(l1, b1, b2);
        l.addItem(l1, b1);
        l.addClient(l1, c4);

        Library l2 = new Library();
        l.addLibrary(l2);
        l2.setName("Libraria Centrala");
        l2.setAddress("Strada Lalelelor, nr 12");
        l2.setNoEmployees(12);
        l.addItem(l2, b3);
        l.addDistributor(l2, d3);
        l.addClient(l2, c3);
        l.addClient(l2, c4);
        l.sortLibraries();

        System.out.println("The sorted libraries in our system are:");
        System.out.println("");
        for (int i = 0; i < l.getLibraries().size(); i++)
            System.out.println(l.getLibraries().elementAt(i));

        l.sortClients(l.getLibraries().elementAt(0));

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("The sorted clients of our first Library are")
        ;
        for (int i = 0; i < l.getClients(l.getLibraries().elementAt(0)).size(); i++) {
            System.out.println(l.getClients(l.getLibraries().elementAt(0)).elementAt(i));
        }

    }
}
