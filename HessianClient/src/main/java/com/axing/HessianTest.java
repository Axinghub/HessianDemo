package com.axing;

import com.axing.bean.User;
import com.axing.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HessianTest {
    public static void main(String[] args) {
        //加载我们的Spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("springremoting-client.xml");
        //获取我们的接口类
        UserService userService=(UserService)context.getBean("hessianUserSer");
        String string = userService.getUser(new User(123,"hessianU","hessianP"));
        System.out.println("远程调用返回数据：" + string);
    }
}
