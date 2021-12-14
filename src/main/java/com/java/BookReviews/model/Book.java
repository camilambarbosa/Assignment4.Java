/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.BookReviews.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author camilabarbosa
 */
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String title;
    private String authors;
    
    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
     private List<Review> reviewList= new ArrayList();
    
    public void addReview(Review review){
        this.reviewList.add(review);
    }
    
    public void moveReview(Review review){
        this.reviewList.remove(review);
    }
            
            

    public Book(Integer id, String title, String authors) {
        this.id = id;
        this.title = title;
        this.authors = authors;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", authors=" + authors + '}';
    }
    
    
    
}
