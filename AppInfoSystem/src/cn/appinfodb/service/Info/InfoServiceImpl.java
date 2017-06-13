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

	@Override
	public List<Info> selectInfo(String softwareName,
													int flatformId,
													int categoryLevel1, 
													int categoryLevel2,
													int categoryLevel3,
													int cnindex, int pageCount) {
		
		return infoMapper.selectInfo(softwareName, flatformId, 
														categoryLevel1, categoryLevel2, categoryLevel3, 
														(cnindex-1)*pageCount, pageCount);
	}

	@Override
	public int selectInfoCount(String softwareName,
												 int flatformId,
												 int categoryLevel1, 
												 int categoryLevel2, 
												 int categoryLevel3) {
		
		return infoMapper.selectInfoCount(softwareName, flatformId, categoryLevel1, categoryLevel2, categoryLevel3);
	}

	@Override
	public List<Info> selectFeClass() {
		
		return infoMapper.selectFeClass();
	}


}
