package com.quickpay.springbootrest.service;

import java.util.List;

import org.json.simple.JSONObject;

import com.quickpay.springbootrest.model.Mobiles;

public interface IMobilesService {
	List<Mobiles> getAllMobiles();

	JSONObject addMobile(Mobiles mob);
}