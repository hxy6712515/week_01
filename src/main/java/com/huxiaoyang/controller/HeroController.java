package com.huxiaoyang.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huxiaoyang.beans.Camp;
import com.huxiaoyang.beans.Hero;
import com.huxiaoyang.service.HeroService;

@Controller
public class HeroController {
	
	@Resource
	private HeroService hService;
	
	@RequestMapping("queryAll")
	public String list(Model model, @RequestParam(defaultValue="1")Integer pageNum, Integer cid, Integer status, Double startPrice, Double endPrice){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("cid", cid);
		map.put("status", status);
		map.put("startPrice", startPrice);
		map.put("endPrice", endPrice);
		
		//分页
		PageHelper.startPage(pageNum, 3);
		List<Hero> list = hService.queryAll(map);
		PageInfo<Hero> page = new PageInfo<>(list);
		model.addAttribute("page",page);
		
		//查询英雄阵营
		List<Camp> clist = hService.queryCamp();
		model.addAttribute("clist", clist);
		
		//区间
		model.addAttribute("map", map);
		
		return "list";
	}
	
	@RequestMapping("queryCamp")
	public List<Camp> queryCamp(){
		//查询所有英雄阵营
		List<Camp> clist = hService.queryCamp();
		return clist;
	}
	
	@RequestMapping("queryHeroById")
	public String queryById(Integer id, Model model){
		Hero hero = hService.queryHeroById(id);
		model.addAttribute("hero", hero);
		return "showOne";
	}
	
	@RequestMapping("updateStatus")
	public boolean updateStatus(Integer id){
		try {
			hService.updateHero(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@RequestMapping("add")
	public String add(Hero hero){
		try {
			//
			hService.addHero(hero);
			return "redirect:queryAll";
		} catch (Exception e) {
			return "add";
		}
	}

}
