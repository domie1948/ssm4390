package com.dao;

import com.entity.JifenzengjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JifenzengjiaVO;
import com.entity.view.JifenzengjiaView;


/**
 * 积分增加
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface JifenzengjiaDao extends BaseMapper<JifenzengjiaEntity> {
	
	List<JifenzengjiaVO> selectListVO(@Param("ew") Wrapper<JifenzengjiaEntity> wrapper);
	
	JifenzengjiaVO selectVO(@Param("ew") Wrapper<JifenzengjiaEntity> wrapper);
	
	List<JifenzengjiaView> selectListView(@Param("ew") Wrapper<JifenzengjiaEntity> wrapper);

	List<JifenzengjiaView> selectListView(Pagination page,@Param("ew") Wrapper<JifenzengjiaEntity> wrapper);
	
	JifenzengjiaView selectView(@Param("ew") Wrapper<JifenzengjiaEntity> wrapper);
	
}
