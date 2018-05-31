package com.mnao.mkt.couchbase.model;

import java.io.Serializable;
 
public class Marketing implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
 
	private String group;
 
	private String nwId;
	
	public Marketing(String id, String group, String nwId){
		this.id = id;
		this.group = group;
		this.nwId = nwId;
	}
	
	public String getId() {
		return this.id;
	}
 
	public void setId(String id) {
		this.id = id;
	}
 
	public String getGroup() {
		return this.group;
	}
 
	public void setGroup(String group) {
		this.group = group;
	}
 
	public String getNwId() {
		return this.nwId;
	}
 
	public void setNwId(String nwId) {
		this.nwId = nwId;
	}
 
	@Override
	public String toString() {
		return String.format("Marketing[ id=%s, group=%s, nwId=%s]", this.id, this.group, this.nwId);
	}
}
