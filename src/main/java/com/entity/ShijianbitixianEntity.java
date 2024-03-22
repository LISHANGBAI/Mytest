package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 时间币提现
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-05 10:24:07
 */
@TableName("shijianbitixian")
public class ShijianbitixianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShijianbitixianEntity() {
		
	}
	
	public ShijianbitixianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 提现编号
	 */
					
	private String tixianbianhao;
	
	/**
	 * 服务名称
	 */
					
	private String fuwumingcheng;
	
	/**
	 * 服务分类
	 */
					
	private String fuwufenlei;
	
	/**
	 * 服务照片
	 */
					
	private String fuwuzhaopian;
	
	/**
	 * 服务时长
	 */
					
	private String fuwushizhang;
	
	/**
	 * 时间币
	 */
					
	private Double shijianbi;
	
	/**
	 * 具体地点
	 */
					
	private String jutididian;
	
	/**
	 * 提取时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tiqushijian;
	
	/**
	 * 志愿者账号
	 */
					
	private String zhiyuanzhezhanghao;
	
	/**
	 * 志愿者姓名
	 */
					
	private String zhiyuanzhexingming;
	
	/**
	 * 时间币
	 */
					
	private Double yonghushijianbi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：提现编号
	 */
	public void setTixianbianhao(String tixianbianhao) {
		this.tixianbianhao = tixianbianhao;
	}
	/**
	 * 获取：提现编号
	 */
	public String getTixianbianhao() {
		return tixianbianhao;
	}
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
	 * 设置：服务照片
	 */
	public void setFuwuzhaopian(String fuwuzhaopian) {
		this.fuwuzhaopian = fuwuzhaopian;
	}
	/**
	 * 获取：服务照片
	 */
	public String getFuwuzhaopian() {
		return fuwuzhaopian;
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
	public void setShijianbi(Double shijianbi) {
		this.shijianbi = shijianbi;
	}
	/**
	 * 获取：时间币
	 */
	public Double getShijianbi() {
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
	 * 设置：提取时间
	 */
	public void setTiqushijian(Date tiqushijian) {
		this.tiqushijian = tiqushijian;
	}
	/**
	 * 获取：提取时间
	 */
	public Date getTiqushijian() {
		return tiqushijian;
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
	/**
	 * 设置：时间币
	 */
	public void setYonghushijianbi(Double yonghushijianbi) {
		this.yonghushijianbi = yonghushijianbi;
	}
	/**
	 * 获取：时间币
	 */
	public Double getYonghushijianbi() {
		return yonghushijianbi;
	}

}
