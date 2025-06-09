package com.entity.model;

import com.entity.LajixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 垃圾信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public class LajixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
