package jp.co.poweredge.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jp.co.poweredge.springboot.dao.factory.DAOFactory;
import jp.co.poweredge.springboot.dao.impl.MerchandiseMasterDAOImpl;
import jp.co.poweredge.springboot.model.MerchandiseMaster;

@Service
public class MerchandiseMasterService {

	DAOFactory jdbcDaoFactory = DAOFactory.getDAOJDBCFactory();
	MerchandiseMasterDAOImpl merchandiseMasterDAOImpl = (MerchandiseMasterDAOImpl) jdbcDaoFactory.getMerchandiseMasterDAO();

	public List<MerchandiseMaster> getAllMerchandiseMaster() {
		List<MerchandiseMaster> merchandiseMasterList = merchandiseMasterDAOImpl.findAllMerchandise();
		return merchandiseMasterList;
	}

}
