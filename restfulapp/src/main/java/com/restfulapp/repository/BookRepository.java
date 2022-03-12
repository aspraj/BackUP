package com.restfulapp.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.restfulapp.entity.Book;
import com.restfulapp.entity.Employee;

public interface BookRepository extends CrudRepository<Book, Integer> {


	@Query("FROM Book e where e.name=:eName")
	Book findBookByName(@Param("eName") String name);
	
	@Modifying
	@Query("update Book e set e.name=:name where e.id=:bookId")
	Integer updateBook(@Param("bookId") Integer id,@Param("name") String name);

}	