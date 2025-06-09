package com.dao;

import com.entity.JifenxiaohaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JifenxiaohaoVO;
import com.entity.view.JifenxiaohaoView;


/**
 * 积分消耗
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface JifenxiaohaoDao extends BaseMapper<JifenxiaohaoEntity> {
	
	List<JifenxiaohaoVO> selectListVO(@Param("ew") Wrapper<JifenxiaohaoEntity> wrapper);
	
	JifenxiaohaoVO selectVO(@Param("ew") Wrapper<JifenxiaohaoEntity> wrapper);
	
	List<JifenxiaohaoView> selectListView(@Param("ew") Wrapper<JifenxiaohaoEntity> wrapper);

	List<JifenxiaohaoView> selectListView(Pagination page,@Param("ew") Wrapper<JifenxiaohaoEntity> wrapper);
	
	JifenxiaohaoView selectView(@Param("ew") Wrapper<JifenxiaohaoEntity> wrapper);
	
}
