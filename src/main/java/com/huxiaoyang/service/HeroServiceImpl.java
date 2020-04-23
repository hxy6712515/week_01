package com.huxiaoyang.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.huxiaoyang.beans.Camp;
import com.huxiaoyang.beans.Hero;
import com.huxiaoyang.mapper.HeroMapper;

@Service
public class HeroServiceImpl implements HeroService {
	
	@Resource
	private HeroMapper hMapper;

	@Override
	public List<Hero> queryAll(Map<String, Object> map) {
		return hMapper.queryAll(map);
	}

	@Override
	public void addHero(Hero hero) {
		hMapper.addHero(hero);
	}

	@Override
	public Hero queryHeroById(Integer id) {
		return hMapper.queryHeroById(id);
	}

	@Override
	public void updateHero(Integer id) {
		hMapper.updateHero(id);
	}

	@Override
	public List<Camp> queryCamp() {
		return hMapper.queryCamp();
	}

}
