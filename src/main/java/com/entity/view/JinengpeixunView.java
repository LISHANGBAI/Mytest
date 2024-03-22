package com.entity.view;

import com.entity.JinengpeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 技能培训
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
@TableName("jinengpeixun")
public class JinengpeixunView  extends JinengpeixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinengpeixunView(){
	}
 
 	public JinengpeixunView(JinengpeixunEntity jinengpeixunEntity){
 	try {
			BeanUtils.copyProperties(this, jinengpeixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
