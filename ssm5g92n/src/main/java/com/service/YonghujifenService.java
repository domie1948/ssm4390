package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghujifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghujifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghujifenView;


/**
 * 用户积分
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface YonghujifenService extends IService<YonghujifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghujifenVO> selectListVO(Wrapper<YonghujifenEntity> wrapper);
   	
   	YonghujifenVO selectVO(@Param("ew") Wrapper<YonghujifenEntity> wrapper);
   	
   	List<YonghujifenView> selectListView(Wrapper<YonghujifenEntity> wrapper);
   	
   	YonghujifenView selectView(@Param("ew") Wrapper<YonghujifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghujifenEntity> wrapper);
   	
}

