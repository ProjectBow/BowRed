package com.project.bowred.maincontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.bowred.model.CommonDO;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class MainController {
	
	@RequestMapping("/main")
	public ModelAndView getMainPage() throws Exception {
		//+ main 페이지에 필요한 model/view 셋업
		ModelAndView mav = new ModelAndView("main");
		ArrayList<String> ALSValue = new ArrayList<>();
		ALSValue.add("test1");
		ALSValue.add("test2");
		ALSValue.add("test2");
		Integer IntValue = new Integer(10000);
		mav.addObject("als_set", ALSValue);
		mav.addObject("int_set", IntValue);
		//- main 페이지에 필요한 model/view 셋업
		//main.jsp model and view return
		return mav;
	}
	
	@RequestMapping("/api_version")
	public @ResponseBody String get_api_version() throws Exception {
		String version = "v1.0.0";
		//+ 실제 version 정보 가지고 오는 루틴
		
		//- 실제 version 정보 가지고 오는 루틴
		//Controller에서 Contents 자체를 전달하기 위해 @ResponseBody annotation 사용
		return version;
	}
	
	@RequestMapping("/model_test")
	public ModelAndView getModelTest() throws Exception {
		ModelAndView mav = new ModelAndView();
		CommonDO cdo1 = new CommonDO();
		CommonDO cdo2 = new CommonDO("cdo2", new Integer(1000));
		ArrayList<CommonDO> AL_CDO = new ArrayList<>();
		AL_CDO.add(cdo1);
		AL_CDO.add(cdo2);
		Integer IntValue = new Integer(10000);
		mav.setViewName("model_test");
		mav.addObject("alcdo_set", AL_CDO);
		mav.addObject("int_set", IntValue);
		return mav;
	}
}
