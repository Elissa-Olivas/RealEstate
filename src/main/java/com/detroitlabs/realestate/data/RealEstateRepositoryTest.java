package com.detroitlabs.realestate.data;

import com.detroitlabs.realestate.model.Properties;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateRepositoryTest {


    @Test
    void searchByUnder() {
        RealEstateRepository realEstateRepository = new RealEstateRepository();
        List<Properties> results= realEstateRepository.searchByUnder(450000);

        for (Properties properties : results) {
            assertTrue(properties.getPrice() <= 450000);
        }
    }

    @Test
    void searchByOver() {

    }

    @Test
    void searchByRooms() {
    }
}