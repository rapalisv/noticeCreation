package com.david.vitali.www.web.main.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.david.vitali.www.web.main.properties.DatabaseDataSetProperties;
import com.david.vitali.www.web.main.properties.DevelopmentProperties;

/**
 * Main Configuration Class.
 * 
 * @author rapalisv Date: 31.07.2017
 *
 */
@Configuration
public class MainConfig {

  /**
   * Bean DevelopmentProperties. If Properties Were Set.
   * 
   * @return DevelopmentProperties
   */
  @Bean
  @ConditionalOnProperty(name = {"development.data-set.user", "development.data-set.user"})
  DevelopmentProperties getDevelopmentPropertie() {
    return new DevelopmentProperties();
  }

  /**
   * Bean DevelopmentProperties. If Properties Were Not Set. Default Values.
   * 
   * @return DevelopmentProperties
   */
  @Bean
  @ConditionalOnProperty(name = {"development.data-set.user", "development.data-set.user"},
      matchIfMissing = true)
  @ConditionalOnMissingBean(value = DevelopmentProperties.class)
  DevelopmentProperties getDevelopmentPropertieWithDefaultValues() {
    return DevelopmentProperties.builder()
        .dataSet(DatabaseDataSetProperties.builder()
            .user(0)
            .notice(0)
            .build())
        .build();
  }
}
