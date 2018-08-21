package com.axing.service.impl;

import com.axing.bean.User;
import com.axing.service.UserService;
import org.springframework.stereotype.Service;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    public String getUser(User user) {
        System.out.println("远程调用服务端：");
        String rstring = "用户ID："+user.getId()+",用户名"+user.getUserName()+"用户密码："+user.getPassword();
        System.out.println(rstring);
        return rstring;
    }
}
