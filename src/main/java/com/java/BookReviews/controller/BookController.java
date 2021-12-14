/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.BookReviews.controller;


import com.java.BookReviews.model.Book;
import com.java.BookReviews.repository.BookRepository;
import com.java.BookReviews.repository.ReviewRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    
    @RequestMapping ({"/save_Book"})
    public String save_Book(Model model){   
        System.out.println("***********Entrou no SAVE BOOK");
        return "forward:main_page";
        
    }
    
    @RequestMapping({"/main_page/{id}", "/{id}"})
     public String main_Page_withReview (@PathVariable("id") Integer id, Model model){
         System.out.println("***********Entrou no main_page REVIEW: " + id);
         
        List <Book> bookList = bookRepository.findAll();
        
        model.addAttribute("bookList", bookList);
        
        model.addAttribute("showReview", true);
       
        
        return "mainPage";
         
     }
    
    
}
