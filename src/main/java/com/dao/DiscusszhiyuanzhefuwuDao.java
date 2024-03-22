package com.dao;

import com.entity.DiscusszhiyuanzhefuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhiyuanzhefuwuVO;
import com.entity.view.DiscusszhiyuanzhefuwuView;


/**
 * 志愿者服务评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-05 10:24:08
 */
public interface DiscusszhiyuanzhefuwuDao extends BaseMapper<DiscusszhiyuanzhefuwuEntity> {
	
	List<DiscusszhiyuanzhefuwuVO> selectListVO(@Param("ew") Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);
	
	DiscusszhiyuanzhefuwuVO selectVO(@Param("ew") Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);
	
	List<DiscusszhiyuanzhefuwuView> selectListView(@Param("ew") Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);

	List<DiscusszhiyuanzhefuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);

	
	DiscusszhiyuanzhefuwuView selectView(@Param("ew") Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);
	

}
