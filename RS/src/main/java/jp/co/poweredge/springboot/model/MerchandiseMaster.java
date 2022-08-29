package jp.co.poweredge.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MerchandiseMaster {

	private String merchandiseCd;
	private String merchandiseName;
	private String material;
	private Double salesUnitPrice;
	private String deliveryTime;
	private String comment;
}
