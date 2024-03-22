package com.entity.vo;

import com.entity.FuwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 服务信息
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
public class FuwuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服务名称
	 */
	
	private String fuwumingcheng;
		
	/**
	 * 服务分类
	 */
	
	private String fuwufenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 服务时长
	 */
	
	private String fuwushizhang;
		
	/**
	 * 时间币
	 */
	
	private Integer shijianbi;
		
	/**
	 * 具体地点
	 */
	
	private String jutididian;
		
	/**
	 * 服务状态
	 */
	
	private String fuwuzhuangtai;
		
	/**
	 * 服务时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fuwushijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 志愿者账号
	 */
	
	private String zhiyuanzhezhanghao;
		
	/**
	 * 志愿者姓名
	 */
	
	private String zhiyuanzhexingming;
				
	
	/**
	 * 设置：服务名称
	 */
	 
	public void setFuwumingcheng(String fuwumingcheng) {
		this.fuwumingcheng = fuwumingcheng;
	}
	
	/**
	 * 获取：服务名称
	 */
	public String getFuwumingcheng() {
		return fuwumingcheng;
	}
				
	
	/**
	 * 设置：服务分类
	 */
	 
	public void setFuwufenlei(String fuwufenlei) {
		this.fuwufenlei = fuwufenlei;
	}
	
	/**
	 * 获取：服务分类
	 */
	public String getFuwufenlei() {
		return fuwufenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：服务时长
	 */
	 
	public void setFuwushizhang(String fuwushizhang) {
		this.fuwushizhang = fuwushizhang;
	}
	
	/**
	 * 获取：服务时长
	 */
	public String getFuwushizhang() {
		return fuwushizhang;
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
	 * 设置：具体地点
	 */
	 
	public void setJutididian(String jutididian) {
		this.jutididian = jutididian;
	}
	
	/**
	 * 获取：具体地点
	 */
	public String getJutididian() {
		return jutididian;
	}
				
	
	/**
	 * 设置：服务状态
	 */
	 
	public void setFuwuzhuangtai(String fuwuzhuangtai) {
		this.fuwuzhuangtai = fuwuzhuangtai;
	}
	
	/**
	 * 获取：服务状态
	 */
	public String getFuwuzhuangtai() {
		return fuwuzhuangtai;
	}
				
	
	/**
	 * 设置：服务时间
	 */
	 
	public void setFuwushijian(Date fuwushijian) {
		this.fuwushijian = fuwushijian;
	}
	
	/**
	 * 获取：服务时间
	 */
	public Date getFuwushijian() {
		return fuwushijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：志愿者账号
	 */
	 
	public void setZhiyuanzhezhanghao(String zhiyuanzhezhanghao) {
		this.zhiyuanzhezhanghao = zhiyuanzhezhanghao;
	}
	
	/**
	 * 获取：志愿者账号
	 */
	public String getZhiyuanzhezhanghao() {
		return zhiyuanzhezhanghao;
	}
				
	
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
			
}
