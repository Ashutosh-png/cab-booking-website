package com.workshop.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.workshop.Entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer>{

	@Query("SELECT MAX(b.bookingId) FROM Booking b")
	String findMaxBookingId();

	
	List<Booking> findByUserid(String userid);
}
