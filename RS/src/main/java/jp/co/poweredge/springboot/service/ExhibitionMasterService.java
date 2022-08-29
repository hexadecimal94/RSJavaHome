package jp.co.poweredge.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.poweredge.springboot.dao.factory.DAOFactory;
import jp.co.poweredge.springboot.dao.impl.ExhibitionMasterDAOImpl;
import jp.co.poweredge.springboot.dto.ExhibitionMasterDTO;

@Service
public class ExhibitionMasterService {

	DAOFactory jdbcDaoFactory = DAOFactory.getDAOJDBCFactory();

	@Autowired
	ExhibitionMasterDAOImpl exhibitionMasterDAOImpl = (ExhibitionMasterDAOImpl) jdbcDaoFactory.getExhibitionMasterDAO();

	public List<ExhibitionMasterDTO> getAllExhibition() {
		List<ExhibitionMasterDTO> exhibitionMasterList =  exhibitionMasterDAOImpl.findAllExhibition();
		return exhibitionMasterList;
	}

}
