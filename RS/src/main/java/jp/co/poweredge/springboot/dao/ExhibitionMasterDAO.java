package jp.co.poweredge.springboot.dao;

import java.util.List;

import jp.co.poweredge.springboot.dto.ExhibitionMasterDTO;

public interface ExhibitionMasterDAO {
	public int insertExhibition();
	public boolean deleteExhibition();
	public List<ExhibitionMasterDTO> findAllExhibition();
	public boolean updateExhibition();


	//php method starts here
	public void CopyExhibition(String copy_code,String new_code,String user);

	public ExhibitionMasterDTO GetExName(String exhibitionCd);

}
