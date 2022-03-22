package com.detroitlabs.realestate.data;


import com.detroitlabs.realestate.model.ListingAgent;
import com.detroitlabs.realestate.model.Properties;
import com.detroitlabs.realestate.model.RealEstateAgency;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Component
public class RealEstateRepository {

    private static final List<Properties> ALL_PROPERTIES = Arrays.asList(
            new Properties(419000, 2, 2, "Denver", "CO", "2685 S Dayton Way", 1938, "https://photos.zillowstatic.com/fp/a88dd6bfddc78b464515a37ca851c228-cc_ft_576.webp", 1),
            new Properties(425000, 3, 3, "Denver", "CO", "16087 E Elk Place", 1454, "https://photos.zillowstatic.com/fp/815111e6c5de00a7be0418228c81532d-cc_ft_576.webp", 2),
            new Properties(479300, 3, 3, "Denver", "CO", "20000 E Mitchell Pl #3", 1522, "https://photos.zillowstatic.com/fp/3dfd96a831757f8ebd97213eeec13a5b-cc_ft_576.webp", 3),
            new Properties(290000, 2, 3, "Denver", "CO", "4160 E Warren Avenue Unit 4,", 1232, "https://photos.zillowstatic.com/fp/4d8846e005c21f28d1b54a309007a393-cc_ft_576.webp", 4),
            new Properties(839000, 2, 4, "Denver", "CO", "3639 N Humboldt Street", 2017, "https://photos.zillowstatic.com/fp/e0b722fb9920565a9648d8e7d5884da6-cc_ft_1344.webp", 5));



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
        List<Properties> propertiesUnderPrice = null;
        for (Properties property : ALL_PROPERTIES) {
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
