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


import com.dao.JifenzengjiaDao;
import com.entity.JifenzengjiaEntity;
import com.service.JifenzengjiaService;
import com.entity.vo.JifenzengjiaVO;
import com.entity.view.JifenzengjiaView;

@Service("jifenzengjiaService")
public class JifenzengjiaServiceImpl extends ServiceImpl<JifenzengjiaDao, JifenzengjiaEntity> implements JifenzengjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JifenzengjiaEntity> page = this.selectPage(
                new Query<JifenzengjiaEntity>(params).getPage(),
                new EntityWrapper<JifenzengjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JifenzengjiaEntity> wrapper) {
		  Page<JifenzengjiaView> page =new Query<JifenzengjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JifenzengjiaVO> selectListVO(Wrapper<JifenzengjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JifenzengjiaVO selectVO(Wrapper<JifenzengjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JifenzengjiaView> selectListView(Wrapper<JifenzengjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JifenzengjiaView selectView(Wrapper<JifenzengjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
