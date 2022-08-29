package jp.co.poweredge.springboot.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jp.co.poweredge.springboot.model.MerchandiseMaster;


public class MerchandiseMasterRowMapper implements RowMapper<MerchandiseMaster> {

	@Override
	public MerchandiseMaster mapRow(ResultSet rs, int rowNum) throws SQLException {
		final MerchandiseMaster merchandiseMaster = new MerchandiseMaster();

		merchandiseMaster.setMerchandiseCd(rs.getString("merchandise_cd"));
		merchandiseMaster.setMerchandiseName(rs.getString("merchandise_name"));
		merchandiseMaster.setMaterial(rs.getString("material"));
		merchandiseMaster.setSalesUnitPrice(rs.getDouble("sales_unit_price"));
		merchandiseMaster.setDeliveryTime(rs.getString("delievery_time"));
		merchandiseMaster.setComment(rs.getString("comment"));
		return merchandiseMaster;
	}

}
