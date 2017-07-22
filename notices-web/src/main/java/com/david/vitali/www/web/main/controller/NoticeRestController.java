package com.david.vitali.www.web.main.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.vitali.www.web.data.entity.NoticeEntity;
import com.david.vitali.www.web.data.repository.INoticeRepository;

@RestController
@RequestMapping("api/notices")
public class NoticeRestController {
  @Autowired
  private INoticeRepository noticeRepo;

  @RequestMapping()
  public String getNotices() {
    return "Hello Notices!!!";
  }

  @RequestMapping("/createNotice")
  public NoticeEntity createNotice() {
    NoticeEntity notice = NoticeEntity.builder()
        .creationDate(new Date())
        .text("Notice 1")
        .build();

    return noticeRepo.save(notice);
  }
}
