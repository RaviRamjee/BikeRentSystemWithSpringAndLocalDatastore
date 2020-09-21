package com.spring.bike;

import java.util.UUID;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class BikeDao {

	// getting datastore service
	DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

	public Bike insert(Bike bike) {

		// creating Entity class object for creating entity kind in datastore
		String id = UUID.randomUUID().toString();
		Entity e = new Entity("Bike", id);

		// setting property for "Entity" with the of getter method
		e.setProperty("bikeId", id);
		e.setProperty("tariffId", bike.getTariffId());
		e.setProperty("bikeName", bike.getBikeName());
		e.setProperty("bikeDescription", bike.getBikeDescription());
		e.setProperty("bikeCategory", bike.getBikeCategory());
		e.setProperty("bikeCompany", bike.getBikeCompany());
		e.setProperty("bikeModel", bike.getBikeModel());
		e.setProperty("bikeRCNo", bike.getBikeRCNo());
		e.setProperty("bikeRCName", bike.getBikeRCName());
		e.setProperty("bikeRCRegDate", bike.getBikeRCRegDate());
		e.setProperty("bikeRCExpDate", bike.getBikeRCExpDate());
		e.setProperty("bikeRCCHNO", bike.getBikeRCCHNO());
		e.setProperty("bikeRCEnginNo", bike.getBikeRCEnginNo());
		e.setProperty("bikeYearMfg", bike.getBikeYearMfg());
		e.setProperty("bikeNoOfGear", bike.getBikeNoOfGear());
		e.setProperty("bikeColor", bike.getBikeColor());
		e.setProperty("selfStart", bike.getSelfstart());
		e.setProperty("bikeEnginCC", bike.getBikeEnginCC());
		e.setProperty("status", bike.getStatus());
		e.setProperty("bikeImage", bike.getBikeImage());

		ds.put(e);
		
		return bike;
	}
	
	public Bike update(Bike bike,String id) {

		// creating Entity class object for creating entity kind in datastore
		Entity e = new Entity("Bike", id);

		// setting property for "Entity" with the of getter method
		e.setProperty("bikeId", id);
		e.setProperty("tariffId", bike.getTariffId());
		e.setProperty("bikeName", bike.getBikeName());
		e.setProperty("bikeDescription", bike.getBikeDescription());
		e.setProperty("bikeCategory", bike.getBikeCategory());
		e.setProperty("bikeCompany", bike.getBikeCompany());
		e.setProperty("bikeModel", bike.getBikeModel());
		e.setProperty("bikeRCNo", bike.getBikeRCNo());
		e.setProperty("bikeRCName", bike.getBikeRCName());
		e.setProperty("bikeRCRegDate", bike.getBikeRCRegDate());
		e.setProperty("bikeRCExpDate", bike.getBikeRCExpDate());
		e.setProperty("bikeRCCHNO", bike.getBikeRCCHNO());
		e.setProperty("bikeRCEnginNo", bike.getBikeRCEnginNo());
		e.setProperty("bikeYearMfg", bike.getBikeYearMfg());
		e.setProperty("bikeNoOfGear", bike.getBikeNoOfGear());
		e.setProperty("bikeColor", bike.getBikeColor());
		e.setProperty("selfStart", bike.getSelfstart());
		e.setProperty("bikeEnginCC", bike.getBikeEnginCC());
		e.setProperty("status", bike.getStatus());
		e.setProperty("bikeImage", bike.getBikeImage());

		ds.put(e);
		
		return bike;
	}

	public void deleteBikeByBikeId(String bikeId) {
		Key key = KeyFactory.createKey("Bike", bikeId);
		ds.delete(key);
	}

}
