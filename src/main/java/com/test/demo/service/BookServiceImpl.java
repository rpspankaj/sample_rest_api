package com.test.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.model.Book;


@Service
public class BookServiceImpl implements BookService {

	/*@Autowired
	private BookMapper bookMapper;*/
	
	/*@Override
	public Book add(Book book) {
		//return bookMapper.insert(book)>0?book:null;
		
	}*/

	@Override
	public List<Book> getAll() {
		List<Book> list=null;
		try {
			//list=bookMapper.getAll();
			
			list = getDummy();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return list;
	}

	private List<Book> getDummy() {
		List<Book> list = new ArrayList<>();
		Book book = new Book();
		book.setTitle("Hindi");
		book.setId(1);
		book.setTags("Education");
		list.add(book);
		return list;
	}

	

}
