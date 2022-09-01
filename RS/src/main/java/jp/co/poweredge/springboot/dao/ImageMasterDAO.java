package jp.co.poweredge.springboot.dao;

import jp.co.poweredge.springboot.dto.ImageMasterDTO;

public interface ImageMasterDAO {

	public ImageMasterDTO getImageByImageId(String imageId);
}
