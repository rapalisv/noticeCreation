package com.david.vitali.www.web.main.runner;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.david.vitali.www.persistance.entity.NoticeEntity;
import com.david.vitali.www.persistance.entity.UserEntity;
import com.david.vitali.www.persistance.repository.INoticeEntityRepository;
import com.david.vitali.www.persistance.repository.IUserEntityRepository;
import com.david.vitali.www.web.main.properties.DevelopmentProperties;

import lombok.extern.log4j.Log4j;

/**
 * This Class Will Be Picked Up By Spring Boot When The Application Get Started.
 * 
 * This Implementation Can Be Used For DataBase Initialization.
 * 
 * @author rapalisv Date: 28.07.2017
 *
 */
@Component
@Profile("development")
@Log4j
@Transactional
public class WebCommandRunner implements CommandLineRunner {
  @Autowired
  private IUserEntityRepository iUserRepository;

  @Autowired
  private INoticeEntityRepository iNoticeRepository;

  @Autowired
  private DevelopmentProperties devProperties;

  @Override
  public void run(String... args) throws Exception {
    createUser(devProperties.getDataSet()
        .getUser());
    createNotice(devProperties.getDataSet()
        .getNotice());
  }

  /**
   * Create Notice.
   * 
   * @param int i
   */
  private void createNotice(int i) {
    int counter = 1;

    while (i >= counter) {
      NoticeEntity notice = NoticeEntity.builder()
          .noticeName("Notice Name " + counter)
          .creationDate(new Date())
          .build();
      iNoticeRepository.save(notice);
      counter++;
    } ;

    log.info("Development Set Of Notices DataSet Was Set To: " + i);
  }

  /**
   * Create User.
   * 
   * @param int i
   */
  private void createUser(int i) {
    int counter = 1;

    while (i >= counter) {
      UserEntity user = UserEntity.builder()
          .name("User " + counter)
          .registrationDate(new Date())
          .email("email" + counter + "@mail.com")
          .build();
      iUserRepository.save(user);
      counter++;
    }

    log.info("Development Set Of Users DataSet Was Set To: " + i);

  }
}
