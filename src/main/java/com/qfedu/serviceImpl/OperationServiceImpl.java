package com.qfedu.serviceImpl;

import com.qfedu.domain.UserInfo;
import com.qfedu.mapper.OperationDao;
import com.qfedu.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationServiceImpl implements OperationService {


    @Autowired
    private OperationDao operationDao;


    @Override
    public UserInfo getUserInfoByUsername(String username) throws Exception{
        return operationDao.selectOperationsByUsername(username);
    }
}
