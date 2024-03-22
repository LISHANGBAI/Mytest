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


import com.dao.DiscusszhiyuanzhefuwuDao;
import com.entity.DiscusszhiyuanzhefuwuEntity;
import com.service.DiscusszhiyuanzhefuwuService;
import com.entity.vo.DiscusszhiyuanzhefuwuVO;
import com.entity.view.DiscusszhiyuanzhefuwuView;

@Service("discusszhiyuanzhefuwuService")
public class DiscusszhiyuanzhefuwuServiceImpl extends ServiceImpl<DiscusszhiyuanzhefuwuDao, DiscusszhiyuanzhefuwuEntity> implements DiscusszhiyuanzhefuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhiyuanzhefuwuEntity> page = this.selectPage(
                new Query<DiscusszhiyuanzhefuwuEntity>(params).getPage(),
                new EntityWrapper<DiscusszhiyuanzhefuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper) {
		  Page<DiscusszhiyuanzhefuwuView> page =new Query<DiscusszhiyuanzhefuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusszhiyuanzhefuwuVO> selectListVO(Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhiyuanzhefuwuVO selectVO(Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhiyuanzhefuwuView> selectListView(Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhiyuanzhefuwuView selectView(Wrapper<DiscusszhiyuanzhefuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
