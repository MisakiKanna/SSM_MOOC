package com.qfedu.serviceImpl;

import com.qfedu.domain.UserInfo;
import com.qfedu.mapper.OperationDao;
import com.qfedu.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Service
public class OperationServiceImpl implements OperationService {


    @Autowired
    private OperationDao operationDao;


    @Override
    public UserInfo getUserInfoByUsername(String username) throws Exception{
        return operationDao.selectOperationsByUsername(username);
    }

    @Override
    public Map<String, Integer> getCountByInfo(Integer type) throws Exception {
        List<UserInfo> userInfos = operationDao.selectCountByInfo(type);

        //拆解组装map
        HashMap<String, Integer> hashMap = new HashMap<>();

        Iterator<UserInfo> iterator = userInfos.iterator();
        while(iterator.hasNext()){
            UserInfo userInfo = iterator.next();
            if(userInfo.getOperations().get(0).getId()!=null) {
                hashMap.put(userInfo.getUsername(), userInfo.getOperations().size());
            }else{
                hashMap.put(userInfo.getUsername(), 0);
            }
        }

        return hashMap;
    }
}
