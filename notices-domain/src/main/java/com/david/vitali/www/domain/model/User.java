package com.david.vitali.www.domain.model;

import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * User Domain Class.
 * 
 * @author rapalisv Date: 26.07.2017
 *
 */
@Data
@Builder
@ToString(exclude={"notices"})
@NoArgsConstructor
@AllArgsConstructor
public class User {
  private Long id;
  private String name;
  private String password;
  private String email;
  private Date registrationDate;
  private List<Notice> notices;
}
