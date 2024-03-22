package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuwanchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuwanchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuwanchengView;


/**
 * 服务完成
 *
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface FuwuwanchengService extends IService<FuwuwanchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuwanchengVO> selectListVO(Wrapper<FuwuwanchengEntity> wrapper);
   	
   	FuwuwanchengVO selectVO(@Param("ew") Wrapper<FuwuwanchengEntity> wrapper);
   	
   	List<FuwuwanchengView> selectListView(Wrapper<FuwuwanchengEntity> wrapper);
   	
   	FuwuwanchengView selectView(@Param("ew") Wrapper<FuwuwanchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuwanchengEntity> wrapper);

   	

}

