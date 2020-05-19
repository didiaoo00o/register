package com.wsc.register.controller;

import com.wsc.register.entity.Result;
import com.wsc.register.entity.SysUser;
import com.wsc.register.service.RegisterServiceImp;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName: RegisterController
 * @author: wsc
 * @date: 2020/5/6  19:56
 */
@Controller
public class RegisterController {
    Log log = LogFactory.getLog(RegisterController.class);

    @Autowired
    private RegisterServiceImp registerServiceImp;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView register(){
        return new ModelAndView("/index_javascript");
    }
    @RequestMapping(value = "/register/add",method = RequestMethod.POST)
    public @ResponseBody Result add(@RequestBody SysUser sysUser){
        registerServiceImp.addRegisterUser(sysUser);
        return Result.success();
    }
    @RequestMapping(value = "/register/getAll",method = RequestMethod.GET)
    public @ResponseBody Result getAll(){
        List<SysUser> sysUserList = registerServiceImp.findAll();
        return Result.success(sysUserList);
    }

}
