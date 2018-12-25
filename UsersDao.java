package com.dao;

import com.pojo.Users;

/**
 * Created by 大凯爹 on 2018/11/10.
 */
public class UsersDao extends BaseDao {


    public int add(Users users){
        String sql="insert into users values(null,?,?,?,?,?)";
        return super.executeSql(sql,users.getUsername(),users.getPassword(),users.getEmail(),users.getIdentityImg(),users.getId());
    }
}
