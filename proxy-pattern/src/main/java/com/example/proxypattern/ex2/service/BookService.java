package com.example.proxypattern.ex2.service;

import com.example.proxypattern.ex2.domain.Book;

/**
 * 서브젝트 역할
 */
public interface BookService {
	void rent(Book book);
}
