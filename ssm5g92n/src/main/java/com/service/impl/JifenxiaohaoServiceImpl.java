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


import com.dao.JifenxiaohaoDao;
import com.entity.JifenxiaohaoEntity;
import com.service.JifenxiaohaoService;
import com.entity.vo.JifenxiaohaoVO;
import com.entity.view.JifenxiaohaoView;

@Service("jifenxiaohaoService")
public class JifenxiaohaoServiceImpl extends ServiceImpl<JifenxiaohaoDao, JifenxiaohaoEntity> implements JifenxiaohaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JifenxiaohaoEntity> page = this.selectPage(
                new Query<JifenxiaohaoEntity>(params).getPage(),
                new EntityWrapper<JifenxiaohaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JifenxiaohaoEntity> wrapper) {
		  Page<JifenxiaohaoView> page =new Query<JifenxiaohaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JifenxiaohaoVO> selectListVO(Wrapper<JifenxiaohaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JifenxiaohaoVO selectVO(Wrapper<JifenxiaohaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JifenxiaohaoView> selectListView(Wrapper<JifenxiaohaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JifenxiaohaoView selectView(Wrapper<JifenxiaohaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
