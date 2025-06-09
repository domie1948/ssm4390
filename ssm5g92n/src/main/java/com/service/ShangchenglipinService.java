package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangchenglipinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangchenglipinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangchenglipinView;


/**
 * 商城礼品
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface ShangchenglipinService extends IService<ShangchenglipinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangchenglipinVO> selectListVO(Wrapper<ShangchenglipinEntity> wrapper);
   	
   	ShangchenglipinVO selectVO(@Param("ew") Wrapper<ShangchenglipinEntity> wrapper);
   	
   	List<ShangchenglipinView> selectListView(Wrapper<ShangchenglipinEntity> wrapper);
   	
   	ShangchenglipinView selectView(@Param("ew") Wrapper<ShangchenglipinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangchenglipinEntity> wrapper);
   	
}

