package jp.co.poweredge.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExhibitionMasterDTO {
	String exhibitionCd;
	String exhibitionName;
	String contactMail;
	String startDate;
	String endDate;
	int publicationFlg;
	int orderWhetherFlg;
	int reorderFlg;
	int stockManagementFlg;
	int dispSwatchThumnail;
	int sizeColorClass;
	int dispSwatichClass;
	String createDate;
	String createUser;
	String updateDate;
	String updateUser;
	int deleteFlg;

	public ExhibitionMasterDTO(String exhibitionName, int reorderFlg){
		this.exhibitionName = exhibitionName;
		this.reorderFlg = reorderFlg;
	}
}
