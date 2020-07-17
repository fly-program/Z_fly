package com.cloud.service.impl;

import com.cloud.dao.NoticeDao;
import com.cloud.entity.Notice;
import com.cloud.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{
    @Autowired
    private NoticeDao noticeDao;
    @Override
    public Notice findByNoticeName(String notice_name) {
        System.out.println("11111111"+notice_name);
        return noticeDao.findByNoticeName(notice_name);
    }

    @Override
    public List<Notice> findAll() {
        return null;
    }

    @Override
    public String updateInfo(Notice notice) {
        return null;
    }

    @Override
    public String addNotice(Notice notice) {
        return null;
    }

    @Override
    public String deleteInfo(Notice notice) {
        return null;
    }
}
