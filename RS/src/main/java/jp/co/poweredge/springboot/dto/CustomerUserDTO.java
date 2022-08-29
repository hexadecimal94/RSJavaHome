package jp.co.poweredge.springboot.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component("customerUserDTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerUserDTO {
	String customerUserId;
	String customerMail;
	String password;
	String initFlg;
	String adminFlg;
	String customerCd;
	String createDate;
	String createUser;
	String updateDate;
	String updateUser;
	int deleteFlg;
}
