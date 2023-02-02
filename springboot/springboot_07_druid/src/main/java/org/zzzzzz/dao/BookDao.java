package org.zzzzzz.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.zzzzzz.domain.Book;

@Mapper
public interface BookDao {

    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);
}
