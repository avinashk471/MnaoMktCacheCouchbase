package com.mnao.mkt.couchbase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnao.mkt.couchbase.model.Marketing;
import com.mnao.mkt.couchbase.service.cache.MarketingCache;

@Service
public class MarketingServices {
	
	@Autowired
	MarketingCache marketingCache;
	
    public Marketing get(long id){
    	return marketingCache.getOnCache(id);
    }
    
    public Marketing putMarketing(long id, String group, String nwId){
        return marketingCache.putOnCache(id, group, nwId);
    }
     
    public void evict(long id){
    	marketingCache.evict(id);
    }
}
