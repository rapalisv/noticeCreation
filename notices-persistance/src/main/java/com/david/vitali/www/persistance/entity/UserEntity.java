package com.david.vitali.www.persistance.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Class UserEntity Represent The Table User In The Database.
 * 
 * @author rapalisv Date: 26.07.2017
 *
 */
@Data
@Builder
@ToString(exclude={"notices"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID", nullable = false, unique = true, updatable = false)
  private Long id;

  @Column(name = "NAME", length = 45, updatable = true)
  private String name;

  @Column(name = "PASSWORD", length = 45, updatable = true)
  private String password;

  @Column(name = "EMAIL", length = 45, updatable = true, unique = true)
  private String email;

  @Column(name = "REGISTRATION_DATE", nullable = false)
  private Date registrationDate;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "USER_HAS_NOTICE", joinColumns = {@JoinColumn(name = "USER_ID")},
      inverseJoinColumns = {@JoinColumn(name = "NOTICE_ID")})
  private List<NoticeEntity> notices;
}
