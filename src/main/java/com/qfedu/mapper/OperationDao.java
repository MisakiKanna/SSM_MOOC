package com.qfedu.mapper;

import com.qfedu.domain.Operation;
import com.qfedu.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationDao {
    public UserInfo selectOperationsByUsername(String username) throws Exception;
}
