package com.entity.view;

import com.entity.FuwupingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 服务评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
@TableName("fuwupingjia")
public class FuwupingjiaView  extends FuwupingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwupingjiaView(){
	}
 
 	public FuwupingjiaView(FuwupingjiaEntity fuwupingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, fuwupingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
