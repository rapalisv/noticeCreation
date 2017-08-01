package com.david.vitali.www.web.main.properties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Externalize Configuration Of Development Profile. Define User And Notice Count To Be Added Into Database.
 * 
 * @author rapalisv Date: 31.07.2017
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DatabaseDataSetProperties {
  private int user;
  private int notice;
}
