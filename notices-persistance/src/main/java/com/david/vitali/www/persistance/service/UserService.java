package com.david.vitali.www.persistance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.david.vitali.www.domain.model.User;
import com.david.vitali.www.persistance.entity.UserEntity;
import com.david.vitali.www.persistance.mapper.model.IUserMapper;
import com.david.vitali.www.persistance.repository.IUserEntityRepository;

import lombok.NonNull;

/**
 * User Service.
 * 
 * @author rapalisv Date: 01.08.2017
 *
 */
@Service
@Transactional
public class UserService {

  @Autowired
  private IUserEntityRepository iUserRepository;

  @Autowired
  private IUserMapper iUserMapper;

  /**
   * Create User. If Param Will Be Null Throw NullPointerExeption.
   * 
   * @param User user
   * @return User user
   */
  public User createUser(@NonNull User user) {
    User u= user;
    UserEntity userEntity = iUserMapper.userToUserEntity(u);
    iUserRepository.save(userEntity);
    u = iUserMapper.userEntityToUser(userEntity);
    return u;
  }
}
