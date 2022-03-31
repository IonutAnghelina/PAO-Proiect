package com.company.services;

import com.company.entities.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class LibraryService {

    static LibraryService instance = null;
    Vector<Library> libraries;

    //This service implements CRUD operations + other functions


    private LibraryService()
    {
        this.libraries = new Vector<Library>();

    }
    private LibraryService(Vector<Library> libraries) {
        this.libraries = libraries;
    }

    public static LibraryService getInstance() {
        if (instance == null)
            instance = new LibraryService();

        return instance;
    }

    public static LibraryService getInstance(Vector<Library> l) {
        if (instance == null)
            instance = new LibraryService(l);

        return instance;
    }

    public void addItem(Library l, Item o) {
        l.addItem(o);

        System.out.println("The item " + o.toString() + " has been succesfully added to the library " + l.toString());
    }

    public void removeItem(Library l, Item o) {

        Boolean flag = false;

        for (int i = 0; i < l.getItemList().size(); i++)
            if (l.getItemList().elementAt(i).equals(o)) {
                l.getItemList().remove(i);
                flag = true;

                break;
            }

        if (flag == true) {
            System.out.println("The item has been succesfully removed");
        } else {
            System.out.println("The item has not been found in the library list");
        }

    }

    public void updateItem(Library l, Item initialForm, Item finalForm) {
        Boolean flag = false;

        for (int i = 0; i < l.getItemList().size(); i++) {
            if (l.getItemList().elementAt(i).equals(initialForm)) {
                l.getItemList().remove(i);
                l.getItemList().add(finalForm);
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("The object has been succesfully modified");
        } else {
            System.out.println("The item has not been found in the library's list");
        }
    }

    public Vector<Item> getItemList(Library l) {
        return l.getItemList();
    }

    public void addLibrary(Library l) {
        this.libraries.add(l);
        System.out.println("The library has been added!");
    }

    public void removeLibrary(Library l) {
        this.libraries.remove(l);
        System.out.println("The library has been removed");
    }

    public Vector<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(Vector<Library> libraries) {
        this.libraries = libraries;
    }

    public void updateLibrary(Library initialform, Library finalForm) {
        for (int i = 0; i < this.libraries.size(); i++) {
            if (this.libraries.elementAt(i).equals(initialform)) {
                this.libraries.remove(i);
                this.libraries.add(finalForm);

                System.out.println("The library has been updated");
                break;
            }
        }

        System.out.println("The library has not been found");
    }

    public void sortLibraries() {
        Collections.sort(this.libraries);
    }


    public void addDistributor(Library l, Distributor d) {
        l.getDistributorsList().add(d);
        System.out.println("The distributor has been successfully added");
    }

    public ArrayList<Distributor> getDistributors(Library l) {
        return l.getDistributorsList();
    }

    public void removeDistributor(Library l, Distributor d) {
        Boolean flag = false;

        for (int i = 0; i < l.getDistributorsList().size(); i++) {
            if (l.getDistributorsList().get(i).equals(d)) {
                l.getDistributorsList().remove(i);

                flag = true;

                break;
            }
        }

        if (flag == true)
            System.out.println("The distributor has been succesfully removed");
        else
            System.out.println("The distributor has not been found");
    }

    public void updateDistributor(Library l, Distributor oldValue, Distributor newValue) {
        Boolean flag = false;

        for (int i = 0; i < l.getDistributorsList().size(); i++) {
            if (l.getDistributorsList().get(i).equals(oldValue)) {
                l.getDistributorsList().remove(i);
                l.getDistributorsList().add(newValue);
                flag = true;

                break;
            }
        }

        if (flag == true)
            System.out.println("The distributor has been succesfully updated");
        else
            System.out.println("The distributor has not been found");
    }


    public void sortDistributors(Library l) {
        Collections.sort(l.getDistributorsList());
    }

    public void addClient(Library l, PremiumClient c) {
        l.getPremiumClients().add(c);
    }

    public void removeClient(Library l, PremiumClient c) {
        Boolean flag = false;

        for (int i = 0; i < l.getPremiumClients().size(); i++) {
            if (l.getPremiumClients().equals(c)) {
                l.getPremiumClients().remove(i);
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("The client was not found in this library");
        } else {
            System.out.println("The client has been succesfully removed");
        }
    }

    public void updateClient(Library l, PremiumClient oldValue, PremiumClient newValue) {
        Boolean flag = false;

        for (int i = 0; i < l.getPremiumClients().size(); i++) {
            if (l.getPremiumClients().equals(oldValue)) {
                l.getPremiumClients().remove(i);
                l.getPremiumClients().add(newValue);
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("The client was not found in this library");
        } else {
            System.out.println("The client has been succesfully updated");
        }
    }

    public Vector<PremiumClient> getClients(Library l) {
        return l.getPremiumClients();
    }

    public void sortClients(Library l) {
        Collections.sort(l.getPremiumClients());
    }



}

