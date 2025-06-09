package com.dao;

import com.entity.LipinduihuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LipinduihuanVO;
import com.entity.view.LipinduihuanView;


/**
 * 礼品兑换
 * 
 * @author 
 * @email 
 * @date 2021-03-19 09:32:29
 */
public interface LipinduihuanDao extends BaseMapper<LipinduihuanEntity> {
	
	List<LipinduihuanVO> selectListVO(@Param("ew") Wrapper<LipinduihuanEntity> wrapper);
	
	LipinduihuanVO selectVO(@Param("ew") Wrapper<LipinduihuanEntity> wrapper);
	
	List<LipinduihuanView> selectListView(@Param("ew") Wrapper<LipinduihuanEntity> wrapper);

	List<LipinduihuanView> selectListView(Pagination page,@Param("ew") Wrapper<LipinduihuanEntity> wrapper);
	
	LipinduihuanView selectView(@Param("ew") Wrapper<LipinduihuanEntity> wrapper);
	
}
