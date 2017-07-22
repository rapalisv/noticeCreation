package com.david.vitali.www.web.data.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "NOTICE")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoticeEntity {
  @Id
  @Column(name = "NOTICE_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;
  @Column(name = "TEXT")
  private String text;
  @Column(name = "CREATION_DATE")
  @Temporal(TemporalType.TIME)
  private Date creationDate;
  @Column(name = "CHANGED_DATA")
  @Temporal(TemporalType.TIME)
  private Date changedDate;
}