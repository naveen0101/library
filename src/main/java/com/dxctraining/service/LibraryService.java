package com.dxctraining.service;
import com.dxctraining.entities.Book;
import java.util.*;
public interface LibraryService {
	Book findBookbyId(String id);
	List<Book>displayAll();
	void addBook(Book book);
	Book updateBookcost(String id,double cost);
	void removeBook(String id);

}
