package com.training.entity;

import java.time.LocalDate;

public class TripDetails {
	private String code;
	private String tripName;
	private LocalDate startDate;
	private LocalDate endDate;
	private long price;
	public TripDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TripDetails(String code, String tripName, LocalDate startDate, LocalDate endDate, long price) {
		super();
		this.code = code;
		this.tripName = tripName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTripName() {
		return tripName;
	}
	public void setTripName(String tripName) {
		this.tripName = tripName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TripDetails other = (TripDetails) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TripDetails [code=" + code + ", tripName=" + tripName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", price=" + price + "]";
	}
	
	
	
	
}
