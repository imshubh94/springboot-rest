package com.quickpay.springbootrest.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.quickpay.springbootrest.Mapper.MobilesMapper;
import com.quickpay.springbootrest.model.Mobiles;
import com.quickpay.springbootrest.service.IMobilesService;

@Service
public class MobilesServiceImpl implements IMobilesService, Comparable<Mobiles> {

	@Autowired
	MobilesMapper mobilesMapper;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Mobiles> getAllMobiles() {

		List<Mobiles> mobList = null;
		try {
			String sql = "SELECT * FROM quickpay.mobiles;";

			mobList = jdbcTemplate.query(sql, (rs, rowNum) -> new Mobiles(rs.getInt("id"), rs.getString("Company"),
					rs.getString("Model"), rs.getDouble("Price")));

			mobList = mobList.stream().collect(Collectors.toList());

		} catch (Exception e) {
			System.out.println(" Errors : " + e.getMessage());
			System.out.println(" Errors : " + e.getMessage());
		}
		return mobList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public JSONObject addMobile(Mobiles mobile) {
		int res = 0;
		JSONObject json = new JSONObject();

		try {

			res = mobilesMapper.add(mobile);

			if (res > 0) {
				json.put("Rows Affected", res);
				json.put("Status Code", 200);
				json.put("Status Message", "Success");
			}

		} catch (Exception e) {
			json.put("Rows Affected", res);
			json.put("Status Code", 500);
			json.put("Status Message", "Failed");
			return json;
		}
		return json;
	}

	@Override
	public int compareTo(Mobiles o) {
		return 0;
	}

}