package com.huxiaoyang.mapper;

import java.util.List;
import java.util.Map;

import com.huxiaoyang.beans.Camp;
import com.huxiaoyang.beans.Hero;

public interface HeroMapper {
	//查询
	public List<Hero> queryAll(Map<String, Object> map);
	public List<Camp> queryCamp();
	//新增
	public void addHero(Hero hero);
	//详情
	public Hero queryHeroById(Integer id);
	//goumai 
	public void updateHero(Integer id);
	

}
