package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.T_camp;
import com.bw.bean.T_heros;
import com.bw.service.HeroService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Controller
public class HeroController {
	@Autowired
	private HeroService hService;
	@RequestMapping("slist")
	public String show(@RequestParam(defaultValue="1")int pageNum,Model model,
			int cid,int status,double price1,double price2){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("cid", cid);
		map.put("status", status);
		map.put("price1", price1);
		map.put("price2", price2);
		List<T_heros> queryAll = hService.queryAll(map);
		PageHelper.startPage(pageNum, 3);
		PageInfo<T_heros> pageInfo = new PageInfo<>(queryAll);
		model.addAttribute("plist", pageInfo);
		return "list";
	}
	@RequestMapping("sadd")
	public String add(T_heros hero){
		int addHero = hService.addHero(hero);
		if(addHero>0){
			return "cg";
		}
		return "add";
	}
	@RequestMapping("clist")
	@ResponseBody
	public void zhenying(Model model){
		List<T_camp> showc = hService.showc();
		model.addAttribute(showc);
	}
	
	@RequestMapping("xiangqing")
	public String dancha(Model model,int hid){
		 T_heros chaxun = hService.chaxun(hid);
		 model.addAttribute("chaxun",chaxun);
		return "show";
	}
	@RequestMapping("change")
	public String xiugai(T_heros hero){
		int addHero = hService.addHero(hero);
		if(addHero>0){
			return "cg";
		}
		return "xiugai";
	}
}
