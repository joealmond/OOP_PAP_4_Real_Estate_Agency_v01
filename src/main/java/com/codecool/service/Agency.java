package com.codecool.service;

import com.codecool.model.Ad;
import com.codecool.model.District;
import com.codecool.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agency {
    private final List<User> users;

    private final List<Ad> ads;

    public Agency() {
        this.users = new ArrayList<>();
        this.ads = new ArrayList<>();
    }

    private static boolean hasDistrict(Ad ad, District district) {
        return ad.getDistrict().equals(district);
    }

    private static boolean hasPrice(Ad ad, double price) {
        return ad.getPrice() == price;
    }

    private static boolean isFurnished(Ad ad, boolean isFurnished) {
        return ad.isFurnished() == isFurnished;
    }

    public List<Ad> filterBy(District district) {
        return ads.stream()
                .filter(ad -> hasDistrict(ad,district))
                .collect(Collectors.toList());
    }
    public List<Ad> filterBy(District district, double price) {
        return ads.stream()
                .filter(ad -> hasDistrict(ad,district))
                .filter(ad -> hasPrice(ad,price))
                .collect(Collectors.toList());
    }
    public List<Ad> filterBy(District district, double price, boolean _isFurnished) {
        return ads.stream()
                .filter(ad -> hasDistrict(ad,district))
                .filter(ad -> hasPrice(ad,price))
                .filter(ad -> isFurnished(ad,_isFurnished))
                .collect(Collectors.toList());
    }

    public List<Ad> filterByDistricts(District district) {
        return ads.stream()
                .filter(ad -> ad.getDistrict().equals(district))
                .collect(Collectors.toList());
    }
    public List<Ad> filterByPrice(double price) {
        return ads.stream()
                .filter(ad -> ad.getPrice() == price)
                .collect(Collectors.toList());
    }
    public List<Ad> filterByFurnished(boolean _isFurnished) {
        return ads.stream()
                .filter(ad -> ad.isFurnished() == _isFurnished)
                .collect(Collectors.toList());
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User registered at the agency...");
    }

    public List<Ad> getAds() {
        return new ArrayList<>(ads);
    }

    public void addAd(Ad ad) {
        ads.add(ad);
        System.out.println("Ad registered at the agency...");
    }

}
