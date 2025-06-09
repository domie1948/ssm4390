package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LipinduihuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LipinduihuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LipinduihuanView;


/**
 * 礼品兑换
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface LipinduihuanService extends IService<LipinduihuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LipinduihuanVO> selectListVO(Wrapper<LipinduihuanEntity> wrapper);
   	
   	LipinduihuanVO selectVO(@Param("ew") Wrapper<LipinduihuanEntity> wrapper);
   	
   	List<LipinduihuanView> selectListView(Wrapper<LipinduihuanEntity> wrapper);
   	
   	LipinduihuanView selectView(@Param("ew") Wrapper<LipinduihuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LipinduihuanEntity> wrapper);
   	
}

