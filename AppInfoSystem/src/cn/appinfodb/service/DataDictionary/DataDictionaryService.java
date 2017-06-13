package cn.appinfodb.service.DataDictionary;



import java.util.List;

import cn.appinfodb.pojo.DataDictionary;

public interface DataDictionaryService {
	
	public 	DataDictionary selectDataById(int id);
	
	public 	List<DataDictionary> selectData();
}
