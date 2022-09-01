package jp.co.poweredge.springboot.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.poweredge.springboot.dao.ImageMasterDAO;
import jp.co.poweredge.springboot.dto.ImageMasterDTO;

@Repository
public class ImageMasterDAOImpl implements ImageMasterDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public ImageMasterDTO getImageByImageId(String imageId) {


		String SQL = "SELECT\r\n" +
				"	image\r\n" +
				"	,content_type\r\n" +
				"FROM\r\n" +
				"	image_master\r\n" +
				"WHERE\r\n" +
				"	image_id = ?";

		Map<String,Object> map = jdbcTemplate.queryForMap(SQL, imageId);

		ImageMasterDTO imageMasterDTO = new ImageMasterDTO((byte[])map.get("image")
				,(String)map.get("content_type"));

		return imageMasterDTO;
	}

}
