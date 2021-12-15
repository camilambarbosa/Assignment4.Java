/*
 * Enterprise Java Development - Assignment 4
 * Due December 15th 2021       
 * Authors: Camila Barbosa 192622796, Nicholas Carvalho 991634372
 */
package com.java.BookReviews.repository;


import com.java.BookReviews.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
    
}
    

