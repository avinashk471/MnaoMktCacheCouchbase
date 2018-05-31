package com.mnao.mkt.couchbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mnao.mkt.couchbase.model.Marketing;
import com.mnao.mkt.couchbase.service.MarketingServices;

@RestController
public class MktController {
     
    @Autowired
    MarketingServices service;
     
    @RequestMapping("/cachable")
    public Marketing get(@RequestParam("id")long id){
        return service.get(id);
    }
    
    @RequestMapping("/cacheput")
    public String put(@RequestParam("id") long id, @RequestParam("group")String group, @RequestParam("id")String nwId){
        service.putMarketing(id, group, nwId);
        return "Done";
    }
     
    @RequestMapping("/cacheevict")
    public String evict(@RequestParam("id")long id){
        service.evict(id);
        return "Done";
    }
     
}