package cn.appinfodb.service.Info;

import java.util.List;

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