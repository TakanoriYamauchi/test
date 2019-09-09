package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@Autowired
	App app;

	@Autowired
	AppInterface appInterface;

	@RequestMapping(value = "aa", method = RequestMethod.GET)
	public String test() {
		return app.getJson();
	}

	@RequestMapping("/testJson")
	public String test2() {
		return appInterface.TestJson();
	}

}
