package jp.co.poweredge.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import jp.co.poweredge.springboot.dao.factory.DAOFactory;
import jp.co.poweredge.springboot.dao.impl.CustomerMasterDAOImpl;
import jp.co.poweredge.springboot.dao.impl.ExhibitionMasterDAOImpl;
import jp.co.poweredge.springboot.dao.impl.GuestUserDAOImpl;
import jp.co.poweredge.springboot.dao.impl.ImageMasterDAOImpl;
import jp.co.poweredge.springboot.dto.CustomerUserDTO;
import jp.co.poweredge.springboot.dto.ExhibitionMasterDTO;
import jp.co.poweredge.springboot.dto.ImageMasterDTO;

@Component
public class SqlTestClass implements CommandLineRunner {

	DAOFactory jdbcDaoFactory = DAOFactory.getDAOJDBCFactory();

	@Autowired
	ExhibitionMasterDAOImpl exhibitionMasterDAOImpl = (ExhibitionMasterDAOImpl) jdbcDaoFactory.getExhibitionMasterDAO();

	@Autowired
	CustomerMasterDAOImpl customerMasterDAOImpl = (CustomerMasterDAOImpl) jdbcDaoFactory.getCustomerMasterDAO();

	@Autowired
	GuestUserDAOImpl guestUserDAOImpl = (GuestUserDAOImpl)jdbcDaoFactory.getGuestUserDAO();

	@Autowired
	ImageMasterDAOImpl imageMasterDAOImpl = (ImageMasterDAOImpl) jdbcDaoFactory.getImageMasterDAO();

	@Override
	public void run(String... args) throws Exception {

		ExhibitionMasterDTO exdto = exhibitionMasterDAOImpl.GetExName("2021SSod");
//		List<ExhibitionMasterDTO> exdtolist = exhibitionMasterDAOImpl.findAllExhibition();
//
//		for(ExhibitionMasterDTO exdto1 : exdtolist) {
//			System.out.println(exdto1.toString());
//		}

		String customerName = customerMasterDAOImpl.GetCsName("AUT702");
		String rateLevel = customerMasterDAOImpl.GetRate("AUT702");

		CustomerUserDTO customerUserDTO = guestUserDAOImpl.FindUser("SHOP177", "WAKAYAMA11");

		System.out.println(exdto.getExhibitionName());
		System.out.println(exdto.getReorderFlg());
		System.out.println("customerName is : " + customerName);
		System.out.println("customer ratelevel is : " + rateLevel);

		System.out.println("customerUserDTO customer_user_id is " + customerUserDTO.getCustomerUserId());
		System.out.println("customerUserDTO init_flg is " + customerUserDTO.getInitFlg());

		System.out.println("customerUserDTO whole object : " + customerUserDTO.toString());

		ImageMasterDTO imageMasterDTO = imageMasterDAOImpl.getImageByImageId("3");

		System.out.println(imageMasterDTO.getContentType());

		byte[] bytearray = imageMasterDTO.getImage();

		String imageString = new String(bytearray);
        System.out.println(imageString);

	}


}
