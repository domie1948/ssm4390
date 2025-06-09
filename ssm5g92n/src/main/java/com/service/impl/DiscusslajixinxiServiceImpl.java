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


import com.dao.DiscusslajixinxiDao;
import com.entity.DiscusslajixinxiEntity;
import com.service.DiscusslajixinxiService;
import com.entity.vo.DiscusslajixinxiVO;
import com.entity.view.DiscusslajixinxiView;

@Service("discusslajixinxiService")
public class DiscusslajixinxiServiceImpl extends ServiceImpl<DiscusslajixinxiDao, DiscusslajixinxiEntity> implements DiscusslajixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslajixinxiEntity> page = this.selectPage(
                new Query<DiscusslajixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusslajixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslajixinxiEntity> wrapper) {
		  Page<DiscusslajixinxiView> page =new Query<DiscusslajixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslajixinxiVO> selectListVO(Wrapper<DiscusslajixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslajixinxiVO selectVO(Wrapper<DiscusslajixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslajixinxiView> selectListView(Wrapper<DiscusslajixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslajixinxiView selectView(Wrapper<DiscusslajixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
