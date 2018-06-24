package com.syiaas.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.syiaas.pojo.Pie;
import com.syiaas.pojo.Wuser;


public interface WuserDao {

	public List<Wuser> getWuser(@Param("exhibitionid")int exhibitionid);
	
	public List<Pie> getWuserValueName(@Param("exhibitionid")int exhibitionid);
	
}
