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


import com.dao.ShangchenglipinDao;
import com.entity.ShangchenglipinEntity;
import com.service.ShangchenglipinService;
import com.entity.vo.ShangchenglipinVO;
import com.entity.view.ShangchenglipinView;

@Service("shangchenglipinService")
public class ShangchenglipinServiceImpl extends ServiceImpl<ShangchenglipinDao, ShangchenglipinEntity> implements ShangchenglipinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangchenglipinEntity> page = this.selectPage(
                new Query<ShangchenglipinEntity>(params).getPage(),
                new EntityWrapper<ShangchenglipinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangchenglipinEntity> wrapper) {
		  Page<ShangchenglipinView> page =new Query<ShangchenglipinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangchenglipinVO> selectListVO(Wrapper<ShangchenglipinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangchenglipinVO selectVO(Wrapper<ShangchenglipinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangchenglipinView> selectListView(Wrapper<ShangchenglipinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangchenglipinView selectView(Wrapper<ShangchenglipinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
