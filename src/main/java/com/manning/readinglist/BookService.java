package com.manning.readinglist;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
    public String getBookByReader(String id);
    
}
