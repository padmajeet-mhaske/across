package com.across.across.api.service;

import com.across.across.api.dao.*;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class AdServiceImpl implements AdService {

    final String siteResourceUrl = "http://159.89.185.155:3000/api/publishers/find";

    public AdEnhancer populateData(AdEnhancer enhancer){

        enhancer.setSite(populatePublisher(enhancer.getSite()));
        enhancer.setSite(populateDemo(enhancer.getSite()));
        enhancer.setDevice(populateDevice(enhancer.getDevice()));

        return enhancer;
    }

    private Device populateDevice(Device device) {

        try {

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

            HttpEntity<String> entity = new HttpEntity<>(headers);

            ResponseEntity<Device> response = restTemplate
                    .exchange(String.format(String.format("http://api.ipstack.com/%s?access_key=7d10aa95f3d93caeb3838e579b75e765", device.getIp())), HttpMethod.GET, entity, Device.class);

            Device d = response.getBody();
            Geo geo = new Geo(d.getCountry_code());

            device.setGeo(geo);
            return device;
        } catch (Exception e){
            return device;
        }
    }

    public Site populatePublisher(Site site){

        try {

            Map<String, String> vars = new HashMap<>();
            vars.put("SITEID", site.getId());

            HttpHeaders headers = new HttpHeaders();

            List<MediaType> ll = new LinkedList<>();
            ((LinkedList<MediaType>) ll).addFirst(MediaType.APPLICATION_JSON);
            headers.setAccept(ll);
            headers.setContentType(MediaType.APPLICATION_JSON);


            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<q> request = new HttpEntity<>(new q(site.getId()), headers);

            ResponseEntity<Publisher> response = restTemplate
                    .exchange(siteResourceUrl, HttpMethod.POST, request, Publisher.class);


            site.setPublisher(response.getBody());
            return site;
        } catch (Exception e){
            return site;
        }
    }

    public Site populateDemo(Site site){

        try {


            Map<String, String> vars = new HashMap<>();
            vars.put("SITEID", site.getId());

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

            HttpEntity<String> entity = new HttpEntity<>(headers);

            ResponseEntity<Demographics> response = restTemplate
                    .exchange(String.format("http://159.89.185.155:3000/api/sites/%s/demographics", site.getId()), HttpMethod.GET, entity, Demographics.class);

            site.setDemographics(response.getBody());
            return site;
        } catch (Exception e){
            return site;
        }
    }
}
