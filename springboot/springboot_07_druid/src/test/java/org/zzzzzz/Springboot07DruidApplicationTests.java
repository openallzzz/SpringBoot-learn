package org.zzzzzz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zzzzzz.dao.BookDao;
import org.zzzzzz.domain.Book;

@SpringBootTest
class Springboot07DruidApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        System.out.println(bookDao.getById(2));
    }

}
