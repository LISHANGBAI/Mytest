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

import com.entity.FuwuwanchengEntity;
import com.entity.view.FuwuwanchengView;

import com.service.FuwuwanchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 服务完成
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
@RestController
@RequestMapping("/fuwuwancheng")
public class FuwuwanchengController {
    @Autowired
    private FuwuwanchengService fuwuwanchengService;




    



    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FuwuwanchengEntity fuwuwancheng,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			fuwuwancheng.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhiyuanzhe")) {
			fuwuwancheng.setZhiyuanzhezhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FuwuwanchengEntity> ew = new EntityWrapper<FuwuwanchengEntity>();

		PageUtils page = fuwuwanchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuwancheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FuwuwanchengEntity fuwuwancheng, 
		HttpServletRequest request){
        EntityWrapper<FuwuwanchengEntity> ew = new EntityWrapper<FuwuwanchengEntity>();

		PageUtils page = fuwuwanchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fuwuwancheng), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FuwuwanchengEntity fuwuwancheng){
       	EntityWrapper<FuwuwanchengEntity> ew = new EntityWrapper<FuwuwanchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fuwuwancheng, "fuwuwancheng")); 
        return R.ok().put("data", fuwuwanchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FuwuwanchengEntity fuwuwancheng){
        EntityWrapper< FuwuwanchengEntity> ew = new EntityWrapper< FuwuwanchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fuwuwancheng, "fuwuwancheng")); 
		FuwuwanchengView fuwuwanchengView =  fuwuwanchengService.selectView(ew);
		return R.ok("查询服务完成成功").put("data", fuwuwanchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FuwuwanchengEntity fuwuwancheng = fuwuwanchengService.selectById(id);
        return R.ok().put("data", fuwuwancheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FuwuwanchengEntity fuwuwancheng = fuwuwanchengService.selectById(id);
        return R.ok().put("data", fuwuwancheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FuwuwanchengEntity fuwuwancheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fuwuwancheng);
        fuwuwanchengService.insert(fuwuwancheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FuwuwanchengEntity fuwuwancheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(fuwuwancheng);
        fuwuwanchengService.insert(fuwuwancheng);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FuwuwanchengEntity fuwuwancheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fuwuwancheng);
        fuwuwanchengService.updateById(fuwuwancheng);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<FuwuwanchengEntity> list = new ArrayList<FuwuwanchengEntity>();
        for(Long id : ids) {
            FuwuwanchengEntity fuwuwancheng = fuwuwanchengService.selectById(id);
            fuwuwancheng.setSfsh(sfsh);
            fuwuwancheng.setShhf(shhf);
            list.add(fuwuwancheng);
        }
        fuwuwanchengService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fuwuwanchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
