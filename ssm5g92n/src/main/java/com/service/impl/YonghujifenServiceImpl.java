package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghujifenDao;
import com.entity.YonghujifenEntity;
import com.service.YonghujifenService;
import com.entity.vo.YonghujifenVO;
import com.entity.view.YonghujifenView;

@Service("yonghujifenService")
public class YonghujifenServiceImpl extends ServiceImpl<YonghujifenDao, YonghujifenEntity> implements YonghujifenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghujifenEntity> page = this.selectPage(
                new Query<YonghujifenEntity>(params).getPage(),
                new EntityWrapper<YonghujifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghujifenEntity> wrapper) {
		  Page<YonghujifenView> page =new Query<YonghujifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghujifenVO> selectListVO(Wrapper<YonghujifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghujifenVO selectVO(Wrapper<YonghujifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghujifenView> selectListView(Wrapper<YonghujifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghujifenView selectView(Wrapper<YonghujifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
