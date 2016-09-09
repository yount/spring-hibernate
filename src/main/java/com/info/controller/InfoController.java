package com.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.info.model.Info;
import com.info.service.InfoService;

@Controller
@RequestMapping("info")
public class InfoController {
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("infoDetail")
	public String getInfo(){
		ModelMap map = new ModelMap();
		Info info = infoService.getInfoByUUID("2406fb36-d7d7-48ea-9853-e88285f87817");
		map.put("info", info);
		return "info/infoDetail.jsp";
	}
}
