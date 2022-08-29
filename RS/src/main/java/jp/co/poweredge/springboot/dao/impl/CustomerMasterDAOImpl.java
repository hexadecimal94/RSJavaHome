package jp.co.poweredge.springboot.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.poweredge.springboot.dao.CustomerMasterDAO;

@Repository
public class CustomerMasterDAOImpl implements CustomerMasterDAO{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@SuppressWarnings("deprecation")
	@Override
	public String GetCsName(String customerCd) {
		String SQL = "SELECT" +
				"			customer_name" +
				"		FROM" +
				"			customer_master" +
				"		WHERE" +
				"			customer_cd = ?" +
				"		AND" +
				"			delete_flg = 0";
		return jdbcTemplate.queryForObject(SQL, new Object[]{customerCd}, String.class);
	}

	@SuppressWarnings("deprecation")
	@Override
	public String GetRate(String customerCd) {
		String SQL = "SELECT" +
				"			rate_level1" +
				"		FROM" +
				"			customer_master" +
				"		WHERE" +
				"			customer_cd = ?" +
				"		AND" +
				"			delete_flg = 0";
		return jdbcTemplate.queryForObject(SQL, new Object[]{customerCd}, String.class);
	}

}
