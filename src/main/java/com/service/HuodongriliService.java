package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongriliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongriliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongriliView;


/**
 * 活动日历
 *
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface HuodongriliService extends IService<HuodongriliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongriliVO> selectListVO(Wrapper<HuodongriliEntity> wrapper);
   	
   	HuodongriliVO selectVO(@Param("ew") Wrapper<HuodongriliEntity> wrapper);
   	
   	List<HuodongriliView> selectListView(Wrapper<HuodongriliEntity> wrapper);
   	
   	HuodongriliView selectView(@Param("ew") Wrapper<HuodongriliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongriliEntity> wrapper);

   	

}

