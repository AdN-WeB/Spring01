package fr.wcs.challenge_Spring01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Doctors_Controller {
@GetMapping ("/doctor/1")
@ResponseBody
	public String willHere() {
	return "William hartnell";
}

@GetMapping("/doctor/10")
@ResponseBody
  public String davidHere() {
	return "David Tennant";
}

@GetMapping("/doctor/13")
@ResponseBody
  public String jodiHere() {
	return "Jodie Whittaker";
}

} 
