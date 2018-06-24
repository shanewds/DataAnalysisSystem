package com.syiaas.dao;

import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.syiaas.pojo.Pie;
import com.syiaas.pojo.Wuser;

@Repository
public class WuserDaoImpl  extends SqlSessionDaoSupport implements WuserDao {



	@Override
	public List<Wuser> getWuser(int exhibitionid) {
		
		return getSqlSession().selectList("com.syiaas.dao.WuserDao.getWuser", exhibitionid);
	}

	@Override
	public List<Pie> getWuserValueName(int exhibitionid) {
		
		return getSqlSession().selectList("com.syiaas.dao.WuserDao.getWuserValueName", exhibitionid);
		
	}

}
