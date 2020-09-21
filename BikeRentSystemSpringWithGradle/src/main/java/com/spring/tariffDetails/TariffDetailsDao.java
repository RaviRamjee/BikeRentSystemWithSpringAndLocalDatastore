package com.spring.tariffDetails;

import java.util.UUID;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.spring.tariff.Tariff;

public class TariffDetailsDao {

	// getting datastore service
	DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

	public TariffDetails insert(TariffDetails td) {
		String id = UUID.randomUUID().toString();
		// creating Entity class object to create entity kind in datastore
		Entity e = new Entity("TariffDetails", id);
		e.setProperty("tariffDetailsId", id);
		e.setProperty("tariffId", td.getTariffId());
		e.setProperty("tariffDurationHours", td.getTariffDurationHours());
		e.setProperty("tariffAmount", td.getTariffAmount());
		e.setProperty("tariffRideLimitInKM", td.getTariffRideLimitInKM());
		e.setProperty("afterLimitAmountPerHour", td.getAfterLimitAmountPerHour());
		e.setProperty("afterLimitKM", td.getAfterLimitKM());
		Key key = ds.put(e);
		System.out.println(key);
 
		return td;
	}

	public TariffDetails update(TariffDetails td, String id) {
		// creating Entity class object to create entity kind in datastore
		Entity e = new Entity("TariffDetails", id);
		e.setProperty("tariffDetailsId", id);
		e.setProperty("tariffId", td.getTariffId());
		e.setProperty("tariffDurationHours", td.getTariffDurationHours());
		e.setProperty("tariffAmount", td.getTariffAmount());
		e.setProperty("tariffRideLimitInKM", td.getTariffRideLimitInKM());
		e.setProperty("afterLimitAmountPerHour", td.getAfterLimitAmountPerHour());
		e.setProperty("afterLimitKM", td.getAfterLimitKM());
		Key key = ds.put(e);
		System.out.println(key);
		
		return td;
	}

	public void deleteTariffDetailsById(String tariffDetailsId) {
		Key key = KeyFactory.createKey("TariffDetails", tariffDetailsId);
		ds.delete(key);
	}

}
