package com.spring.booking;

import java.util.UUID;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.spring.tariff.Tariff;
import com.spring.user.User;

public class BookingDao {
	
	User user=new User();
	
	// getting datastore service
			DatastoreService ds = DatastoreServiceFactory.getDatastoreService();

			public Booking insert(Booking booking) {
				String id= UUID.randomUUID().toString();
				// creating Entity class object to create entity kind in datastore
				Entity e = new Entity("Booking",id);

				e.setProperty("bookingId",id);
				e.setProperty("bookingUserId", booking.getBookingUserId());
				e.setProperty("bookingBikeId",booking.getBookingBikeId());
				e.setProperty("bookingName", booking.getBookingName());
				e.setProperty("bookingBranch",booking.getBookingBranch());
				e.setProperty("bookingDLNo", booking.getBookingDLNo());
				e.setProperty("bookingPickupDate",booking.getBookingPickupDate());
				e.setProperty("bookingPickupTime", booking.getBookingPickupTime());
				e.setProperty("bookingDropDate",booking.getBookingDropDate());
				e.setProperty("bookingDropTime", booking.getBookingDropTime());
				e.setProperty("bookingStatus",booking.getBookingStatus());
				e.setProperty("bookingTariffSelected", booking.getBookingTariffSelected());
				e.setProperty("bookingTime", booking.getBookingTime());
				Key key = ds.put(e);
				System.out.println(key);
				
				return booking;

			}
			
			public void deleteBookingByBookingId(String bookingId) {
				Entity e = new Entity("Booking",bookingId);
				e.setProperty("bookingStatus","cancelled");
				ds.put(e);
				
				Key key = KeyFactory.createKey("Bike", bookingId);
				ds.delete(key);
			}

}
