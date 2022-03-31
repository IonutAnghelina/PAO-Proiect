package com.company.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Vector;

public class Library implements Comparator<Library>,Comparable<Library> {

    Vector<Item> itemList;

    ArrayList<Distributor> distributorsList;

    Vector<PremiumClient> premiumClients;

    private String name;

    private String address;

    private int noEmployees;

    static int currentId = 0;

    private int id;

    public Library() {
        itemList = new Vector<Item>();
        distributorsList = new ArrayList<Distributor>();
        premiumClients = new Vector<PremiumClient>();
        name = "";
        address = "";
        noEmployees = 0;
        currentId++;
        this.id = currentId;
    }

    public Library(Vector<Item> itemList, ArrayList<Distributor>  distributorsList, Vector<PremiumClient> premiumClients, String name, String address, int noEmployees) {
        currentId++;
        this.id = currentId;

        this.itemList = itemList;
        this.distributorsList = distributorsList;
        this.premiumClients = premiumClients;
        this.name = name;
        this.address = address;
        this.noEmployees = noEmployees;
    }

    public ArrayList<Distributor>  getDistributorsList() {
        return distributorsList;
    }

    public void setDistributorsList(ArrayList<Distributor>  distributorsList) {
        this.distributorsList = distributorsList;
    }

    public Vector<PremiumClient> getPremiumClients() {
        return premiumClients;
    }

    public void setPremiumClients(Vector<PremiumClient> premiumClients) {
        this.premiumClients = premiumClients;
    }

    public Vector<Item> getItemList() {
        return itemList;
    }

    public void setItemList(Vector<Item> itemList) {
        this.itemList = itemList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNoEmployees() {
        return noEmployees;
    }

    public void setNoEmployees(int noEmployees) {
        this.noEmployees = noEmployees;
    }

    public void addItem(Item i)
    {
        this.itemList.add(i);
    }

    @Override
    public String toString() {
        return "Library{" +
                "itemList=" + itemList +
                ", distributorsList=" + distributorsList +
                ", premiumClients=" + premiumClients +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", noEmployees=" + noEmployees +
                '}';
    }

    @Override
    public int compare(Library o1, Library o2) {
        //The libraries will be sorted in ascending order by the number of items present

        return o1.getItemList().size() - o2.getItemList().size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return noEmployees == library.noEmployees && Objects.equals(itemList, library.itemList) && Objects.equals(distributorsList, library.distributorsList) && Objects.equals(premiumClients, library.premiumClients) && Objects.equals(name, library.name) && Objects.equals(address, library.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemList, distributorsList, premiumClients, name, address, noEmployees);
    }

    @Override
    public int compareTo(Library o) {
        return this.itemList.size() - o.itemList.size();
    }
}
