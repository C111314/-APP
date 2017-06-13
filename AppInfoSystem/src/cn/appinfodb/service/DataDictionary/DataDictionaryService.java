package cn.appinfodb.service.DataDictionary;

<<<<<<< HEAD
=======
import java.util.List;

import cn.appinfodb.pojo.DataDictionary;

public interface DataDictionaryService {
	public List<DataDictionary> getStatuss();

	public List<DataDictionary> getflatFoList();
>>>>>>> 3465bee2703f1a203b4291b61f51e9d33789ddae


import java.util.List;

import cn.appinfodb.pojo.DataDictionary;

public interface DataDictionaryService {
	
	public 	DataDictionary selectDataById(int id);
	
	public 	List<DataDictionary> selectData();
}
