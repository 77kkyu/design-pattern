package com.example.proxypattern.ex1.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Primary
@Service
public class ProxyTestEventService implements EventService {

	private final TestEventService testEventService;

	@Override
	public void createEvent() {
		long begin = System.currentTimeMillis();
		testEventService.createEvent();
		log.info(System.currentTimeMillis() - begin);
	}

	@Override
	public void publishEvent() {
		long begin = System.currentTimeMillis();
		testEventService.publishEvent();
		log.info(System.currentTimeMillis() - begin);
	}
}
