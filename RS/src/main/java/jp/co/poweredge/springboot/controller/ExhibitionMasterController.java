package jp.co.poweredge.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.poweredge.springboot.dto.ExhibitionMasterDTO;
import jp.co.poweredge.springboot.service.ExhibitionMasterService;

@Controller
public class ExhibitionMasterController {

	@Autowired
	private ExhibitionMasterService exhibitionMasterService;

	@RequestMapping("/allexhmas")
	public String getAllExhibitionMaster(Model model) {

		List<ExhibitionMasterDTO> exhibitionMasterList = exhibitionMasterService.getAllExhibition();

		model.addAttribute("exhibitionMasterList", exhibitionMasterList);

		return "index";
	}
}
