package com.hzit.ssm.service.impl;

import com.hzit.ssm.mapper.indexMapper;
import com.hzit.ssm.service.indexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class indexServiceImpl implements indexService {
    @Autowired
    private indexMapper indexMapper;

    @Override
    public String add() {
        return indexMapper.addUser();
    }

    @Override
    public String query() {
        return indexMapper.queryName();
    }
}
