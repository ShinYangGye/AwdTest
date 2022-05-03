package com.meta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {

	@GetMapping("/test")
	public String test(@RequestParam(defaultValue = "1") Integer number) {
		
		if (number == 1) {
			log.info("################# Info");
		} else if (number == -1) {
			log.error("################# Error");
		} else if(number == 0) {
			log.warn("################# Warn");
		}
		
		return "Test";
	}
	
}
