package com.hq.service;

import java.util.List;
import java.util.Map;

import com.hq.bean.Book;
import com.hq.bean.Error_record;

public interface BookService {

	int addBook(Book book);

	int addError(Error_record error_record);

	List list(Map map);

}
