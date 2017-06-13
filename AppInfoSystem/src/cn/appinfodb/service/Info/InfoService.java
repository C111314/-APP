package cn.appinfodb.service.Info;

import java.util.List;
<<<<<<< HEAD
import cn.appinfodb.pojo.Info;

public interface InfoService {
	
	public List<Info> selectInfo(String softwareName,
													int flatformId,
													int categoryLevel1,
													int categoryLevel2,
													int categoryLevel3,
													int cnindex,
													int pageCount);
	
	public int selectInfoCount(String softwareName,
			 int flatformId,
			 int categoryLevel1,
			 int categoryLevel2,
			 int categoryLevel3);
	
	public List<Info> selectFeClass();
}



=======

import org.apache.ibatis.annotations.Param;

import cn.appinfodb.pojo.Info;


public interface InfoService {

	public List<Info> getInfos(String softwareName ,
			int flatformId ,
			int status ,
			int categoryLevel1 ,
			int categoryLevel2 ,
			int categoryLevel3);
}

/**/ 
>>>>>>> 3465bee2703f1a203b4291b61f51e9d33789ddae
