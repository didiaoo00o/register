package com.wsc.register.service;

import com.wsc.register.entity.SysUser;
import com.wsc.register.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: RegisterServiceImp
 * @author: wsc
 * @date: 2020/5/6  19:56
 */
@Service
public class RegisterServiceImp {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> findAll(){
        return sysUserMapper.selectAll();
    }
    public void addRegisterUser(SysUser sysUser){
        sysUserMapper.insert(sysUser);
    }
}
