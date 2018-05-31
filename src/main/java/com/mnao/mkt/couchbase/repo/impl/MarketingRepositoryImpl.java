package com.mnao.mkt.couchbase.repo.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mnao.mkt.couchbase.model.Marketing;
import com.mnao.mkt.couchbase.repo.MarketingRepository;

@Repository
public class MarketingRepositoryImpl implements MarketingRepository{
	
	private static Map<Long, Marketing> store = new HashMap<Long, Marketing>();
    static{
        store.put(1L, new Marketing("1", "Marketing", "stufekci"));
        store.put(2L, new Marketing("2", "Marketing", "rsinha"));
        store.put(3L, new Marketing("3", "Marketing", "gsankar"));
        store.put(4L, new Marketing("4", "Marketing", "akudarav"));
    }

	@Override
	public Marketing getById(long id) {
		
		// provide a delay time for simulating slowly processing
        try{
            Thread.sleep(3000); 
        }catch(Exception e){
        }
        
		Marketing mkt = store.get(id);
        return mkt;
	}

	@Override
	public Marketing put(long id, String group, String nwId) {
		Marketing mkt = store.get(id);
		mkt.setGroup(group);
		mkt.setNwId(nwId);
		
		return mkt;
	}
}
