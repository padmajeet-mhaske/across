package com.across.across.api.web;

import com.across.across.api.service.AdService;
import com.across.across.api.dao.AdEnhancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

/**
 * Ad controller who adds values on top of received values
 */
@RestController
@RequestMapping(path = "/ad")
public class AdController {

    @Autowired
    AdService adService;

    public AdController(){

    }

    @RequestMapping(value = "/demo" , method = RequestMethod.POST)
    public @ResponseBody AdEnhancer save(@RequestBody AdEnhancer jsonString) {

        AdEnhancer ad = adService.populateData(jsonString);
        return ad;
    }

    @RequestMapping(value = "/demo2" , method = RequestMethod.GET)
    public @ResponseBody AdEnhancer demo2() {

        AdEnhancer a = new AdEnhancer();

        AdEnhancer ad = adService.populateData(a);
        return ad;
    }

    /**
     * Exception handler if NoSuchElementException is thrown in this Controller
     *
     * @param ex
     * @return Error message String.
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoSuchElementException.class)
    public String return400(NoSuchElementException ex) {
        return ex.getMessage();

    }
}
