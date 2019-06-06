package com.flightsearch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FlightSearchController {
	
    @RequestMapping(value="/flightcontroller")
    public ModelAndView flightcontroller()
    {
        return new ModelAndView("flightcontroller");
    }
    
    @RequestMapping(value="/flightdetails",method=RequestMethod.GET,produces="application/json")
    public List<FlightDetail> userdetails()
    {
    	List <FlightDetail> flightDetails = new ArrayList<FlightDetail>();
    	
		FlightDetail flightDetail1 = new FlightDetail("2005", "UA", "IAH", "2018-01-31 05:10:00", "ORD",
				"2018-01-31 07:57:00", "Airbus A320", "925", "02:47", "Arrived at Gate");
     	flightDetails.add(flightDetail1);
    	     	flightDetail1 = new FlightDetail("0638", "UA", "IAH", "2018-01-31 07:45:00", "ORD",
				"2018-01-31 10:18:00", "Boeing 737-900", "925", "02:47", "Arrived at Gate");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("1160", "UA", "IAH", "2018-01-31 12:05:00", "ORD",
				"2018-01-31 14:38:00", "Boeing 737-800", "925", "02:41", "Arrived at Gate");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("1256", "UA", "IAH", "2018-01-31 14:22:00", "ORD",
				"2018-01-31 17:01:00", "Boeing 737-800", "925", "02:41", "On Time");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("2153", "UA", "IAH", "2018-01-31 16:24:00", "ORD",
				"2018-01-31 19:27:00", "Boeing 737-800", "925", "02:47", "On Time");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("2155", "UA", "IAH", "2018-01-31 18:10:00", "ORD",
				"2018-01-31 20:49:00", "Boeing 737-900", "925", "02:39", "On Time");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("2131", "UA", "IAH", "2018-01-31 19:49:00", "ORD",
				"2018-01-31 22:00:00", "Boeing 737-900", "925", "02:31", "On Time");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("2043", "UA", "ORD", "2018-01-31 06:08:00", "IAH",
				"2018-01-31 08:42:00", "Boeing 737-800", "925", "02:34", "Arrived at Gate");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("0748", "UA", "ORD", "2018-01-31 08:10:00", "IAH",
				"2018-01-31 10:44:00", "Boeing 737-900", "925", "02:34", "Arrived at Gate");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("2166", "UA", "ORD", "2018-01-31 10:15:00", "IAH",
				"2018-01-31 12:53:00", "Airbus A320", "925", "02:34", "Arrived at Gate");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("2171", "UA", "ORD", "2018-01-31 12:45:00", "IAH",
				"2018-01-31 15:34:00", "Airbus A320", "925", "02:39", "On Time");
     	flightDetails.add(flightDetail1);
     	flightDetail1 = new FlightDetail("1128", "UA", "ORD", "2018-01-31 14:05:00", "IAH",
				"2018-01-31 16:52:00", "Boeing 737-800", "925", "02:41", "On Time");
     	flightDetails.add(flightDetail1);
        return flightDetails;
    }
}
