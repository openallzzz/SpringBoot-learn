package org.zzzzzz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zzzzzz.dao.BookDao;

// 标注启动类: classes = .....
@SpringBootTest(classes = Springboot04JunitApplication.class)
class Springboot04JunitApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        bookDao.save();
    }

}
