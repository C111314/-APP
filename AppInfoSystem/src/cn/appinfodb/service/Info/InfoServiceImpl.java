package cn.appinfodb.service.Info;

import java.util.List;
<<<<<<< HEAD
=======

>>>>>>> 3465bee2703f1a203b4291b61f51e9d33789ddae
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.appinfodb.dao.Info.InfoMapper;
import cn.appinfodb.pojo.Info;
<<<<<<< HEAD
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

=======

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
	
	
	
>>>>>>> 3465bee2703f1a203b4291b61f51e9d33789ddae

}
