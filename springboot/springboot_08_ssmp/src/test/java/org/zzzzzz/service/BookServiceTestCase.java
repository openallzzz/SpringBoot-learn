package org.zzzzzz.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zzzzzz.domain.Book;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("aaa");
        book.setType("aaa");
        book.setDescription("aaa");
        System.out.println(bookService.save(book));
    }

    @Test
    void testUpdate() {
        Book book = new Book();
        book.setId(27);
        book.setName("bbb");
        book.setType("bbb");
        book.setDescription("bbb");
        bookService.update(book);
    }

    @Test
    void testDelete() {
        bookService.delete(27);
    }

    @Test
    void testGetById() {
        System.out.println(bookService.getById(12));
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    void testGetPage() {
        bookService.getPage(1, 5);
    }
}
