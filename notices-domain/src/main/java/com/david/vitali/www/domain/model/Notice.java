package com.david.vitali.www.domain.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class To Represent Notice Model.
 * 
 * @author rapalisv Date: 22.07.2017
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
  private Long id;
  private String noticeName;
  private Date creationDate;
  private Date updateDate;
}
