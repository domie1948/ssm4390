package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LajixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LajixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LajixinxiView;


/**
 * 垃圾信息
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface LajixinxiService extends IService<LajixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LajixinxiVO> selectListVO(Wrapper<LajixinxiEntity> wrapper);
   	
   	LajixinxiVO selectVO(@Param("ew") Wrapper<LajixinxiEntity> wrapper);
   	
   	List<LajixinxiView> selectListView(Wrapper<LajixinxiEntity> wrapper);
   	
   	LajixinxiView selectView(@Param("ew") Wrapper<LajixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LajixinxiEntity> wrapper);
   	
}

