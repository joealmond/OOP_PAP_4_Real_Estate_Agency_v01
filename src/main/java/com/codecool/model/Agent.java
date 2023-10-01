package com.codecool.model;

import com.codecool.service.Agency;

import java.util.ArrayList;
import java.util.List;

public class Agent extends User {
    private final List<Ad> ads;
    private final Agency agency;

    public Agent(String name, String contact, Agency agency) {
        super(name, contact);
        this.agency = agency;
        this.ads = new ArrayList<>();
    }

    public void postAd(Ad ad) {
        ad.setAgent(this);
        agency.addAd(ad);
        addAd(ad);
    }
    private void addAd(Ad ad) {
        ads.add(ad);
        System.out.println("Ad registered at the agent...");
    }

    public List<Ad> getAds() {
        return new ArrayList<>(ads);
    }

}
