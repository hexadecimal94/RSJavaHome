package jp.co.poweredge.springboot.dao.impl;

import java.util.List;

import jp.co.poweredge.springboot.dao.MerchandiseMasterDAO;
import jp.co.poweredge.springboot.model.MerchandiseMaster;


public class MerchandiseMasterDAOImpl implements MerchandiseMasterDAO {

	@Override
	public int insertMerchandise() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public boolean deleteExhibition() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public List<MerchandiseMaster> findAllMerchandise() {

		String sql = "SELECT * FROM MERCHANDISE_MASTER";

//		List<MerchandiseMaster> merchandiseMasterList = new ArrayList<MerchandiseMaster>();
//
//		Connection connection = JdbcDAOFactory.createConnection();
//		Statement statement = null;
//		try {
//			statement = connection.createStatement();
//			ResultSet rs = statement.executeQuery(sql);
//
//			while(rs.next()) {
//				MerchandiseMaster merchandiseMaster = new MerchandiseMaster();
//				merchandiseMaster.setMerchandiseCd(rs.getString("merchandise_cd"));
//				merchandiseMaster.setMerchandiseName(rs.getString("merchandise_name"));
//				merchandiseMaster.setMaterial(rs.getString("material"));
//				merchandiseMaster.setSalesUnitPrice(rs.getDouble("sales_unit_price"));
//				merchandiseMaster.setDeliveryTime(rs.getString("delivery_time"));
//				merchandiseMaster.setComment(rs.getString("comment"));
//				merchandiseMasterList.add(merchandiseMaster);
//			}
//
//			return merchandiseMasterList;
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//			return null;
//		}
		return null;
	}

	@Override
	public boolean updateMerchandise() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
