package com.detroitlabs.realestate.Controller;


import com.detroitlabs.realestate.data.RealEstateRepository;
import com.detroitlabs.realestate.model.ListingAgent;
import com.detroitlabs.realestate.model.Properties;
import com.detroitlabs.realestate.model.RealEstateAgency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PropertyController {


    @Autowired
    private RealEstateRepository realEstateRepository;



    @RequestMapping("/")
    public String displayProperties() {
        return "home";
    }

    @RequestMapping("/properties")
    public String allProperties(ModelMap modelMap) {
        modelMap.put("property", realEstateRepository.getAllProperties());
        return "properties";
    }

    @RequestMapping("/contact")
    public String contactUs(ModelMap modelMap) {
        modelMap.put("contact", realEstateRepository.getRealEstateAgency());
        return "contact";
    }


}
