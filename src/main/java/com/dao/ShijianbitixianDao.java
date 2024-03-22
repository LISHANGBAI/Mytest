package com.dao;

import com.entity.ShijianbitixianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShijianbitixianVO;
import com.entity.view.ShijianbitixianView;


/**
 * 时间币提现
 * 
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface ShijianbitixianDao extends BaseMapper<ShijianbitixianEntity> {
	
	List<ShijianbitixianVO> selectListVO(@Param("ew") Wrapper<ShijianbitixianEntity> wrapper);
	
	ShijianbitixianVO selectVO(@Param("ew") Wrapper<ShijianbitixianEntity> wrapper);
	
	List<ShijianbitixianView> selectListView(@Param("ew") Wrapper<ShijianbitixianEntity> wrapper);

	List<ShijianbitixianView> selectListView(Pagination page,@Param("ew") Wrapper<ShijianbitixianEntity> wrapper);

	
	ShijianbitixianView selectView(@Param("ew") Wrapper<ShijianbitixianEntity> wrapper);
	

}
