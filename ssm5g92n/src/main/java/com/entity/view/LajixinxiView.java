package com.entity.view;

import com.entity.LajixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 垃圾信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
@TableName("lajixinxi")
public class LajixinxiView  extends LajixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LajixinxiView(){
	}
 
 	public LajixinxiView(LajixinxiEntity lajixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, lajixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
