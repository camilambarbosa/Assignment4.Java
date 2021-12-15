/*
 * Enterprise Java Development - Assignment 4
 * Due December 15th 2021       
 * Authors: Camila Barbosa 192622796, Nicholas Carvalho 991634372
 */
package com.java.BookReviews.dto;

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
