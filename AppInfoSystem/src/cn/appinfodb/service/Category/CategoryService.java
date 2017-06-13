package cn.appinfodb.service.Category;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import cn.appinfodb.pojo.Category;

public interface CategoryService {

	public List<Category>getCategOne();

	public List<Category>getCategTow(int firstListId);
	
	public List<Category>getCategThree(int secoundlistId);
}
