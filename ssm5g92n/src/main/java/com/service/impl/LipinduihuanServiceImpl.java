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


import com.dao.LipinduihuanDao;
import com.entity.LipinduihuanEntity;
import com.service.LipinduihuanService;
import com.entity.vo.LipinduihuanVO;
import com.entity.view.LipinduihuanView;

@Service("lipinduihuanService")
public class LipinduihuanServiceImpl extends ServiceImpl<LipinduihuanDao, LipinduihuanEntity> implements LipinduihuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LipinduihuanEntity> page = this.selectPage(
                new Query<LipinduihuanEntity>(params).getPage(),
                new EntityWrapper<LipinduihuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LipinduihuanEntity> wrapper) {
		  Page<LipinduihuanView> page =new Query<LipinduihuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LipinduihuanVO> selectListVO(Wrapper<LipinduihuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LipinduihuanVO selectVO(Wrapper<LipinduihuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LipinduihuanView> selectListView(Wrapper<LipinduihuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LipinduihuanView selectView(Wrapper<LipinduihuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
