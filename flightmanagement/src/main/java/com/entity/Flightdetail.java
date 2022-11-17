package com.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="flight_detail")

public class Flightdetail {
	    
		
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    
	    //variables
	    @Column(name="id")
	    private int id;
	    
	    @Column(name="location")
	    private String location;
	    

	    
	    @ManyToMany(mappedBy="Flightdetail")
	    private List<Flight> Flight;
	    
	    

		public Flightdetail() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public Flightdetail( String location) {
			super();
			this.location = location;
			
		}



		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}


		public List<Flight> getFlight() {
			return Flight;
		}

		public void setFlight(List<Flight> Flight) {
			this.Flight = Flight;
		}

		@Override
		public String toString() {
			return "Flight_detail [id=" + id + ", location=" + location + ", Flight=" + Flight
					+ "]";
		}
	    
	    
	    
}
