package com.dao;

import com.entity.HuodongriliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongriliVO;
import com.entity.view.HuodongriliView;


/**
 * 活动日历
 * 
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface HuodongriliDao extends BaseMapper<HuodongriliEntity> {
	
	List<HuodongriliVO> selectListVO(@Param("ew") Wrapper<HuodongriliEntity> wrapper);
	
	HuodongriliVO selectVO(@Param("ew") Wrapper<HuodongriliEntity> wrapper);
	
	List<HuodongriliView> selectListView(@Param("ew") Wrapper<HuodongriliEntity> wrapper);

	List<HuodongriliView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongriliEntity> wrapper);

	
	HuodongriliView selectView(@Param("ew") Wrapper<HuodongriliEntity> wrapper);
	

}
