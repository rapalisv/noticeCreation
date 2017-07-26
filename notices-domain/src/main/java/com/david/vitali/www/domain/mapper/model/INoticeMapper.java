package com.david.vitali.www.domain.mapper.model;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.david.vitali.www.domain.mapper.CentralMapperConfig;
import com.david.vitali.www.domain.model.Notice;
import com.david.vitali.www.persistance.entity.NoticeEntity;


/**
 * Notice Mapping To NoticeEntity.
 * 
 * @author rapalisv Date: 26.07.2017
 *
 */
@Mapper(config = CentralMapperConfig.class, componentModel = "spring")
public interface INoticeMapper {
  INoticeMapper INSTANCE = Mappers.getMapper(INoticeMapper.class);

  NoticeEntity noticeEnityToNotice(Notice notice);

  Notice noticeToNoticeEntity(NoticeEntity noticeEntity);
}
