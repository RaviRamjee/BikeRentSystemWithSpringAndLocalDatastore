package com.spring.dao;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.DatatypeConverter;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.cloud.datastore.Datastore;
import com.google.cloud.datastore.DatastoreOptions;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.VoidWork;
import com.spring.model.User;

public class UserImpl {

	// getting datastore service
		DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

		public void insert(User u) {
			// creating Entity class object to create entity kind in datastore
			Entity e = new Entity("User",UUID.randomUUID().toString());

			//e.setProperty("userId",101);
			e.setProperty("userName", u.getUserName());
			e.setProperty("userEmail", u.getUserEmail());
			e.setProperty("userPassword", u.getUserPassword());
			e.setProperty("userPhone", u.getUserPhoneNo());
			e.setProperty("userAddress", u.getUserAddress());
			Key key=ds.put(e);
			System.out.println(key);

		}
	
}
