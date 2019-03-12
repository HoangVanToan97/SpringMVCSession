package vn.hust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import vn.hust.service.JSONService;
@RestController
public class JSONController {
	@Autowired
	private JSONService service;
	
	@RequestMapping(value="data/json", method=RequestMethod.GET)
	public String jsonUser() {
		Gson gson = new Gson();
		return gson.toJson(service.outputList());
	}

}
