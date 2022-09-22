package com.quickpay.springbootrest.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quickpay.springbootrest.model.Mobiles;
import com.quickpay.springbootrest.service.IMobilesService;

@RestController
public class MobilesController {
	@Autowired
	private IMobilesService iMobilesService;

//mapping the getmobiles() method to /mobiles  
	@GetMapping(value = "/mobiles")
	public List<Mobiles> getmobiles() {
//finds all the mobiless   
		List<Mobiles> mobiles = iMobilesService.getAllMobiles();
//returns the mobiles list  
		return mobiles;
	}

	@PostMapping(value = "/add")
	public JSONObject addMobilesFromUI(@RequestBody Mobiles mobile)
	{
		JSONObject json = iMobilesService.addMobile(mobile);
		return json;
	}
}