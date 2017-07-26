package com.david.vitali.www.persistance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.vitali.www.persistance.entity.NoticeEntity;
import com.david.vitali.www.persistance.repository.INoticeEntityRepository;

@Service
public class NoticeService {
  @Autowired
  private INoticeEntityRepository iNoticeRepository;
  
  public NoticeEntity findNotice(Long noticeId){
    return iNoticeRepository.findOne(noticeId);
  }

}
