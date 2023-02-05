package org.zzzzzz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.zzzzzz.domain.Book;

@Mapper
public interface BookDao extends BaseMapper<Book> {
}
