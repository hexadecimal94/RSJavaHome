package jp.co.poweredge.springboot.dao;

import java.util.List;

import jp.co.poweredge.springboot.model.MerchandiseMaster;

public interface MerchandiseMasterDAO {
	public int insertMerchandise();
	public boolean deleteExhibition();
	public List<MerchandiseMaster> findAllMerchandise();
	public boolean updateMerchandise();
}
