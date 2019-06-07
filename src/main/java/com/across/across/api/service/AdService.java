package com.across.across.api.service;

import com.across.across.api.dao.AdEnhancer;
import com.across.across.api.dao.Site;

public interface AdService {
    public AdEnhancer populateData(AdEnhancer enhancer);
    public Site populatePublisher(Site site);
    public Site populateDemo(Site site);
}
