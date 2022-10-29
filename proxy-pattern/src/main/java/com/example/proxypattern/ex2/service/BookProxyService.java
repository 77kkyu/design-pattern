package com.example.proxypattern.ex2.service;

import com.example.proxypattern.ex2.domain.Book;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
public class BookProxyService implements BookService {
	private final BookRealService bookRealService;

	@Override
	public void rent(Book book) {
		log.info("트랜잭션 처리");
		bookRealService.rent(book); // 프록시 -> 리얼 서브젝트
		log.info("로깅");
	}
}
