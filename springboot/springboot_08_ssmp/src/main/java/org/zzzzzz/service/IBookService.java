package org.zzzzzz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.zzzzzz.domain.Book;


public interface IBookService extends IService<Book> {  // 使用MP提供的自动生成业务接口
    IPage<Book> getPage(int currentPage, int pageSize, Book book);

    IPage<Book> getPage(int currentPage, int pageSize);
}
