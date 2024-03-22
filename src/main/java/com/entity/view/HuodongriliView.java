package com.entity.view;

import com.entity.HuodongriliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 活动日历
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
@TableName("huodongrili")
public class HuodongriliView  extends HuodongriliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuodongriliView(){
	}
 
 	public HuodongriliView(HuodongriliEntity huodongriliEntity){
 	try {
			BeanUtils.copyProperties(this, huodongriliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
