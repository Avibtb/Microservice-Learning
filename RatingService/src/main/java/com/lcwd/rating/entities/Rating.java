package com.lcwd.rating.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_ratings")
public class Rating {
	
	@Id
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private String feedback;
	
	public Rating(String ratingId, String userId, String hotelId, int rating, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedback = feedback;
	}
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRatingId() {
		return ratingId;
	}
	public String getUserId() {
		return userId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public int getRating() {
		return rating;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
	

}
