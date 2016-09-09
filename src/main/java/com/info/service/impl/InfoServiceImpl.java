package com.info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.dao.InfoDao;
import com.info.model.Info;
import com.info.service.InfoService;

@Service
public class InfoServiceImpl implements InfoService{
	@Autowired
	private InfoDao infoDao;

	public Info getInfoByUUID(String uuid) {
		// TODO Auto-generated method stub
		return infoDao.getInfoByUUID(uuid);
	}
}
