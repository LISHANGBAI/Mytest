package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhiyuanzhefuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhiyuanzhefuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhiyuanzhefuwuView;


/**
 * 志愿者服务评论表
 *
 * @author 
 * @email 
 * @date 2024-03-05 10:24:08
 */
public interface DiscusszhiyuanzhefuwuService extends IService<DiscusszhiyuanzhefuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhiyuanzhefuwuVO> selectListVO(Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);
   	
   	DiscusszhiyuanzhefuwuVO selectVO(@Param("ew") Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);
   	
   	List<DiscusszhiyuanzhefuwuView> selectListView(Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);
   	
   	DiscusszhiyuanzhefuwuView selectView(@Param("ew") Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper);

   	

}

