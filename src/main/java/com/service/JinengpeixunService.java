package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinengpeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinengpeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinengpeixunView;


/**
 * 技能培训
 *
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface JinengpeixunService extends IService<JinengpeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinengpeixunVO> selectListVO(Wrapper<JinengpeixunEntity> wrapper);
   	
   	JinengpeixunVO selectVO(@Param("ew") Wrapper<JinengpeixunEntity> wrapper);
   	
   	List<JinengpeixunView> selectListView(Wrapper<JinengpeixunEntity> wrapper);
   	
   	JinengpeixunView selectView(@Param("ew") Wrapper<JinengpeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinengpeixunEntity> wrapper);

   	

}

