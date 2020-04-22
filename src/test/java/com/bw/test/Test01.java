package com.bw.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.bean.T_heros;
import com.bw.service.HeroService;
import com.bw.service.HeroServiceImpl;

public class Test01 {
	@Test
	public void tianjia(){
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroService bean = (HeroService) app.getBean("heroServiceImpl");
		T_heros hero = new T_heros();
		hero.setName("伽罗");
		hero.setPrice(13300);
		hero.getT_camp().setCid(1);
		hero.setStatus(0);
		int addHero = bean.addHero(hero);
		if(addHero>0){
			System.out.println("添加成功");
		}
	}
	@Test
	public void xianhgqing(){
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroService bean = (HeroService) app.getBean("heroServiceImpl");
		int hid = 1;
		T_heros chaxun = bean.chaxun(hid);
		System.out.println(chaxun);
	}
	@Test
	public void xiugai(){
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroService bean = (HeroService) app.getBean("heroServiceImpl");
		T_heros hero = new T_heros();
		hero.setHid(1);
		hero.setName("yase");
		hero.setPrice(13300);
		hero.getT_camp().setCid(1);
		hero.setStatus(0);
		int updateHero = bean.updateHero(hero);
		if(updateHero>0){
			System.out.println("修改成功");
		}
	}
	
}
