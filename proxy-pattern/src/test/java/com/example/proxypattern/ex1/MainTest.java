package com.example.proxypattern.ex1;

import com.example.proxypattern.ex1.service.ProxyTestEventService;
import com.example.proxypattern.ex1.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainTest {

	@Autowired
	private ProxyTestEventService testEventService;

	@Autowired
	private TestService testService;

	@Test
	void 프록시_테스트() {
		testEventService.createEvent();
		testEventService.publishEvent();
	}

	@Test
	void 테스트() {
		testService.createEvent();
		System.out.println("==================");
		testService.publishEvent();
	}

}

