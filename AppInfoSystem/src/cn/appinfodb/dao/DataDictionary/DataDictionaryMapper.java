package cn.appinfodb.dao.DataDictionary;

import java.util.List;

<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;

import cn.appinfodb.pojo.DataDictionary;



public interface DataDictionaryMapper {
	
	public 	DataDictionary selectDataById(@Param("id")int id);
	public 	List<DataDictionary> selectData();
=======
import cn.appinfodb.pojo.DataDictionary;

public interface DataDictionaryMapper {

	/**
	 * 查询APP状态
	 * @return
	 */
	public List<DataDictionary> getStatus();
	
	/**
	 * 查询所属平台
	 * @return
	 */
	public List<DataDictionary> getflatFormList();
	
>>>>>>> 3465bee2703f1a203b4291b61f51e9d33789ddae
}
