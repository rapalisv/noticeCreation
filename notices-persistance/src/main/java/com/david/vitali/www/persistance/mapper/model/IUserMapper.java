package com.david.vitali.www.persistance.mapper.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.david.vitali.www.domain.model.User;
import com.david.vitali.www.persistance.entity.UserEntity;
import com.david.vitali.www.persistance.mapper.CentralMapperConfig;

/**
 * User Mapping To UserEntity.
 * 
 * @author rapalisv Date: 26.07.2017
 *
 */
@Mapper(config = CentralMapperConfig.class, componentModel = "spring")
public interface IUserMapper {
  IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

  User userEntityToUser(UserEntity userEntity);

  UserEntity userToUserEntity(User user);
}
