package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JifenzengjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JifenzengjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JifenzengjiaView;


/**
 * 积分增加
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface JifenzengjiaService extends IService<JifenzengjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JifenzengjiaVO> selectListVO(Wrapper<JifenzengjiaEntity> wrapper);
   	
   	JifenzengjiaVO selectVO(@Param("ew") Wrapper<JifenzengjiaEntity> wrapper);
   	
   	List<JifenzengjiaView> selectListView(Wrapper<JifenzengjiaEntity> wrapper);
   	
   	JifenzengjiaView selectView(@Param("ew") Wrapper<JifenzengjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JifenzengjiaEntity> wrapper);
   	
}

