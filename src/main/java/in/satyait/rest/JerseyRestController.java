package in.satyait.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JerseyRestController {
	
	@GetMapping("/state/{number}")
    public String getLocation(@PathVariable Long number) {
        String numberStr = String.valueOf(number);
        
        if (numberStr.startsWith("1")) {
            return "New Zealand";
        } else if (numberStr.startsWith("2")) {
            return "Ohio";
        } else if (numberStr.startsWith("3")) {
            return "Vermont";
        } else if (numberStr.startsWith("4")) {
            return "Washington";
        } else if (numberStr.startsWith("5")) {
            return "New Jersey";
        } else if (numberStr.startsWith("6")) {
            return "New Zealand";
        } else if (numberStr.startsWith("7")) {
            return "South Carolina";
        } else if (numberStr.startsWith("8")) {
            return "Texas";
        } else if (numberStr.startsWith("9")) {
            return "Florida";
        } else if (numberStr.startsWith("0")) {
            return "Vermont";
        }else {
        	return "Invalid SSN";
        }
		 
     }

}
