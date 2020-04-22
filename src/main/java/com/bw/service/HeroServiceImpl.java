package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.T_camp;
import com.bw.bean.T_heros;
import com.bw.mapper.HeroMapper;
@Service
public class HeroServiceImpl implements HeroService{

	@Autowired
	HeroMapper hMapper;
	
	@Override
	public List<T_heros> queryAll(Map<String,Object> map) {
		// TODO Auto-generated method stub
		return hMapper.queryAll(map);
	}

	@Override
	public int addHero(T_heros hero) {
		// TODO Auto-generated method stub
		return hMapper.addHero(hero);
	}

	@Override
	public List<T_camp> showc() {
		// TODO Auto-generated method stub
		return hMapper.showc();
	}

	@Override
	public T_heros chaxun(int hid) {
		// TODO Auto-generated method stub
		return hMapper.chaxun(hid);
	}

	@Override
	public int updateHero(T_heros hero) {
		// TODO Auto-generated method stub
		return hMapper.updateHero(hero);
	}

}
