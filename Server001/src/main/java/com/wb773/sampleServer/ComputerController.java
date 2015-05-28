package com.wb773.sampleServer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//Declaration as this class as a controller
@Controller 
//Declaration that this controller handles requests on uri */computer
@RequestMapping("/computer") 
public class ComputerController {
	
	
	// Declare a method that handle all GET request on */computer
	@RequestMapping(value = "/getList", method = RequestMethod.GET, produces = "application/json")
	// Return a list of computer to the http client
	public @ResponseBody List<Book> getComputers() {
		
		ArrayList<Book> bookList = new ArrayList<Book>(); 
	
		bookList.add(new Book(1,"book name1",100.00));
		bookList.add(new Book(2,"book name2",100.00));
		bookList.add(new Book(3,"book name3",100.00));
		bookList.add(new Book(4,"book name4",100.00));
		bookList.add(new Book(5,"book name5",100.00));

		return bookList;
	}
	
	
}

