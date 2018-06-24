package com.syiaas.dao;

import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import com.syiaas.pojo.ExhibitionInfo;

@Repository
public class ExhibitionInfoDaoImpl  extends SqlSessionDaoSupport implements ExhibitionInfoDao {


	@Override
	public ExhibitionInfo getExhibitionInfo(int pavilionid) {
	
		return getSqlSession().selectOne("com.syiaas.dao.ExhibitionInfoDao",pavilionid);
	}

}
