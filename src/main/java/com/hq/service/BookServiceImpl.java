package com.hq.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hq.bean.Book;
import com.hq.bean.Error_record;
import com.hq.dao.BookDAO;

@Service
public class BookServiceImpl implements BookService {
	@Resource
	private BookDAO bookDAO;
	@Override
	public int addBook(Book book) {
		
		return bookDAO.addBook(book);
	}
	@Override
	public int addError(Error_record error_record) {
		// TODO Auto-generated method stub
		return bookDAO.addError(error_record);
	}
	@Override
	public List list(Map map) {
		// TODO Auto-generated method stub
		return bookDAO.list(map);
	}

}
