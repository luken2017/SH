package com.luken.helper;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Repository;

import com.luken.common.hibernate.QueryBuilder;
import com.luken.model.UserData;


@Repository
public class UserDataHelper extends BaseHelper {

    public UserData findUserById(String id) {
        QueryBuilder query = newQueryBuilder("UserData u");
        query.eq("u.id", UUID.fromString(id));
        return (UserData) query.querySingle();
    }
    
    public UserData queryUserByEmail(String email) {
        if (email != null) {
            email = email.toLowerCase();
        }
        QueryBuilder query = newQueryBuilder("UserData u");
        query.eq("u.email", email);
        return (UserData) query.querySingle();
    }
    public List<UserData> queryUsers() {
        QueryBuilder query = newQueryBuilder("UserData u");
        return query.query();
    }
    
    public List<UserData> queryUsers(String keyword) {
        keyword = keyword.replace("'", "");
        String sql = String.format("select top 100 * from user_data2 ");
        
        if (!StringUtils.isBlank(keyword)) {
            String keywordSql = String.format(
                    "where email like '%%%s%%' or username like '%%%s%%' ", keyword, keyword);
            sql = sql + keywordSql;
        }
        
        NativeQuery<UserData> query = this.getCurrentSession().createNativeQuery(sql);
        
        return query.getResultList();
    }
}
