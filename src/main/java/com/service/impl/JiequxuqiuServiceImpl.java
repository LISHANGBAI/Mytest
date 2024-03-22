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


import com.dao.JiequxuqiuDao;
import com.entity.JiequxuqiuEntity;
import com.service.JiequxuqiuService;
import com.entity.vo.JiequxuqiuVO;
import com.entity.view.JiequxuqiuView;

@Service("jiequxuqiuService")
public class JiequxuqiuServiceImpl extends ServiceImpl<JiequxuqiuDao, JiequxuqiuEntity> implements JiequxuqiuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiequxuqiuEntity> page = this.selectPage(
                new Query<JiequxuqiuEntity>(params).getPage(),
                new EntityWrapper<JiequxuqiuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiequxuqiuEntity> wrapper) {
		  Page<JiequxuqiuView> page =new Query<JiequxuqiuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<JiequxuqiuVO> selectListVO(Wrapper<JiequxuqiuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiequxuqiuVO selectVO(Wrapper<JiequxuqiuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiequxuqiuView> selectListView(Wrapper<JiequxuqiuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiequxuqiuView selectView(Wrapper<JiequxuqiuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
