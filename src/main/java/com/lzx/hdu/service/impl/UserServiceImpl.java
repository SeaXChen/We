package com.lzx.hdu.service.impl;

import com.lzx.hdu.dao.IUserDao;
import com.lzx.hdu.pojo.User;
import com.lzx.hdu.service.IUserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

	@Override
	public User getUserByUsername(String username) {
		return userDao.findUserByUsername(username);
	}

}
