package com.dxctraining.dao;
import com.dxctraining.entities.Book;
import java.util.*;
public interface LibraryDao {
	Book findBookbyId(String id);
	List<Book>displayAll();
	void addBook(Book book);
	Book updateBookcost(String id,double cost);
	void removeBook(String id);
	

}
