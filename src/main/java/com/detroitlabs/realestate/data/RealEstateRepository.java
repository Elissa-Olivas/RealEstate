package com.detroitlabs.realestate.data;


import com.detroitlabs.realestate.model.ListingAgent;
import com.detroitlabs.realestate.model.Properties;
import com.detroitlabs.realestate.model.RealEstateAgency;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RealEstateRepository {

    private static final List<Properties> ALL_PROPERTIES = Arrays.asList(
            new Properties(419000, 2, 2, "Denver", "CO", "2685 S Dayton Way", 1938, 1),
            new Properties(425000, 3, 3, "Denver", "CO", "16087 E Elk Place", 1454,  2),
            new Properties(479300, 3, 3, "Denver", "CO", "20000 E Mitchell Pl #3", 1522,  3),
            new Properties(290000, 2, 3, "Denver", "CO", "4160 E Warren Avenue Unit 4,", 1232,  4),
            new Properties(839000, 2, 4, "Denver", "CO", "3639 N Humboldt Street", 2017,  5));



    private static final ListingAgent LISTING_AGENT = new ListingAgent("Dan", "Newport", "303-123-4567", "dan_newport@willow.com");

    private static final RealEstateAgency REAL_ESTATE_AGENCY = new RealEstateAgency("Willow Real Estate Agency", "123 willow st Denver, CO 80910", "303-987-6543", "willowsupport@willowrealestate.com");


    public static List<Properties> getAllProperties() {
        return ALL_PROPERTIES;
    }

    public static RealEstateAgency getRealEstateAgency() {
        return REAL_ESTATE_AGENCY;
    }

    public static ListingAgent getListingAgent() {
        return LISTING_AGENT;
    }

    public List<Properties> searchByUnder(int price) {
        List<Properties> propertiesUnderPrice = new ArrayList<>();
        for (Properties property : this.ALL_PROPERTIES) {
            if (property.getPrice() <= price) {
                propertiesUnderPrice.add(property);
            }
        }
        return propertiesUnderPrice;
    }



    public List<Properties> searchByOver(int price) {
        List<Properties> propertiesOverPrice = null;
        for (Properties property : ALL_PROPERTIES) {
            if (property.getPrice() >= price) {
                propertiesOverPrice.add(property);
            }
        }
        return propertiesOverPrice;
    }

    public List<Properties> searchByRooms(int numOfRooms) {
        List<Properties> propertiesByRooms = null;
        for (Properties property : ALL_PROPERTIES) {
            if (property.getNumOfBedrooms() == numOfRooms) {
                propertiesByRooms.add(property);
            }
        }
        return propertiesByRooms;
    }


}
