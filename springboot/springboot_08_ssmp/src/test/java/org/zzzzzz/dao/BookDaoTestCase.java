package org.zzzzzz.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zzzzzz.domain.Book;

@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById() {
        Book book = bookDao.selectById(2);
        System.out.println(book);
    }

    @Test
    void testPage() {
        IPage page = new Page(2, 5);
        bookDao.selectPage(page, null);
    }

    @Test
    void testGetBy() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name", "Spring");
        bookDao.selectList(qw);
    }

}
