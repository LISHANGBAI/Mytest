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

import com.entity.HuodongriliEntity;
import com.entity.view.HuodongriliView;

import com.service.HuodongriliService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 活动日历
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
@RestController
@RequestMapping("/huodongrili")
public class HuodongriliController {
    @Autowired
    private HuodongriliService huodongriliService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HuodongriliEntity huodongrili,
		HttpServletRequest request){
        EntityWrapper<HuodongriliEntity> ew = new EntityWrapper<HuodongriliEntity>();

		PageUtils page = huodongriliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongrili), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HuodongriliEntity huodongrili, 
		HttpServletRequest request){
        EntityWrapper<HuodongriliEntity> ew = new EntityWrapper<HuodongriliEntity>();

		PageUtils page = huodongriliService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, huodongrili), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HuodongriliEntity huodongrili){
       	EntityWrapper<HuodongriliEntity> ew = new EntityWrapper<HuodongriliEntity>();
      	ew.allEq(MPUtil.allEQMapPre( huodongrili, "huodongrili")); 
        return R.ok().put("data", huodongriliService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HuodongriliEntity huodongrili){
        EntityWrapper< HuodongriliEntity> ew = new EntityWrapper< HuodongriliEntity>();
 		ew.allEq(MPUtil.allEQMapPre( huodongrili, "huodongrili")); 
		HuodongriliView huodongriliView =  huodongriliService.selectView(ew);
		return R.ok("查询活动日历成功").put("data", huodongriliView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HuodongriliEntity huodongrili = huodongriliService.selectById(id);
        return R.ok().put("data", huodongrili);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HuodongriliEntity huodongrili = huodongriliService.selectById(id);
        return R.ok().put("data", huodongrili);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HuodongriliEntity huodongrili, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huodongrili);
        huodongriliService.insert(huodongrili);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HuodongriliEntity huodongrili, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(huodongrili);
        huodongriliService.insert(huodongrili);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody HuodongriliEntity huodongrili, HttpServletRequest request){
        //ValidatorUtils.validateEntity(huodongrili);
        huodongriliService.updateById(huodongrili);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        huodongriliService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
