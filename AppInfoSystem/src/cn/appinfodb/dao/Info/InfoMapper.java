package cn.appinfodb.dao.Info;

import java.util.List;
<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;
import cn.appinfodb.pojo.Info;
public interface InfoMapper {
	/**
	 * 根据条件查询并分页
	 * @param map
	 * @return
	 */
		public List<Info> selectInfo(@Param("softwareName")String softwareName,
														@Param("flatformId")int flatformId,
														@Param("categoryLevel1")int categoryLevel1,
														@Param("categoryLevel2")int categoryLevel2,
														@Param("categoryLevel3")int categoryLevel3,
														@Param("index")int index,
														@Param("pageCount")int pageCount);
		public int selectInfoCount(@Param("softwareName")String softwareName,
													 @Param("flatformId")int flatformId,
													 @Param("categoryLevel1")int categoryLevel1,
													 @Param("categoryLevel2")int categoryLevel2,
													 @Param("categoryLevel3")int categoryLevel3);
		
		
		public List<Info> selectFeClass();
		
=======

import org.apache.ibatis.annotations.Param;

import cn.appinfodb.pojo.Info;

public interface InfoMapper {
	
	public List<Info>getInfo(@Param("softwareName")String softwareName ,
			@Param("flatformId")int flatformId ,
			@Param("status")int status ,
			@Param("categoryLevel1")int categoryLevel1 ,
			@Param("categoryLevel2")int categoryLevel2 ,
			@Param("categoryLevel3")int categoryLevel3 );
	
	
>>>>>>> 3465bee2703f1a203b4291b61f51e9d33789ddae
}
/**/