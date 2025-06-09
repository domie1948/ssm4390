package com.dao;

import com.entity.LajixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LajixinxiVO;
import com.entity.view.LajixinxiView;


/**
 * 垃圾信息
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface LajixinxiDao extends BaseMapper<LajixinxiEntity> {
	
	List<LajixinxiVO> selectListVO(@Param("ew") Wrapper<LajixinxiEntity> wrapper);
	
	LajixinxiVO selectVO(@Param("ew") Wrapper<LajixinxiEntity> wrapper);
	
	List<LajixinxiView> selectListView(@Param("ew") Wrapper<LajixinxiEntity> wrapper);

	List<LajixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LajixinxiEntity> wrapper);
	
	LajixinxiView selectView(@Param("ew") Wrapper<LajixinxiEntity> wrapper);
	
}
