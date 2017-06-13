package cn.appinfodb.dao.DataDictionary;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appinfodb.pojo.DataDictionary;



public interface DataDictionaryMapper {
	
	public 	DataDictionary selectDataById(@Param("id")int id);
	public 	List<DataDictionary> selectData();
}
