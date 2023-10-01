package com.codecool;

import com.codecool.model.Ad;
import com.codecool.model.Agent;
import com.codecool.model.User;
import com.codecool.service.Agency;

import static com.codecool.model.District.*;

public class Main {
    public static void main(String[] args) {

        Agency agency = new Agency();
        User user1 = new User("user1", "addr1");
        agency.addUser(user1);
        User user2 = new User("user2", "addr2");
        agency.addUser(user2);
        Agent agent1 = new Agent("agent1", "addr3", agency);
        agency.addUser(agent1);
        Agent agent2 = new Agent("agent2", "addr4", agency);
        agency.addUser(agent2);

        user1.sendDirectMessage("hi!",agent1);
        System.out.println(user2.getName());

        Ad ad1 = new Ad("addr5", XI, 5000, false);
        Ad ad2 = new Ad("addr6", V, 4000, true);
        Ad ad3 = new Ad("addr7", VI, 4000, false);
        Ad ad4 = new Ad("addr8", VI, 2000, true);

        agent1.postAd(ad1);
        agent1.postAd(ad2);
        agent2.postAd(ad3);
        agent2.postAd(ad4);

        System.out.println(agent1.getAds());
        System.out.println(agency.getAds());
        System.out.println(agency.filterByDistricts(V));
        System.out.println(agency.filterByFurnished(true));
        System.out.println(agency.filterByPrice(4000));

        System.out.println(agency.filterBy(VI));
        System.out.println(agency.filterBy(VI, 4000));
        System.out.println(agency.filterBy(VI, 4000, false));
    }
}