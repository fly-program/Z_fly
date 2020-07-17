package com.cloud.service;

import com.cloud.entity.Notice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoticeService {
    public Notice findByNoticeName(String notice_name);
    public List<Notice>findAll();//查找所有公告信息
    public String updateInfo(Notice notice);//修改公告信息
    public String addNotice(Notice notice);//添加公告
    public String deleteInfo(Notice notice);//删除公告信息
}
