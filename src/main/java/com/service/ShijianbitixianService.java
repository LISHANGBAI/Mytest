package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShijianbitixianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShijianbitixianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShijianbitixianView;


/**
 * 时间币提现
 *
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public interface ShijianbitixianService extends IService<ShijianbitixianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShijianbitixianVO> selectListVO(Wrapper<ShijianbitixianEntity> wrapper);
   	
   	ShijianbitixianVO selectVO(@Param("ew") Wrapper<ShijianbitixianEntity> wrapper);
   	
   	List<ShijianbitixianView> selectListView(Wrapper<ShijianbitixianEntity> wrapper);
   	
   	ShijianbitixianView selectView(@Param("ew") Wrapper<ShijianbitixianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShijianbitixianEntity> wrapper);

   	

}

