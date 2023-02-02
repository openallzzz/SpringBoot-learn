package org.zzzzzz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zzzzzz.dao.BookDao;
import org.zzzzzz.domain.Book;

@SpringBootTest
class Springboot05MybatisApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        Book book = bookDao.getById(9);
        System.out.println(book);
    }

}
