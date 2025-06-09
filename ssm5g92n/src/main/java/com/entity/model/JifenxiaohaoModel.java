package com.entity.model;

import com.entity.JifenxiaohaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 积分消耗
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public class JifenxiaohaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 兑换编号
	 */
	
	private String duihuanbianhao;
		
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 积分数
	 */
	
	private String jifenshu;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：兑换编号
	 */
	 
	public void setDuihuanbianhao(String duihuanbianhao) {
		this.duihuanbianhao = duihuanbianhao;
	}
	
	/**
	 * 获取：兑换编号
	 */
	public String getDuihuanbianhao() {
		return duihuanbianhao;
	}
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：积分数
	 */
	 
	public void setJifenshu(String jifenshu) {
		this.jifenshu = jifenshu;
	}
	
	/**
	 * 获取：积分数
	 */
	public String getJifenshu() {
		return jifenshu;
	}
			
}
