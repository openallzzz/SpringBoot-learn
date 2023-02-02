package org.zzzzzz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zzzzzz.dao.BookDao;
import org.zzzzzz.domain.Book;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        Book book = bookDao.selectById(2);
        System.out.println(book);
    }

}
