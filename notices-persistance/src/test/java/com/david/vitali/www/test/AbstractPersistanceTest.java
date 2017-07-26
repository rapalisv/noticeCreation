package com.david.vitali.www.test;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Abstract Persistence Test Class
 * 
 * @author rapalisv Date: 26.07.2017
 *
 */
@RunWith(SpringRunner.class)
@DataJpaTest(showSql = true)
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public abstract class AbstractPersistanceTest {

  @SpringBootConfiguration
  @EnableJpaRepositories(basePackages = "com.david.vitali.www.persistance.repository")
  @EntityScan(basePackages = "com.david.vitali.www.persistance.entity")
  public static class AbstractPersistanceConfigurationTest {
  }

}
