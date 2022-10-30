package com.example.proxypattern.ex2.service;

import com.example.proxypattern.ex2.domain.Book;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

/**
 * 리얼 서브젝트 역할
 */
@Log4j2
@Service
public class BookRealService implements BookService {
	@Override
	public void rent(Book book) {
		log.info("rent : " + book.getTitle());
	}
}
