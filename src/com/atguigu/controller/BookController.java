package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	
	@RequestMapping(value = "/tosuccess")
	 public String toSuccess() {
	  return "success";
	 }
	
	/**
	 * 删除图书
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/book/{bid}",method=RequestMethod.DELETE)
	public String deletebook(@PathVariable("bid")Integer id) {
		System.out.println("删除了"+ id + "号图书");
		return "redirect:/tosuccess";
	}
	
	/**
	 * 修改图书
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/book/{bid}",method=RequestMethod.PUT)
	public String updatebook(@PathVariable("bid")Integer id) {
		System.out.println("修改了"+ id + "号图书");
		return "redirect:/tosuccess";
	}

	/**
	 * 查询图书
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/book/{bid}",method=RequestMethod.GET)
	public String getbook(@PathVariable("bid")Integer id) {
		System.out.println("查询到"+ id + "号图书");
		return "success";
	}
	
	/**
	 * 添加图书
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/book",method=RequestMethod.POST)
	public String addbook() {
		System.out.println("添加了图书");
		return "success";
	}
}
