package com.spring.dao;

import java.util.UUID;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.spring.model.Bike;

public class BikeImpl {
	
	public void insert(Bike bike)
	{
		    
		// getting datastore service
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();
		    //creating Entity class object for creating entity kind in datastore
		    Entity e=new Entity("Bike",UUID.randomUUID().toString());
		    
		    //setting property for "Entity" with the of getter method
           // e.setProperty("Bike_id",bike.getBike_id());
		    e.setProperty("BikeName",bike.getBikeName());
		    e.setProperty("BikeDescription",bike.getBikeDescription());
		    e.setProperty("BikeCategory", bike.getBikeCategory());
		    e.setProperty("BikeCompany", bike.getBikeCompany());
		    e.setProperty("BikeModel", bike.getBikeModel());
		    e.setProperty("BikeRCNo", bike.getBikeRCNo());
		    e.setProperty("BikeRCName",bike.getBikeRCName());
		    e.setProperty("BikeRCRegDate", bike.getBikeRCRegDate());
		    e.setProperty("BikeRCExpDate", bike.getBikeRCExpDate());
		    e.setProperty("BikeRCCHNO",bike.getBikeRCCHNO());
		    e.setProperty("BikeRCEnginNo", bike.getBikeRCEnginNo());
		    e.setProperty("BikeYearMfg", bike.getBikeYearMfg());
		    e.setProperty("BikeNoOfGear", bike.getBikeNoOfGear());
		    e.setProperty("BikeColor",bike.getBikeColor());
		    e.setProperty("Selfstart", bike.getSelfstart());
		    e.setProperty("BikeEnginCC",bike.getBikeEnginCC());
		    e.setProperty("Status",bike.getStatus());
		
		    ds.put(e);
	}

}
