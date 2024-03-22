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


import com.dao.ZhiyuanzhefuwuDao;
import com.entity.ZhiyuanzhefuwuEntity;
import com.service.ZhiyuanzhefuwuService;
import com.entity.vo.ZhiyuanzhefuwuVO;
import com.entity.view.ZhiyuanzhefuwuView;

@Service("zhiyuanzhefuwuService")
public class ZhiyuanzhefuwuServiceImpl extends ServiceImpl<ZhiyuanzhefuwuDao, ZhiyuanzhefuwuEntity> implements ZhiyuanzhefuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanzhefuwuEntity> page = this.selectPage(
                new Query<ZhiyuanzhefuwuEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanzhefuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanzhefuwuEntity> wrapper) {
		  Page<ZhiyuanzhefuwuView> page =new Query<ZhiyuanzhefuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ZhiyuanzhefuwuVO> selectListVO(Wrapper<ZhiyuanzhefuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanzhefuwuVO selectVO(Wrapper<ZhiyuanzhefuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanzhefuwuView> selectListView(Wrapper<ZhiyuanzhefuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanzhefuwuView selectView(Wrapper<ZhiyuanzhefuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
