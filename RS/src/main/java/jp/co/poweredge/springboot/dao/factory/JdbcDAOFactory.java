package jp.co.poweredge.springboot.dao.factory;

import jp.co.poweredge.springboot.dao.CustomerMasterDAO;
import jp.co.poweredge.springboot.dao.ExhibitionMasterDAO;
import jp.co.poweredge.springboot.dao.GuestUserDAO;
import jp.co.poweredge.springboot.dao.ImageMasterDAO;
import jp.co.poweredge.springboot.dao.MerchandiseMasterDAO;
import jp.co.poweredge.springboot.dao.impl.CustomerMasterDAOImpl;
import jp.co.poweredge.springboot.dao.impl.ExhibitionMasterDAOImpl;
import jp.co.poweredge.springboot.dao.impl.GuestUserDAOImpl;
import jp.co.poweredge.springboot.dao.impl.ImageMasterDAOImpl;
import jp.co.poweredge.springboot.dao.impl.MerchandiseMasterDAOImpl;


public class JdbcDAOFactory extends DAOFactory {


	@Override
	public MerchandiseMasterDAO getMerchandiseMasterDAO() {
		return new MerchandiseMasterDAOImpl();
	}

	@Override
	public ExhibitionMasterDAO getExhibitionMasterDAO() {
		return new ExhibitionMasterDAOImpl();
	}

	@Override
	public CustomerMasterDAO getCustomerMasterDAO() {
		return new CustomerMasterDAOImpl();
	}

	@Override
	public GuestUserDAO getGuestUserDAO() {
		return new GuestUserDAOImpl();
	}

	@Override
	public ImageMasterDAO getImageMasterDAO() {
		return new ImageMasterDAOImpl();
	}

}
