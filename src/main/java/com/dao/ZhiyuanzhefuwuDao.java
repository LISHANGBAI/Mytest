package com.dao;

import com.entity.ZhiyuanzhefuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanzhefuwuVO;
import com.entity.view.ZhiyuanzhefuwuView;


/**
 * 志愿者服务
 * 
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface ZhiyuanzhefuwuDao extends BaseMapper<ZhiyuanzhefuwuEntity> {
	
	List<ZhiyuanzhefuwuVO> selectListVO(@Param("ew") Wrapper<ZhiyuanzhefuwuEntity> wrapper);
	
	ZhiyuanzhefuwuVO selectVO(@Param("ew") Wrapper<ZhiyuanzhefuwuEntity> wrapper);
	
	List<ZhiyuanzhefuwuView> selectListView(@Param("ew") Wrapper<ZhiyuanzhefuwuEntity> wrapper);

	List<ZhiyuanzhefuwuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanzhefuwuEntity> wrapper);

	
	ZhiyuanzhefuwuView selectView(@Param("ew") Wrapper<ZhiyuanzhefuwuEntity> wrapper);
	

}
