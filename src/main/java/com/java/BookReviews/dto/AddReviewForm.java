/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.BookReviews.dto;

/**
 *
 * @author camilabarbosa
 */
public class AddReviewForm {
    
    private Integer bookId;
    private String review;

    public AddReviewForm() {
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "AddReviewForm{" + "bookId=" + bookId + ", review=" + review + '}';
    }
    
    
    
}
