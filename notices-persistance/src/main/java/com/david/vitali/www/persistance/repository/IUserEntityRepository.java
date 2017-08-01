package com.david.vitali.www.persistance.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.david.vitali.www.persistance.entity.UserEntity;
import java.lang.String;
import java.util.List;

/**
 * Repository For UserEntity.
 * 
 * @author rapalisv Date: 26.07.2017
 *
 */
@Repository
public interface IUserEntityRepository extends CrudRepository<UserEntity, Long> {
  List<UserEntity> findByEmail(String email);

  List<UserEntity> findByNoticesId(Long id);
}
