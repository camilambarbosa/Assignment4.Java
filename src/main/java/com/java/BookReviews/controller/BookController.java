/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.BookReviews.controller;


import com.java.BookReviews.dto.AddReviewForm;
import com.java.BookReviews.model.Book;
import com.java.BookReviews.model.Review;
import com.java.BookReviews.repository.BookRepository;
import com.java.BookReviews.repository.ReviewRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



/**
 *
 * @author camilabarbosa
 */

@Controller
public class BookController {
    
    @Autowired
    BookRepository bookRepository;
    
    @Autowired
    ReviewRepository reviewRepository;
    
    @RequestMapping({"/main_page", "/"})
     public String main_Page (Model model){
         System.out.println("***********Entrou no main_page");
         
        List <Book> bookList = bookRepository.findAll();
        
        model.addAttribute("bookList", bookList);
        model.addAttribute("showReview", false);
        
        return "mainPage";
         
     }
    
    
    @RequestMapping ({"/add_Book"})
    public String add_Book(Model model){        
        return "addBook";
        
    }
    
    @RequestMapping (value="/save_Book", method= RequestMethod.POST )
    public String save_Book(@ModelAttribute Book book){   
      
      bookRepository.save(book);
        return "forward:main_page";
        
    }
    
    // @RequestMapping (value="/saveAdd", method= RequestMethod.POST )
    //public String saveAdd(@ModelAttribute Contact contact){

      //  contactRepository.save(contact);
       //() return "forward:contactList";
  //  }
    
    
    @RequestMapping({"/main_page/{id}", "/{id}"})
     public String main_Page_withReview (@PathVariable("id") Integer id, Model model){
         System.out.println("***********Entrou no main_page REVIEW: " + id);
         
        List <Book> bookList = bookRepository.findAll();
        
        model.addAttribute("bookList", bookList);
        
        Book selectedBook= bookRepository.getById(id);
        System.out.println(" size of reviewList: " + selectedBook.getReviewList().size());
        model.addAttribute("selectedBook",selectedBook);
        model.addAttribute("reviewList", selectedBook.getReviewList());
        model.addAttribute("showReview", true);
      
        return "mainPage";
         
     }
    
     
     @RequestMapping({"/edit_review/{id}", "/{id}"})
     public String edit_review (@PathVariable("id") Integer id, Model model){
        System.out.println("***********Entrou no EditrREVIEW: " + id);
        //List <Book> bookList = bookRepository.findAll();
       
        Optional<Book> selectedBookOptional= bookRepository.findById(id);
        Book selectedBook = selectedBookOptional.get();
        System.out.println(" ************selectedBook: " + selectedBook);
        model.addAttribute("selectedBook",selectedBook);
      
        return "addReview";
         
     }
     
     @RequestMapping ({"/save_review"})
    public String save_review(@ModelAttribute AddReviewForm reviewToBeAdd){   
        System.out.println("***********Entrou no SAVE Review: " + reviewToBeAdd);
        Optional<Book> bookOptional = bookRepository.findById(reviewToBeAdd.getBookId());
        Book book = bookOptional.get();
        
        Review review = new Review();
        review.setReview(reviewToBeAdd.getReview());
        review.setBook(book);
        book.addReview(review);
        
        
        reviewRepository.save(review);
        bookRepository.save(book);
        
        return "forward:main_page";
        
    }
     
}
