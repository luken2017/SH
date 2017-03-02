package com.luken.common.hibernate;

import org.hibernate.Session;


public class SqlQueryBuilder extends QueryBuilder {

    protected boolean isNativeSQL() {
        return true;
    }
    
    public SqlQueryBuilder(Session session, CharSequence sql) {
        super(session, sql);
    }

    public SqlQueryBuilder(Session theSession, CharSequence sql, Object... params) {
        super(theSession, sql, params);
    }

    public SqlQueryBuilder(CharSequence sql, Object... params) {
        super(sql, params);
    }

    public SqlQueryBuilder(CharSequence sql) {
        super(sql);
    }

}
