package com.example.proxypattern.ex1.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class TestEventService implements EventService {
	@PerfLogging
	@Override
	public void createEvent() {
		log.info("create Event");
	}

	@PerfLogging
	@Override
	public void publishEvent() {
		log.info("publish Event");
	}
}
