package com.company.entities;

import java.util.Comparator;
import java.util.Objects;

public class PremiumClient implements Comparator<PremiumClient>,Comparable<PremiumClient> {
    private String name;

    private int loyaltyYears;

    private int clientId;

    public PremiumClient(String name, int loyaltyYears, int clientId) {
        this.name = name;
        this.loyaltyYears = loyaltyYears;
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoyaltyYears() {
        return loyaltyYears;
    }

    public void setLoyaltyYears(int loyaltyYears) {
        this.loyaltyYears = loyaltyYears;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "PremiumClient{" +
                "name='" + name + '\'' +
                ", loyaltyYears=" + loyaltyYears +
                ", clientId=" + clientId +
                '}';
    }

    @Override
    public int compare(PremiumClient o1, PremiumClient o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PremiumClient that = (PremiumClient) o;
        return loyaltyYears == that.loyaltyYears && clientId == that.clientId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, loyaltyYears, clientId);
    }

    @Override
    public int compareTo(PremiumClient o) {
        return this.loyaltyYears - o.loyaltyYears;
    }
}
