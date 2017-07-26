package com.david.vitali.www.web.main.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.david.vitali.www.persistance.entity.NoticeEntity;
import com.david.vitali.www.persistance.repository.INoticeEntityRepository;

/**
 * Rest Controller ApiNotices.
 * 
 * @author rapalisv, karad Date: 26.07.2017
 *
 */
@RestController
@RequestMapping("api/notices")
public class NoticeRestController {
  @Autowired
  private INoticeEntityRepository iNoticesRepository;

  @RequestMapping(value = "/createNotice", method = RequestMethod.POST)
  public NoticeEntity createNotice() {
    NoticeEntity notice = NoticeEntity.builder()
        .creationDate(new Date())
        .build();
    return iNoticesRepository.save(notice);
  }

  // Hol mir die Notiz mit übergebener ID als URL localhost:9191/x
  @RequestMapping(value = "/{id}")
  public NoticeEntity getNotice(@PathVariable Long id) {
    return iNoticesRepository.findOne(id);
  }
}
