package com.david.vitali.www.test.mapping;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import com.david.vitali.www.domain.mapper.model.IUserMapper;
import com.david.vitali.www.domain.model.User;
import com.david.vitali.www.persistance.entity.NoticeEntity;
import com.david.vitali.www.persistance.entity.UserEntity;

import lombok.extern.log4j.Log4j;

@Log4j
public class UserMappingTest {
  private IUserMapper userMapper;
  private User user;
  private UserEntity userEntity;
  private NoticeEntity noticeEntity;

  @Before
  public void beforTest() {
    userMapper = Mappers.getMapper(IUserMapper.class);
    userEntity = UserEntity.builder()
        .id(Long.valueOf(1))
        .email("email@email.com")
        .password("Password")
        .name("User Name")
        .notices(null)
        .registrationDate(new Date())
        .build();
    noticeEntity = NoticeEntity.builder()
        .id(Long.valueOf(1))
        .updateDate(new Date())
        .creationDate(new Date())
        .updateDate(new Date())
        .build();
   userEntity.setNotices(Arrays.asList(noticeEntity));
  }

  @Test
  public void test() {
    assertNotNull(userMapper);
    user = userMapper.userToUserEntity(userEntity);
    assertNotNull(user);
    log.info("Entity User Was Mapped To User: " + user);
  }

}
