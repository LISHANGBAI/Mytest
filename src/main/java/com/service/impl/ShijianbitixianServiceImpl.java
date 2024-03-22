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


import com.dao.ShijianbitixianDao;
import com.entity.ShijianbitixianEntity;
import com.service.ShijianbitixianService;
import com.entity.vo.ShijianbitixianVO;
import com.entity.view.ShijianbitixianView;

@Service("shijianbitixianService")
public class ShijianbitixianServiceImpl extends ServiceImpl<ShijianbitixianDao, ShijianbitixianEntity> implements ShijianbitixianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShijianbitixianEntity> page = this.selectPage(
                new Query<ShijianbitixianEntity>(params).getPage(),
                new EntityWrapper<ShijianbitixianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShijianbitixianEntity> wrapper) {
		  Page<ShijianbitixianView> page =new Query<ShijianbitixianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShijianbitixianVO> selectListVO(Wrapper<ShijianbitixianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShijianbitixianVO selectVO(Wrapper<ShijianbitixianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShijianbitixianView> selectListView(Wrapper<ShijianbitixianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShijianbitixianView selectView(Wrapper<ShijianbitixianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
