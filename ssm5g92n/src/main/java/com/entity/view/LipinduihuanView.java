package com.entity.view;

import com.entity.LipinduihuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 礼品兑换
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
@TableName("lipinduihuan")
public class LipinduihuanView  extends LipinduihuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LipinduihuanView(){
	}
 
 	public LipinduihuanView(LipinduihuanEntity lipinduihuanEntity){
 	try {
			BeanUtils.copyProperties(this, lipinduihuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
