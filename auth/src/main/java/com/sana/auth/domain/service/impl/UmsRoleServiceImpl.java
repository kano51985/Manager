package com.sana.auth.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sana.auth.domain.entity.UmsRole;
import com.sana.auth.domain.mapper.UmsRoleMapper;
import com.sana.auth.domain.service.IUmsRoleService;
import org.springframework.stereotype.Service;

@Service
public class UmsRoleServiceImpl extends ServiceImpl<UmsRoleMapper, UmsRole> implements IUmsRoleService {
}
