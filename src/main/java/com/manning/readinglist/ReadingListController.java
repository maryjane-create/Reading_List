package com.manning.readinglist;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.messaging.handler.annotation.MessageMapping;



@Controller
public class ReadingListController {

    private  final  BookRepository bookRepository;


    public ReadingListController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public  String getAllBooks(Model model){
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }







}
