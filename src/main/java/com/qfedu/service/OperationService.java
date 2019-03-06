package com.qfedu.service;

import com.qfedu.domain.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface OperationService {
    public UserInfo getUserInfoByUsername(String username) throws Exception;
}
