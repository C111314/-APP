package cn.appinfodb.dao.Info;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appinfodb.pojo.Info;

public interface InfoMapper {
	
	public List<Info>getInfo(@Param("softwareName")String softwareName ,
			@Param("flatformId")int flatformId ,
			@Param("status")int status ,
			@Param("categoryLevel1")int categoryLevel1 ,
			@Param("categoryLevel2")int categoryLevel2 ,
			@Param("categoryLevel3")int categoryLevel3 );
	
	
}
/**/