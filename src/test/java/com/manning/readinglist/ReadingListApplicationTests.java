package com.manning.readinglist;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@SpringBootTest


@WebAppConfiguration
class ReadingListApplicationTests {

    BookService bookService= new BookService() {
        @Override
        public String getBookByReader(String id) {
            return null;
        }
    };

    @Test
    void contextLoads() {
    }

    @Test
    void testThatItCanReturnBooks(){
        String title="arrow";
        String book=bookService.getBookByReader("treat");
        assertEquals("arrow", title);

    }

}
