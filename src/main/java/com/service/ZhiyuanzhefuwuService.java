package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanzhefuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanzhefuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanzhefuwuView;


/**
 * 志愿者服务
 *
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface ZhiyuanzhefuwuService extends IService<ZhiyuanzhefuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanzhefuwuVO> selectListVO(Wrapper<ZhiyuanzhefuwuEntity> wrapper);
   	
   	ZhiyuanzhefuwuVO selectVO(@Param("ew") Wrapper<ZhiyuanzhefuwuEntity> wrapper);
   	
   	List<ZhiyuanzhefuwuView> selectListView(Wrapper<ZhiyuanzhefuwuEntity> wrapper);
   	
   	ZhiyuanzhefuwuView selectView(@Param("ew") Wrapper<ZhiyuanzhefuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanzhefuwuEntity> wrapper);

   	

}

