package com.dao;

import com.entity.JinengpeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinengpeixunVO;
import com.entity.view.JinengpeixunView;


/**
 * 技能培训
 * 
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface JinengpeixunDao extends BaseMapper<JinengpeixunEntity> {
	
	List<JinengpeixunVO> selectListVO(@Param("ew") Wrapper<JinengpeixunEntity> wrapper);
	
	JinengpeixunVO selectVO(@Param("ew") Wrapper<JinengpeixunEntity> wrapper);
	
	List<JinengpeixunView> selectListView(@Param("ew") Wrapper<JinengpeixunEntity> wrapper);

	List<JinengpeixunView> selectListView(Pagination page,@Param("ew") Wrapper<JinengpeixunEntity> wrapper);

	
	JinengpeixunView selectView(@Param("ew") Wrapper<JinengpeixunEntity> wrapper);
	

}
