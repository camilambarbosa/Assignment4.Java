/*
 * Enterprise Java Development - Assignment 4
 * Due December 15th 2021       
 * Authors: Camila Barbosa 192622796, Nicholas Carvalho 991634372
 */
package com.java.BookReviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="review")

public class Review {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String review;
    
    @ManyToOne
    private Book book;

    public Review(Integer id, String review) {
        this.id = id;
        this.review = review;
    }

    public Review() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    
    
    @Override
    public String toString() {
        return "Review{" + "id=" + id +  ", review=" + review + '}';
    }

    
}

