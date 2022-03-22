package com.detroitlabs.realestate.data;


import com.detroitlabs.realestate.model.Properties;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Component
public class RealEstateRepository {

    private static final List<Properties> ALL_PROPERTIES = Arrays.asList(
            new Properties(419000, 2, 2, "Denver", "CO", "2685 S Dayton Way", 1938, "https://photos.zillowstatic.com/fp/a88dd6bfddc78b464515a37ca851c228-cc_ft_576.webp"),
            new Properties(425000, 3, 3, "Denver", "CO", "16087 E Elk Place", 1454, "https://photos.zillowstatic.com/fp/815111e6c5de00a7be0418228c81532d-cc_ft_576.webp"),
            new Properties(479300, 3, 3, "Denver", "CO", "20000 E Mitchell Pl #3", 1522, "https://photos.zillowstatic.com/fp/3dfd96a831757f8ebd97213eeec13a5b-cc_ft_576.webp"));







}
