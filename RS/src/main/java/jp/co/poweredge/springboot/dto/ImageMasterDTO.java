package jp.co.poweredge.springboot.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageMasterDTO {
	private BigDecimal imageId;
	private byte [] image;
	private String contentType;

	public ImageMasterDTO(byte[]image,String contentType) {
		this.image = image;
		this.contentType = contentType;
	}
}
