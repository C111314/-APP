package cn.appinfodb.dao.DataDictionary;

import java.util.List;

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
	
}
