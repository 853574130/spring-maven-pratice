package com.imooc.security.browser;


import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;
@Component//变成spring的一个bean
public class MyUserDetailService implements UserDetailsService {
//private ILoggerFactory logger=LoggerFactory.getILoggerFactory();
	/*
	 * UserDetails是个借口
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// 传入用户名，进入数据库去查有没有该用户的信息
		
		System.out.println(username);
		return new User(username, "123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
		/*
		 * 1用户名（当前写死了，实际开发中需要从数据库中获取）
		 * 2.密码（当前写死了，实际开发中需要从数据库中获取）
		 * 3授权  权限先随便改一下（当前写死了，实际开发中需要从数据库中获取）
		 */
	}

}
