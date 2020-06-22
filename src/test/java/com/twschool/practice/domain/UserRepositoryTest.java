package com.twschool.practice.domain;

import org.junit.Assert;
import org.junit.Test;

public class UserRepositoryTest {
    @Test
    public void should_return_userInfo() {

        UserInfo userInfo = new UserInfo("sch",new GuessNumberGame(new AnswerGenerator()),0,0);
        UserRepository userRepository = new UserRepository();

        userRepository.setUserInfo("sch",userInfo);

        UserInfo result = userRepository.getUserInfoById("sch");
        Assert.assertNotNull(result);
        Assert.assertEquals(0,result.getScore());

    }

}
