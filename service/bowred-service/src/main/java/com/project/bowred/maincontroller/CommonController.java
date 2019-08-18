package com.project.bowred.maincontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class CommonController {
	/*
	 * Common API Controller
	 * version : v1
	 * description : main 페이지 경로 등 common한 정보 Set/Get API Controller
	 */
	@RequestMapping("/root_path")
	public String root_path() throws Exception {
		String root_label = "main page url:8080/main";
		return root_label;
	}
}
