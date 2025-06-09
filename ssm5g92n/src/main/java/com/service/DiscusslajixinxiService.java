package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslajixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslajixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslajixinxiView;


/**
 * 垃圾信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface DiscusslajixinxiService extends IService<DiscusslajixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslajixinxiVO> selectListVO(Wrapper<DiscusslajixinxiEntity> wrapper);
   	
   	DiscusslajixinxiVO selectVO(@Param("ew") Wrapper<DiscusslajixinxiEntity> wrapper);
   	
   	List<DiscusslajixinxiView> selectListView(Wrapper<DiscusslajixinxiEntity> wrapper);
   	
   	DiscusslajixinxiView selectView(@Param("ew") Wrapper<DiscusslajixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslajixinxiEntity> wrapper);
   	
}

