package com.dao;

import com.entity.DiscusslajixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslajixinxiVO;
import com.entity.view.DiscusslajixinxiView;


/**
 * 垃圾信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface DiscusslajixinxiDao extends BaseMapper<DiscusslajixinxiEntity> {
	
	List<DiscusslajixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusslajixinxiEntity> wrapper);
	
	DiscusslajixinxiVO selectVO(@Param("ew") Wrapper<DiscusslajixinxiEntity> wrapper);
	
	List<DiscusslajixinxiView> selectListView(@Param("ew") Wrapper<DiscusslajixinxiEntity> wrapper);

	List<DiscusslajixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslajixinxiEntity> wrapper);
	
	DiscusslajixinxiView selectView(@Param("ew") Wrapper<DiscusslajixinxiEntity> wrapper);
	
}
