package org.zzzzzz.dao.impl;

import org.springframework.stereotype.Repository;
import org.zzzzzz.dao.BookDao;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("save is running ...");
    }
}
