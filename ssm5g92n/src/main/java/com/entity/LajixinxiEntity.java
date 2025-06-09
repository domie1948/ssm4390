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
 * 垃圾信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
@TableName("lajixinxi")
public class LajixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LajixinxiEntity() {
		
	}
	
	public LajixinxiEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 垃圾编号
	 */
					
	private String lajibianhao;
	
	/**
	 * 垃圾名称
	 */
					
	private String lajimingcheng;
	
	/**
	 * 垃圾图片
	 */
					
	private String lajitupian;
	
	/**
	 * 垃圾分类
	 */
					
	private String lajifenlei;
	
	/**
	 * 垃圾简介
	 */
					
	private String lajijianjie;
	
	/**
	 * 危害程度
	 */
					
	private String weihaichengdu;
	
	/**
	 * 垃圾详情
	 */
					
	private String lajixiangqing;
	
	/**
	 * 应对措施
	 */
					
	private String yingduicuoshi;
	
	
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
	 * 设置：垃圾编号
	 */
	public void setLajibianhao(String lajibianhao) {
		this.lajibianhao = lajibianhao;
	}
	/**
	 * 获取：垃圾编号
	 */
	public String getLajibianhao() {
		return lajibianhao;
	}
	/**
	 * 设置：垃圾名称
	 */
	public void setLajimingcheng(String lajimingcheng) {
		this.lajimingcheng = lajimingcheng;
	}
	/**
	 * 获取：垃圾名称
	 */
	public String getLajimingcheng() {
		return lajimingcheng;
	}
	/**
	 * 设置：垃圾图片
	 */
	public void setLajitupian(String lajitupian) {
		this.lajitupian = lajitupian;
	}
	/**
	 * 获取：垃圾图片
	 */
	public String getLajitupian() {
		return lajitupian;
	}
	/**
	 * 设置：垃圾分类
	 */
	public void setLajifenlei(String lajifenlei) {
		this.lajifenlei = lajifenlei;
	}
	/**
	 * 获取：垃圾分类
	 */
	public String getLajifenlei() {
		return lajifenlei;
	}
	/**
	 * 设置：垃圾简介
	 */
	public void setLajijianjie(String lajijianjie) {
		this.lajijianjie = lajijianjie;
	}
	/**
	 * 获取：垃圾简介
	 */
	public String getLajijianjie() {
		return lajijianjie;
	}
	/**
	 * 设置：危害程度
	 */
	public void setWeihaichengdu(String weihaichengdu) {
		this.weihaichengdu = weihaichengdu;
	}
	/**
	 * 获取：危害程度
	 */
	public String getWeihaichengdu() {
		return weihaichengdu;
	}
	/**
	 * 设置：垃圾详情
	 */
	public void setLajixiangqing(String lajixiangqing) {
		this.lajixiangqing = lajixiangqing;
	}
	/**
	 * 获取：垃圾详情
	 */
	public String getLajixiangqing() {
		return lajixiangqing;
	}
	/**
	 * 设置：应对措施
	 */
	public void setYingduicuoshi(String yingduicuoshi) {
		this.yingduicuoshi = yingduicuoshi;
	}
	/**
	 * 获取：应对措施
	 */
	public String getYingduicuoshi() {
		return yingduicuoshi;
	}

}
