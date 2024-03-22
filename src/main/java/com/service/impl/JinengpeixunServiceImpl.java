package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JinengpeixunDao;
import com.entity.JinengpeixunEntity;
import com.service.JinengpeixunService;
import com.entity.vo.JinengpeixunVO;
import com.entity.view.JinengpeixunView;

@Service("jinengpeixunService")
public class JinengpeixunServiceImpl extends ServiceImpl<JinengpeixunDao, JinengpeixunEntity> implements JinengpeixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinengpeixunEntity> page = this.selectPage(
                new Query<JinengpeixunEntity>(params).getPage(),
                new EntityWrapper<JinengpeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinengpeixunEntity> wrapper) {
		  Page<JinengpeixunView> page =new Query<JinengpeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JinengpeixunVO> selectListVO(Wrapper<JinengpeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinengpeixunVO selectVO(Wrapper<JinengpeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinengpeixunView> selectListView(Wrapper<JinengpeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinengpeixunView selectView(Wrapper<JinengpeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
