package com.dao;

import com.entity.JiequxuqiuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiequxuqiuVO;
import com.entity.view.JiequxuqiuView;


/**
 * 接取需求
 * 
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface JiequxuqiuDao extends BaseMapper<JiequxuqiuEntity> {
	
	List<JiequxuqiuVO> selectListVO(@Param("ew") Wrapper<JiequxuqiuEntity> wrapper);
	
	JiequxuqiuVO selectVO(@Param("ew") Wrapper<JiequxuqiuEntity> wrapper);
	
	List<JiequxuqiuView> selectListView(@Param("ew") Wrapper<JiequxuqiuEntity> wrapper);

	List<JiequxuqiuView> selectListView(Pagination page,@Param("ew") Wrapper<JiequxuqiuEntity> wrapper);

	
	JiequxuqiuView selectView(@Param("ew") Wrapper<JiequxuqiuEntity> wrapper);
	

}
