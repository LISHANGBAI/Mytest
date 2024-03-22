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


import com.dao.FuwuwanchengDao;
import com.entity.FuwuwanchengEntity;
import com.service.FuwuwanchengService;
import com.entity.vo.FuwuwanchengVO;
import com.entity.view.FuwuwanchengView;

@Service("fuwuwanchengService")
public class FuwuwanchengServiceImpl extends ServiceImpl<FuwuwanchengDao, FuwuwanchengEntity> implements FuwuwanchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuwanchengEntity> page = this.selectPage(
                new Query<FuwuwanchengEntity>(params).getPage(),
                new EntityWrapper<FuwuwanchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuwanchengEntity> wrapper) {
		  Page<FuwuwanchengView> page =new Query<FuwuwanchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FuwuwanchengVO> selectListVO(Wrapper<FuwuwanchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwuwanchengVO selectVO(Wrapper<FuwuwanchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwuwanchengView> selectListView(Wrapper<FuwuwanchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuwanchengView selectView(Wrapper<FuwuwanchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
