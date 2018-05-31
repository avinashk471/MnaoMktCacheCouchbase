package com.mnao.mkt.couchbase.service.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.mnao.mkt.couchbase.config.CacheConfig;
import com.mnao.mkt.couchbase.model.Marketing;
import com.mnao.mkt.couchbase.repo.MarketingRepository;

@Component
public class MarketingCache {
	
	@Autowired
	MarketingRepository marketingRepository;
	
    @Cacheable(value=CacheConfig.CACHE_NAME, key="#id")
    public Marketing getOnCache(long id){
    	return marketingRepository.getById(id);
    }
    
    @CachePut(value=CacheConfig.CACHE_NAME, key="#id")
    public Marketing putOnCache(long id, String group, String nwId){
        return marketingRepository.put(id, group, nwId);
    }
     
    @CacheEvict(value = CacheConfig.CACHE_NAME, key = "#id")
    public void evict(long id){
    }
}