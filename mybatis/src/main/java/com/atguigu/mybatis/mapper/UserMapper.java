package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.bean.User;

/**
 * @author zhuxu
 * @date 2020/7/23 11:19
 */
public interface UserMapper {

    User getUserById1(String id);
    User getUserById2(String id);
}
