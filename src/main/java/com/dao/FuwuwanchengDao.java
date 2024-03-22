package com.dao;

import com.entity.FuwuwanchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwuwanchengVO;
import com.entity.view.FuwuwanchengView;


/**
 * 服务完成
 * 
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface FuwuwanchengDao extends BaseMapper<FuwuwanchengEntity> {
	
	List<FuwuwanchengVO> selectListVO(@Param("ew") Wrapper<FuwuwanchengEntity> wrapper);
	
	FuwuwanchengVO selectVO(@Param("ew") Wrapper<FuwuwanchengEntity> wrapper);
	
	List<FuwuwanchengView> selectListView(@Param("ew") Wrapper<FuwuwanchengEntity> wrapper);

	List<FuwuwanchengView> selectListView(Pagination page,@Param("ew") Wrapper<FuwuwanchengEntity> wrapper);

	
	FuwuwanchengView selectView(@Param("ew") Wrapper<FuwuwanchengEntity> wrapper);
	

}
