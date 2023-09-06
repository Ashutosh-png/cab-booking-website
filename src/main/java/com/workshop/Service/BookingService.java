package com.workshop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.Entity.Booking;
import com.workshop.Repo.BookingRepo;

@Service
public class BookingService {
	
	@Autowired
	BookingRepo repo;
	
	
	public void saveBooking(Booking booking ) {
		repo.save(booking);
	}
	
	 public String getLastUsedBookingId() {
	        // Fetch the maximum booking ID from the database
	        String lastUsedId = repo.findMaxBookingId();
	        
	        // If lastUsedId is null, return 0
	        if (lastUsedId == null) {
	            return "";
	        }
	        
	        return lastUsedId;
	    }
	 
	 public List<Booking> getBooking(String userid){
		 return repo.findByUserid(userid);
	 }
	 
	 public List<Booking> getAll(){
		 return repo.findAll();
	 }
	 
	 public Booking findBookingbyId(int id) {
		 return repo.findById(id).get();
		 
	 }
	 
	 public void deleteBooking(Booking booking) {
		 repo.delete(booking);
	 }

}
