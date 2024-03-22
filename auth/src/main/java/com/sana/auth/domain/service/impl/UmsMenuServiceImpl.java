package com.sana.auth.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sana.auth.domain.entity.UmsMenu;
import com.sana.auth.domain.mapper.UmsMenuMapper;
import com.sana.auth.domain.service.IUmsMenuService;
import org.springframework.stereotype.Service;

@Service
public class UmsMenuServiceImpl extends ServiceImpl<UmsMenuMapper, UmsMenu> implements IUmsMenuService {
}
