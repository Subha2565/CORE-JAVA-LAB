package com.flight;

import java.util.ArrayList;
import java.util.List;

import com.dao.FlightDao;
import com.entity.Flight;
import com.entity.Flightdetail;

//Main class
public class App {

 
	 public static void main( String[] args )
	    {
	        // Save two flights
	        Flight flight = new Flight("joy","AIRINDIA", 12);
	        Flightdetail flightdetail = new Flightdetail("MUMBAI");

	       
	        Flight flight1 = new Flight("Shree","INDIGO",20);
	        Flightdetail flightdetail1 = new Flightdetail("KOLKATA");

	    	FlightDao flightDao = new FlightDao();
	    	flightDao.saveFlight(flight);
	    	flightDao.saveFlight(flight1);
	       

	    	List<Flight> list1= new ArrayList<Flight>();
	    	List<Flightdetail> list2= new ArrayList<Flightdetail>();
	       
	    	list1.add(flight);
	    	list1.add(flight1);
	    	
	    	list2.add(flightdetail);
	    	list2.add(flightdetail1);
	    	
	    	flight1.setFlightdetail(list2);
	    	flightdetail1.setFlight(list1);
	    
	     
	    }
}
