package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShijianbitixianEntity;
import com.entity.view.ShijianbitixianView;

import com.service.ShijianbitixianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 时间币提现
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
@RestController
@RequestMapping("/shijianbitixian")
public class ShijianbitixianController {
    @Autowired
    private ShijianbitixianService shijianbitixianService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShijianbitixianEntity shijianbitixian,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zhiyuanzhe")) {
			shijianbitixian.setZhiyuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShijianbitixianEntity> ew = new EntityWrapper<ShijianbitixianEntity>();

		PageUtils page = shijianbitixianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shijianbitixian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShijianbitixianEntity shijianbitixian, 
		HttpServletRequest request){
        EntityWrapper<ShijianbitixianEntity> ew = new EntityWrapper<ShijianbitixianEntity>();

		PageUtils page = shijianbitixianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shijianbitixian), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShijianbitixianEntity shijianbitixian){
       	EntityWrapper<ShijianbitixianEntity> ew = new EntityWrapper<ShijianbitixianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shijianbitixian, "shijianbitixian")); 
        return R.ok().put("data", shijianbitixianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShijianbitixianEntity shijianbitixian){
        EntityWrapper< ShijianbitixianEntity> ew = new EntityWrapper< ShijianbitixianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shijianbitixian, "shijianbitixian")); 
		ShijianbitixianView shijianbitixianView =  shijianbitixianService.selectView(ew);
		return R.ok("查询时间币提现成功").put("data", shijianbitixianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShijianbitixianEntity shijianbitixian = shijianbitixianService.selectById(id);
        return R.ok().put("data", shijianbitixian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShijianbitixianEntity shijianbitixian = shijianbitixianService.selectById(id);
        return R.ok().put("data", shijianbitixian);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShijianbitixianEntity shijianbitixian, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shijianbitixian);
        shijianbitixianService.insert(shijianbitixian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShijianbitixianEntity shijianbitixian, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(shijianbitixian);
        shijianbitixianService.insert(shijianbitixian);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShijianbitixianEntity shijianbitixian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shijianbitixian);
        shijianbitixianService.updateById(shijianbitixian);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shijianbitixianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
