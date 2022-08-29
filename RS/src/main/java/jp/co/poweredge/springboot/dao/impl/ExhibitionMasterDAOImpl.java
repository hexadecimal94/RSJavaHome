package jp.co.poweredge.springboot.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.poweredge.springboot.dao.ExhibitionMasterDAO;
import jp.co.poweredge.springboot.dto.ExhibitionMasterDTO;

@Repository
public class ExhibitionMasterDAOImpl implements ExhibitionMasterDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;


	@Override
	public int insertExhibition() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public boolean deleteExhibition() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public List<ExhibitionMasterDTO> findAllExhibition() {

		String SQL = "SELECT * FROM exhibition_master";

		return jdbcTemplate.query(SQL, (rs, rowNum) ->
											new ExhibitionMasterDTO(
													rs.getString("exhibition_cd"),
													rs.getString("exhibition_name"),
													rs.getString("contact_mail"),
													rs.getString("start_date"),
													rs.getString("end_date"),
													rs.getInt("publication_flg"),
													rs.getInt("order_whether_flg"),
													rs.getInt("reorder_flg"),
													rs.getInt("stock_management_flg"),
													rs.getInt("disp_swatch_thumnail"),
													rs.getInt("size_color_class"),
													rs.getInt("disp_swatich_class"),
													rs.getString("create_date"),
													rs.getString("create_user"),
													rs.getString("update_date"),
													rs.getString("update_user"),
													rs.getInt("delete_flg")
													));
	}

	@Override
	public boolean updateExhibition() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

	@Override
	public void CopyExhibition(String copy_code, String new_code, String user) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@SuppressWarnings("deprecation")
	@Override
	public ExhibitionMasterDTO GetExName(String exhibitionCd) {
	String SQL =  "SELECT" +
			"			exhibition_name" +
			"			,reorder_flg" +
			"		FROM" +
			"			exhibition_master" +
			"		WHERE" +
			"			exhibition_cd = ?" +
			"		AND" +
			"			delete_flg = 0 ";
		return (ExhibitionMasterDTO) jdbcTemplate.queryForObject(SQL, new Object[]{exhibitionCd},(rs, rowNum) ->
		new ExhibitionMasterDTO(
				rs.getString("exhibition_name"),
				rs.getInt("reorder_flg")
				));
	}

}
