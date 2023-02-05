package org.zzzzzz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.zzzzzz.dao.BookDao;
import org.zzzzzz.domain.Book;
import org.zzzzzz.service.IBookService;

@Service
public class BookServiceImpl2 extends ServiceImpl<BookDao, Book> implements IBookService {
}
