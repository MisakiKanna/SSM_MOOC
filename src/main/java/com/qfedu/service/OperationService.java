package com.qfedu.service;

import com.qfedu.domain.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OperationService {
    public UserInfo getUserInfoByUsername(String username) throws Exception;

    public Map<String,Integer> getCountByInfo(Integer type) throws Exception;
}
