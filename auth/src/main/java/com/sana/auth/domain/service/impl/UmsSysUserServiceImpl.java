package com.sana.auth.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sana.auth.domain.entity.UmsSysUser;
import com.sana.auth.domain.mapper.UmsSysUserMapper;
import com.sana.auth.domain.service.IUmsSysUserService;
import org.springframework.stereotype.Service;

@Service
public class UmsSysUserServiceImpl extends ServiceImpl<UmsSysUserMapper, UmsSysUser> implements IUmsSysUserService {
}
