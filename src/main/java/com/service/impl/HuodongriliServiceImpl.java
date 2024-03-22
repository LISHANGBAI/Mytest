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


import com.dao.HuodongriliDao;
import com.entity.HuodongriliEntity;
import com.service.HuodongriliService;
import com.entity.vo.HuodongriliVO;
import com.entity.view.HuodongriliView;

@Service("huodongriliService")
public class HuodongriliServiceImpl extends ServiceImpl<HuodongriliDao, HuodongriliEntity> implements HuodongriliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongriliEntity> page = this.selectPage(
                new Query<HuodongriliEntity>(params).getPage(),
                new EntityWrapper<HuodongriliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongriliEntity> wrapper) {
		  Page<HuodongriliView> page =new Query<HuodongriliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<HuodongriliVO> selectListVO(Wrapper<HuodongriliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongriliVO selectVO(Wrapper<HuodongriliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongriliView> selectListView(Wrapper<HuodongriliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongriliView selectView(Wrapper<HuodongriliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
