package com.twschool.practice.domain;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserRepository {
    private Map<String, UserInfo> userRepositoryMap = new HashMap<>();

    public UserInfo getUserInfoById(String id) {
        return userRepositoryMap.get(id);

    }

    public void setUserInfo(String id, UserInfo userInfo) {
        userRepositoryMap.put(id, userInfo);

    }
}
