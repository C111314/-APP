package cn.appinfodb.service.Category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.appinfodb.dao.Category.CategoryMapper;
import cn.appinfodb.pojo.Category;
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryMapper categoryMapper;
	
	
	public void setCategoryMapper(CategoryMapper categoryMapper) {
		this.categoryMapper = categoryMapper;
	}


	@Override
	public List<Category> getCategOne() {
		// TODO Auto-generated method stub
		return categoryMapper.getCategoryOne();
	}


	@Override
	public List<Category> getCategTow(int firstListId) {
		// TODO Auto-generated method stub
		return categoryMapper.getCategoryTow(firstListId);
	}


	@Override
	public List<Category> getCategThree(int secoundlistId) {
		// TODO Auto-generated method stub
		return categoryMapper.getCategoryThree(secoundlistId);
	}

}
