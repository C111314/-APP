package cn.appinfodb.dao.Category;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appinfodb.pojo.Category;

public interface CategoryMapper {

	public List<Category>getCategoryOne();
	
	public List<Category>getCategoryTow(int firstListId);
	
	public List<Category>getCategoryThree(int secoundlistId);
}
