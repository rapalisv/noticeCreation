package com.david.vitali.www.persistance.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.david.vitali.www.persistance.entity.UserEntity;

@RepositoryRestResource
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {

}
