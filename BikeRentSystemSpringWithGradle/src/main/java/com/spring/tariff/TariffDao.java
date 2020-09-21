package com.spring.tariff;

import java.util.UUID;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.spring.user.User;

public class TariffDao {

	// getting datastore service
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		public Tariff insert(Tariff t) {
			String id= UUID.randomUUID().toString();
			// creating Entity class object to create entity kind in datastore
			Entity e = new Entity("Tariff",id);

			e.setProperty("tariffId",id);
			e.setProperty("tariffName", t.getTariffName());
			e.setProperty("tariffDescription",t.getTariffDescription());
			e.setProperty("tariffStatus", t.getTariffStatus());
			Key key = ds.put(e);
			System.out.println(key);
			return t;

		}
		
		public Tariff update(Tariff t,String id) {
		
			// creating Entity class object to create entity kind in datastore
			Entity e = new Entity("Tariff",id);

			e.setProperty("tariffId",id);
			e.setProperty("tariffName", t.getTariffName());
			e.setProperty("tariffDescription",t.getTariffDescription());
			e.setProperty("tariffStatus", t.getTariffStatus());
			Key key = ds.put(e);
			System.out.println(key);
            
			return t;
		}
		

		public Key deleteTariffById(String tariffId) {
			Key key = KeyFactory.createKey("Tariff", tariffId);
			ds.delete(key);
			
			return key;
		}
}
