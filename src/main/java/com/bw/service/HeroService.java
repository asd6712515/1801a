package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.T_camp;
import com.bw.bean.T_heros;

public interface HeroService {
	public List<T_heros> queryAll(Map<String,Object> map); //列表 分页
	 public int addHero(T_heros hero);  // 添加
	 public List<T_camp> showc(); //阵营 回显
	 public T_heros chaxun(int hid); // 详情  以及修改回显
	 public int updateHero(T_heros hero); // 修改
}
