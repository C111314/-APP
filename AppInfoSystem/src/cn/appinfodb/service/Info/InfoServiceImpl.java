package cn.appinfodb.service.Info;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.appinfodb.dao.Info.InfoMapper;
import cn.appinfodb.pojo.Info;

@Service("infoService")
public class InfoServiceImpl implements InfoService {
	
	@Autowired
	InfoMapper infoMapper;
	
	
	
	public void setInfoMapper(InfoMapper infoMapper) {
		this.infoMapper = infoMapper;
	}

	/*String softwareName, int flatformId, int status,
	int categoryLevel1, int categoryLevel2, int categoryLevel3*/

	@Override
	public List<Info> getInfos(String softwareName, int flatformId, int status,
			int categoryLevel1, int categoryLevel2, int categoryLevel3) {
		// TODO Auto-generated method stub
		return infoMapper.getInfo(softwareName, categoryLevel3, categoryLevel3, categoryLevel3, categoryLevel3, categoryLevel3);
	}
	
	
	

}
