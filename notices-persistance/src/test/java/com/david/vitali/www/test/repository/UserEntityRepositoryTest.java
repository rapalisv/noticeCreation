package com.david.vitali.www.test.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.david.vitali.www.persistance.entity.NoticeEntity;
import com.david.vitali.www.persistance.entity.UserEntity;
import com.david.vitali.www.persistance.repository.IUserEntityRepository;
import com.david.vitali.www.test.AbstractPersistanceTest;
import lombok.extern.log4j.Log4j;

/**
 * UserEntityRepository Test Class. Crud Operation.
 * 
 * @author rapalisv Date: 26.07.2017
 *
 */
@Log4j
public class UserEntityRepositoryTest extends AbstractPersistanceTest {
  @Autowired
  private IUserEntityRepository userRepository;
  private UserEntity userEntity;
  private NoticeEntity noticeEntity;
  private List<NoticeEntity> notices;

  @Before
  public void beforTest() {
    userEntity = UserEntity.builder()
        .email("usermax@email.com")
        .name("Max")
        .password("Password")
        .registrationDate(new Date())
        .build();
    noticeEntity = NoticeEntity.builder()
        .noticeName("Notice Date")
        .creationDate(new Date())
        .build();
    notices = new ArrayList<>(Arrays.asList(noticeEntity));
  }

  @Test
  public void saveUserTest() {
    assertNotNull(userEntity);
    userRepository.save(userEntity);
    assertNotNull(userEntity.getId());
    log.info("Saved User Entity: " + userEntity);
  }

  @Test
  public void findUserTest() {
    UserEntity u = userRepository.findOne(Long.valueOf(1));
    assertNotNull(u);
  }

  @Test
  public void updateUserTest() {
    UserEntity u = userRepository.findOne(Long.valueOf(1));
    u.setName("Updated Name");
    userRepository.save(u);
    UserEntity updatedUser = userRepository.findOne(Long.valueOf(1));
    assertEquals(updatedUser.getName(), "Updated Name");
    log.info("Updated User Enity: " + updatedUser);
  }

  @Test
  public void deleteUserTest() {
    UserEntity u = userRepository.findOne(Long.valueOf(1));
    userRepository.delete(u);
    UserEntity deletedUser = userRepository.findOne(Long.valueOf(1));
    assertNull(deletedUser);
  }

  @Test
  public void userRelationshipTest() {
    UserEntity u = userRepository.findOne(Long.valueOf(1));
    u.setNotices(notices);
    userRepository.save(u);
    u.setName("AN");
  }
}
