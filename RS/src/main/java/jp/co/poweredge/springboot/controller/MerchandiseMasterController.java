package jp.co.poweredge.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.poweredge.springboot.model.MerchandiseMaster;
import jp.co.poweredge.springboot.service.MerchandiseMasterService;

@Controller
public class MerchandiseMasterController {

	@Autowired
	private MerchandiseMasterService merchandiseMasterService;

	@RequestMapping("/")
	public String getAllMerchandiseMaster(Model model) {

		List<MerchandiseMaster> merchandiseMasterList = merchandiseMasterService.getAllMerchandiseMaster();

		model.addAttribute("merchandiseList", merchandiseMasterList);

		return "merchandiseList";

	}
}
