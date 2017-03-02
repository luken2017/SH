package com.luken.helper;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.luken.common.hibernate.QueryBuilder;
import com.luken.common.hibernate.SqlQueryBuilder;


public class BaseHelper {

    @Autowired
    protected SessionFactory sessionFactory;
    
    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    
    protected QueryBuilder newQueryBuilder(CharSequence sql) {
        return newQueryBuilder(sql, new Object[0]);
    }

    protected QueryBuilder newQueryBuilder(CharSequence sql, Object... params) {
        return new QueryBuilder(sessionFactory.getCurrentSession(), sql, params);
    }

    protected QueryBuilder newSqlQueryBuilder(CharSequence sql) {
        return newSqlQueryBuilder(sql, new Object[0]);
    }

    protected QueryBuilder newSqlQueryBuilder(CharSequence sql, Object... params) {
        return new SqlQueryBuilder(sessionFactory.getCurrentSession(), sql, params);
    }
    
}
