package com.syiaas.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.syiaas.dao.WuserDao;
import com.syiaas.pojo.Pie;

@Service
public class WuserServiceImpl implements WuserService{
	
	
	@Autowired
	private WuserDao  wuserDao;
	
	

	@Override
	public List<Pie> getWuserValueName(int exhibitionid) {
		
		return wuserDao.getWuserValueName(exhibitionid);
	}
	
	
	
	
	
}
