package com.syiaas.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syiaas.dao.ExhibitionInfoDao;
import com.syiaas.dao.WuserDao;
import com.syiaas.pojo.Pie;
import com.syiaas.utils.Constants;
import com.syiaas.utils.DataSourceHolder;



@Controller
public class TestController {
	
	
	@Autowired
	private ExhibitionInfoDao exhibitionInfoDao;
	
	

	@Autowired
	private WuserDao wuserDao;
	
	
	@RequestMapping(value = "/zh", method = RequestMethod.GET)
	@ResponseBody
	public Object getZH(){
		//DataSourceHolder.setDataSources(Constants.DATASOURCE_ONE);
		//DataSourceHolder.setDataSources(Constants.DATASOURCE_TWO);
		return exhibitionInfoDao.getExhibitionInfo(70001);
	}
	
	
	
	@RequestMapping(value = "/wu", method = RequestMethod.GET)
	@ResponseBody
	public Object getWuser(){
		//DataSourceHolder.setDataSources(Constants.DATASOURCE_ONE);
		DataSourceHolder.setDataSources(Constants.DATASOURCE_TWO);
		return wuserDao.getWuser(3);
	}
	//
	@RequestMapping(value = "/pie", method = RequestMethod.GET)
	@ResponseBody
	public List<Pie> getPie(){
		//DataSourceHolder.setDataSources(Constants.DATASOURCE_ONE);
		DataSourceHolder.setDataSources(Constants.DATASOURCE_TWO);
		return wuserDao.getWuserValueName(3);
	}
	
	
    
   
}
