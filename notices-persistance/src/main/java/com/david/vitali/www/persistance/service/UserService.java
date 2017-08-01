package com.david.vitali.www.persistance.service;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.vitali.www.domain.mapper.model.IUserMapper;
import com.david.vitali.www.persistance.repository.IUserEntityRepository;

/**
 * User Service.
 * 
 * @author rapalisv Date: 01.08.2017
 *
 */
@Service
public class UserService{

  @Autowired
  private IUserEntityRepository iUserRepository;
  
  @Autowired
  private IUserMapper iUserMapper;
  
  public User createUser(User user){
    return null;
  }
}
