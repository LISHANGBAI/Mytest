package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiequxuqiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiequxuqiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiequxuqiuView;


/**
 * 接取需求
 *
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface JiequxuqiuService extends IService<JiequxuqiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiequxuqiuVO> selectListVO(Wrapper<JiequxuqiuEntity> wrapper);
   	
   	JiequxuqiuVO selectVO(@Param("ew") Wrapper<JiequxuqiuEntity> wrapper);
   	
   	List<JiequxuqiuView> selectListView(Wrapper<JiequxuqiuEntity> wrapper);
   	
   	JiequxuqiuView selectView(@Param("ew") Wrapper<JiequxuqiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiequxuqiuEntity> wrapper);

   	

}

