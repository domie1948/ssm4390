package com.entity.view;

import com.entity.JifenxiaohaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 积分消耗
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
@TableName("jifenxiaohao")
public class JifenxiaohaoView  extends JifenxiaohaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JifenxiaohaoView(){
	}
 
 	public JifenxiaohaoView(JifenxiaohaoEntity jifenxiaohaoEntity){
 	try {
			BeanUtils.copyProperties(this, jifenxiaohaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
