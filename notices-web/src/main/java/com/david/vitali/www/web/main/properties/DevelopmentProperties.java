package com.david.vitali.www.web.main.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Externalize Configuration Of Development Profile.
 * 
 * @author rapalisv Date: 31.07.2017
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties(value = "development")
public class DevelopmentProperties {
  /**
   * Demo Data Set For Test And Play Around Purpose.
   */
  private DatabaseDataSetProperties dataSet;
}
