package com.entity.model;

import com.entity.ZhiyuanzheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 志愿者
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public class ZhiyuanzheModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 志愿者姓名
	 */
	
	private String zhiyuanzhexingming;
		
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 证件照
	 */
	
	private String zhengjianzhao;
		
	/**
	 * 电话号码
	 */
	
	private String dianhuahaoma;
		
	/**
	 * 时间币
	 */
	
	private Integer shijianbi;
		
	/**
	 * 服务等级
	 */
	
	private String fuwudengji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：志愿者姓名
	 */
	 
	public void setZhiyuanzhexingming(String zhiyuanzhexingming) {
		this.zhiyuanzhexingming = zhiyuanzhexingming;
	}
	
	/**
	 * 获取：志愿者姓名
	 */
	public String getZhiyuanzhexingming() {
		return zhiyuanzhexingming;
	}
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
				
	
	/**
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：证件照
	 */
	 
	public void setZhengjianzhao(String zhengjianzhao) {
		this.zhengjianzhao = zhengjianzhao;
	}
	
	/**
	 * 获取：证件照
	 */
	public String getZhengjianzhao() {
		return zhengjianzhao;
	}
				
	
	/**
	 * 设置：电话号码
	 */
	 
	public void setDianhuahaoma(String dianhuahaoma) {
		this.dianhuahaoma = dianhuahaoma;
	}
	
	/**
	 * 获取：电话号码
	 */
	public String getDianhuahaoma() {
		return dianhuahaoma;
	}
				
	
	/**
	 * 设置：时间币
	 */
	 
	public void setShijianbi(Integer shijianbi) {
		this.shijianbi = shijianbi;
	}
	
	/**
	 * 获取：时间币
	 */
	public Integer getShijianbi() {
		return shijianbi;
	}
				
	
	/**
	 * 设置：服务等级
	 */
	 
	public void setFuwudengji(String fuwudengji) {
		this.fuwudengji = fuwudengji;
	}
	
	/**
	 * 获取：服务等级
	 */
	public String getFuwudengji() {
		return fuwudengji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
