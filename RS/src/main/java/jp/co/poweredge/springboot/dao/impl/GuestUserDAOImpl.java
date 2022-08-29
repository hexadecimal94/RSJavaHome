package jp.co.poweredge.springboot.dao.impl;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.poweredge.springboot.dao.GuestUserDAO;
import jp.co.poweredge.springboot.dto.CustomerUserDTO;

@Repository
public class GuestUserDAOImpl implements GuestUserDAO{

	@Autowired
	CustomerUserDTO customerUserDTO;

	@Autowired
	public DataSource dataSource;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public CustomerUserDTO FindUser(String customerUserId, String password) {
		MapSqlParameterSource in = new MapSqlParameterSource();
		in.addValue("customerUserId", customerUserId);
		in.addValue("password", password);

		String SQL = "SELECT" +
		"					customer_user_id," +
		"					init_flg" +
		"				FROM" +
		"					customer_user" +
		"				WHERE" +
		"					customer_user_id = :customerUserId" +
		"				AND" +
		"					password = :password" +
		"				AND delete_flg = 0" +
		"					limit 0, 1";

		Map<String,Object> map = namedParameterJdbcTemplate.queryForMap(SQL, in);


		customerUserDTO.setCustomerUserId((String)map.get("customer_user_id"));
		customerUserDTO.setInitFlg((String)map.get("init_flg"));

		return customerUserDTO;
	}

}
