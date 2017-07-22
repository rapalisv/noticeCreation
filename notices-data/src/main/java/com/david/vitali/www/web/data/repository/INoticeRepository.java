package com.david.vitali.www.web.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.david.vitali.www.web.data.entity.NoticeEntity;

@Repository
public interface INoticeRepository extends CrudRepository<NoticeEntity, Long>{

}
