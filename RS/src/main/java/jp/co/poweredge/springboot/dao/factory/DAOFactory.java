package jp.co.poweredge.springboot.dao.factory;

import jp.co.poweredge.springboot.dao.CustomerMasterDAO;
import jp.co.poweredge.springboot.dao.ExhibitionMasterDAO;
import jp.co.poweredge.springboot.dao.GuestUserDAO;
import jp.co.poweredge.springboot.dao.ImageMasterDAO;
import jp.co.poweredge.springboot.dao.MerchandiseMasterDAO;

public abstract class DAOFactory {

	public abstract MerchandiseMasterDAO getMerchandiseMasterDAO();
	public abstract ExhibitionMasterDAO getExhibitionMasterDAO();
	public abstract CustomerMasterDAO getCustomerMasterDAO();
	public abstract GuestUserDAO getGuestUserDAO();
	public abstract ImageMasterDAO getImageMasterDAO();

	public static DAOFactory getDAOJDBCFactory() {
		return new JdbcDAOFactory();
	}

	public static DAOFactory getDAOXMLFactory() {
		return null;
	}
}
