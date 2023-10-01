package com.codecool.model;

public class Ad {
    private static int idCounter = 0;
    private final int id;
    private final String address;
    private final District district;
    private User agent;
    private double price;
    private boolean furnished;

    @Override
    public String toString() {
        return "id=" + id +
                ", address='" + address + '\'' +
                ", district=" + district +
                ", agent=" + agent.getName() +
                ", price=" + price +
                ", furnished=" + furnished +
                "\n";
    }

    public Ad(String address, District district, double price, boolean furnished) {
        idCounter++;
        this.id = idCounter;
        this.address = address;
        this.district = district;
        this.price = price;
        this.furnished = furnished;
    }

    public User getAgent() {
        return agent;
    }

    public void setAgent(User agent) {
        this.agent = agent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    public District getDistrict() {
        return district;
    }
}
