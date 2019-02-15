package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.model.Book;
import com.test.demo.service.BookService;


@RestController
@RequestMapping("api/book")
public class BookController {
	
	
	@Autowired
	private BookService service;
	
	@GetMapping("")
	public ResponseEntity<List<Book>> getAll() {
		return new ResponseEntity<>(service.getAll(), HttpStatus.OK); 
	}
	
	/*@PostMapping("")
	public ResponseEntity<Book> add(@RequestBody byte[] bytes){
		String byteStr = new String(bytes);
		Book book = new Book();
		book.setTitle("Hindi");
		book.setTags(byteStr);
		return new ResponseEntity<>(service.add(book), HttpStatus.OK); 
	}*/

}
