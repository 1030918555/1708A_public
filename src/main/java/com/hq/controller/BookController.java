package com.hq.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hq.service.BookService;

@Controller
public class BookController {
	@Resource
	private BookService  bookService;
	@RequestMapping("list.do")
	public String list(Model model,@RequestParam(value="cpage",defaultValue="1")Integer cpage,
			String mohu1,@RequestParam(defaultValue="1")Integer num) {
		
		System.out.println(num);
		
		Map map=new HashMap();
		map.put("mohu1", mohu1);
		map.put("num", num);
		PageHelper.startPage(cpage,3);
		List list=bookService.list(map);
		
		PageInfo pi=new PageInfo(list);
		model.addAttribute("list", list);
		model.addAttribute("pi", pi);
		model.addAttribute("map", map); 
		model.addAttribute("num", ++num); 
		return "list";
	}
}
