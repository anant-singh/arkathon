package com.eighlark.ark.arkathon.controller;

import com.eighlark.ark.arkathon.domain.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name)  {

        Shop shop = new Shop();
        shop.setName(name);
        shop.setStaffName(new String[]{"akshay1", "akshay2"});

        return shop;

	}

}