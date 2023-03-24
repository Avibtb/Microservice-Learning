package com.lcwd.rating.service;

import java.util.List;

import com.lcwd.rating.entities.Rating;

public interface RatingService {
	
	//create
	Rating create(Rating rating);
	
	
	/// get all ratings
	List<Rating> getRatings();
	
	
	//get all rating by user id
	List<Rating> getRatingByUserId(String userId);
	
	
	// get all rating by hotel 
	List<Rating> getRatingByHotelId(String hotelId);

}
