package com.example.proxypattern.ex2;

import com.example.proxypattern.ex2.domain.Book;
import com.example.proxypattern.ex2.service.BookProxyService;
import com.example.proxypattern.ex2.service.BookRealService;
import com.example.proxypattern.ex2.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainClientTest {

	@Autowired
	private BookService bookService;

	@Autowired
	private BookRealService bookRealService;

	@Test
	void client() {
		bookService = new BookProxyService(new BookRealService());
		bookService.rent(new Book("객체지향"));
	}

	@Test
	void client2() {
		bookRealService.rent(new Book("디자인 패턴"));
	}

}
