package com.quickpay.springbootrest.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.quickpay.springbootrest.model.Mobiles;

@Component
public class MobilesMapper {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int add(Mobiles mobile) {
		return jdbcTemplate.update("INSERT INTO quickpay.mobiles (id,Model,Price,Company) VALUES (?, ?, ?, ?)",
				mobile.getId(), mobile.getModel(), mobile.getPrice(), mobile.getCompany());
	}
}