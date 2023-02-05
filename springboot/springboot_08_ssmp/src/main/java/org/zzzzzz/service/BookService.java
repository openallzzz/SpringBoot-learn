package org.zzzzzz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.zzzzzz.domain.Book;

import java.util.List;

public interface BookService {  // 业务层开发：先写接口，后写实现类
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();

    IPage<Book> getPage(int currentPage, int pageSize);
}
