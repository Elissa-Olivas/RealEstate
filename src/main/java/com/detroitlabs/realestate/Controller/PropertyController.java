package com.detroitlabs.realestate.Controller;


import com.detroitlabs.realestate.data.RealEstateRepository;
import com.detroitlabs.realestate.model.Properties;
import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PropertyController {


    @Autowired
    private RealEstateRepository realEstateRepository;



    @RequestMapping("/")
    public String displayHome() {
        return "home";
    }

    @RequestMapping("/properties")
    public String allProperties(ModelMap modelMap) {
        modelMap.put("properties", realEstateRepository.getAllProperties());


        return "properties";
    }

    @RequestMapping("/contact")
    public String contactUs(ModelMap modelMap) {
        modelMap.put("contact", realEstateRepository.getRealEstateAgency());
        return "contact";
    }


}
