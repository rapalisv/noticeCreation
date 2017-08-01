package com.david.vitali.www.persistance.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class NoticeEntity Represent The Table Notice In The Database.
 * 
 * @author rapalisv Date: 26.07.2017
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NOTICE")
public class NoticeEntity{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID", nullable = false, unique = true, updatable = false)
  private Long id;
  
  @Column(name = "NOTICE_NAME", length = 45, unique = true, updatable = true)
  private String noticeName;
  
  @Column(name = "CREATION_DATE", nullable = false)
  private Date creationDate;
  
  @Column(name = "UPDATE_DATE")
  private Date updateDate;
}
