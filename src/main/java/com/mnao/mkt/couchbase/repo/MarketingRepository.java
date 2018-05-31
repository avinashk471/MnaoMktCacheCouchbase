package com.mnao.mkt.couchbase.repo;

import com.mnao.mkt.couchbase.model.Marketing;

public interface MarketingRepository {
	public Marketing getById(long id);
	public Marketing put(long id, String group, String nwId);
}
