package com.lzx.hdu.dao;


import com.lzx.hdu.pojo.User;


public interface IUserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User findUserByUsername(String username);
    
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
}