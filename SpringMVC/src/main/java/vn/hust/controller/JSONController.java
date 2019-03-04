package vn.hust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import vn.hust.service.DataService;

@RestController
public class JSONController {
	@Autowired
	private DataService dataService;

	@RequestMapping(value = "json/data", method = RequestMethod.GET)
	public String getUser() {
		Gson gson = new Gson();
		return gson.toJson(dataService.outputList());
	}

}
