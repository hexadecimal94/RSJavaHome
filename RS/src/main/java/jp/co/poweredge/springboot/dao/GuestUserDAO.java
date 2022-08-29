package jp.co.poweredge.springboot.dao;

import jp.co.poweredge.springboot.dto.CustomerUserDTO;

public interface GuestUserDAO {
	public CustomerUserDTO FindUser(String customerUserId, String password);
}
