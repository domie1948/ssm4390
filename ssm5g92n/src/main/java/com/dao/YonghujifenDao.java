package com.dao;

import com.entity.YonghujifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghujifenVO;
import com.entity.view.YonghujifenView;


/**
 * 用户积分
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface YonghujifenDao extends BaseMapper<YonghujifenEntity> {
	
	List<YonghujifenVO> selectListVO(@Param("ew") Wrapper<YonghujifenEntity> wrapper);
	
	YonghujifenVO selectVO(@Param("ew") Wrapper<YonghujifenEntity> wrapper);
	
	List<YonghujifenView> selectListView(@Param("ew") Wrapper<YonghujifenEntity> wrapper);

	List<YonghujifenView> selectListView(Pagination page,@Param("ew") Wrapper<YonghujifenEntity> wrapper);
	
	YonghujifenView selectView(@Param("ew") Wrapper<YonghujifenEntity> wrapper);
	
}
