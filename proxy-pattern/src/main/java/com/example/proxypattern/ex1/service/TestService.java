package com.example.proxypattern.ex1.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Log4j2
@Primary
@Service
public class TestService implements EventService {

	@PerfLogging
	@Override
	public void createEvent() {
		log.info("createEvent");
	}

	@PerfLogging
	@Override
	public void publishEvent() {
		log.info("publishEvent");
	}
}
