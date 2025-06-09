package com.dao;

import com.entity.ShangchenglipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangchenglipinVO;
import com.entity.view.ShangchenglipinView;


/**
 * 商城礼品
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface ShangchenglipinDao extends BaseMapper<ShangchenglipinEntity> {
	
	List<ShangchenglipinVO> selectListVO(@Param("ew") Wrapper<ShangchenglipinEntity> wrapper);
	
	ShangchenglipinVO selectVO(@Param("ew") Wrapper<ShangchenglipinEntity> wrapper);
	
	List<ShangchenglipinView> selectListView(@Param("ew") Wrapper<ShangchenglipinEntity> wrapper);

	List<ShangchenglipinView> selectListView(Pagination page,@Param("ew") Wrapper<ShangchenglipinEntity> wrapper);
	
	ShangchenglipinView selectView(@Param("ew") Wrapper<ShangchenglipinEntity> wrapper);
	
}
