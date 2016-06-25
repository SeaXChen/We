package com.lzx.hdu.service;


import com.lzx.hdu.pojo.User;

public interface IUserService {
	User getUserById(int userId);
	User getUserByUsername(String username);
}
