package com.dxctraining.dao;
import com.dxctraining.entities.Book;
import com.dxctraining.entities.Author;
import com.dxctraining.exceptions.BookNotFoundException;
import java.util.*;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



@Repository
public class LibraryDaoImpl implements LibraryDao {
    private Map<String, Book> store = new HashMap<>();
    private int generatedid;
    public String generatedId()
    {
        generatedid++;
        String strid=""+generatedid;
        return strid;
    }
    public Book findBookbyId(String id) {
        Book books=store.get(id);
        if(books==null)
        {
            throw new BookNotFoundException("Book not found");
        }
        return books;
    }

    public Book updateBookcost(String id, double cost) {
       Book books=findBookbyId(id);
       books.setCost(cost);
       return books;
    }
    public void addBook(Book book) {
        String id=book.getId();
        store.put(id,book);
        book.setId(id);
    }
    public List<Book> displayAll() {
		Collection<Book> displaybooks= store.values();
		List<Book> list = new ArrayList<>();
		for (Book books : displaybooks) {
			list.add(books);
		}
		return list;
	}

    public void removeBook(String id) {
        store.remove(id);
    }
}