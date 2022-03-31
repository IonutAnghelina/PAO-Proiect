package com.company.entities;

import java.util.Comparator;
import java.util.Objects;

public class Distributor implements Comparable<Distributor>, Comparator<Distributor> {

    private String name;

    private int noOrders;


    public Distributor(String name, int noOrders) {
        this.name = name;
        this.noOrders = noOrders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOrders() {
        return noOrders;
    }

    public void setNoOrders(int noOrders) {
        this.noOrders = noOrders;
    }

    @Override
    public String toString() {
        return "Distributor{" +
                "name='" + name + '\'' +
                ", noOrders=" + noOrders +
                '}';
    }

    @Override
    public int compare(Distributor o1, Distributor o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distributor that = (Distributor) o;
        return noOrders == that.noOrders && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, noOrders);
    }

    @Override
    public int compareTo(Distributor o) {
        return this.getNoOrders() - o.getNoOrders();
    }
}
