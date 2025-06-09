package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JifenxiaohaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JifenxiaohaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JifenxiaohaoView;


/**
 * 积分消耗
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface JifenxiaohaoService extends IService<JifenxiaohaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JifenxiaohaoVO> selectListVO(Wrapper<JifenxiaohaoEntity> wrapper);
   	
   	JifenxiaohaoVO selectVO(@Param("ew") Wrapper<JifenxiaohaoEntity> wrapper);
   	
   	List<JifenxiaohaoView> selectListView(Wrapper<JifenxiaohaoEntity> wrapper);
   	
   	JifenxiaohaoView selectView(@Param("ew") Wrapper<JifenxiaohaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JifenxiaohaoEntity> wrapper);
   	
}

