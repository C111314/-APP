package cn.appinfodb.dao.Category;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appinfodb.pojo.Category;

public interface CategoryMapper {

<<<<<<< HEAD
	
	public List<Category> selectCate1(@Param("categoryLevel1")int categoryLevel1);
	public List<Category> selectCate2(@Param("categoryLevel2")int categoryLevel2);
	public List<Category> selectCate3(@Param("categoryLevel3")int categoryLevel3);
	
	public List<Category> selectCa1();
	public List<Category> selectCa2();
	public List<Category> selectCa3();
	
	
=======
	public List<Category>getCategoryOne();
	
	public List<Category>getCategoryTow(int firstListId);
	
	public List<Category>getCategoryThree(int secoundlistId);
>>>>>>> 3465bee2703f1a203b4291b61f51e9d33789ddae
}
