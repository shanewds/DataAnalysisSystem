package com.syiaas.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.syiaas.pojo.ExhibitionInfo;


public interface ExhibitionInfoDao {

	public ExhibitionInfo getExhibitionInfo(@Param("pavilionid")int pavilionid);
	
}
