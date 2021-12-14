/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.BookReviews.repository;


import com.java.BookReviews.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author camilabarbosa
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
    
}
    

