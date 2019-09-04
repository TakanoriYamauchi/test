package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@RequestMapping(value = "aa", method=RequestMethod.GET)
	public String test() {
		return "成功";
	}

	@RequestMapping("/failed")
	public String test2() {
		return "失敗";
	}

}
