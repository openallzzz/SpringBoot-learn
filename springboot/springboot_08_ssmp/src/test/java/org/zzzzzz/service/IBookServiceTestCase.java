package org.zzzzzz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.zzzzzz.domain.Book;

@SpringBootTest
public class IBookServiceTestCase {
    @Autowired
    private IBookService bookService;

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
        bookService.updateById(book);
    }

    @Test
    void testDelete() {
        bookService.removeById(27);
    }

    @Test
    void testGetById() {
        System.out.println(bookService.getById(12));
    }

    @Test
    void testGetAll() {
        System.out.println(bookService.list());
    }

    @Test
    void testGetPage() {
        IPage<Book> page = new Page<>(3, 4);
        bookService.page(page);
    }
}
