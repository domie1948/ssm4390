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


import com.dao.LajixinxiDao;
import com.entity.LajixinxiEntity;
import com.service.LajixinxiService;
import com.entity.vo.LajixinxiVO;
import com.entity.view.LajixinxiView;

@Service("lajixinxiService")
public class LajixinxiServiceImpl extends ServiceImpl<LajixinxiDao, LajixinxiEntity> implements LajixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LajixinxiEntity> page = this.selectPage(
                new Query<LajixinxiEntity>(params).getPage(),
                new EntityWrapper<LajixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LajixinxiEntity> wrapper) {
		  Page<LajixinxiView> page =new Query<LajixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LajixinxiVO> selectListVO(Wrapper<LajixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LajixinxiVO selectVO(Wrapper<LajixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LajixinxiView> selectListView(Wrapper<LajixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LajixinxiView selectView(Wrapper<LajixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
