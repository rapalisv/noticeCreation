package com.david.vitali.www.web.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.vitali.www.web.data.entity.NoticeEntity;
import com.david.vitali.www.web.data.repository.INoticeRepository;

@Service
public class NoticeService {
  @Autowired
  private INoticeRepository iNoticeRepository;
  
  public NoticeEntity findNotice(Long noticeId){
    return iNoticeRepository.findOne(noticeId);
  }

}
