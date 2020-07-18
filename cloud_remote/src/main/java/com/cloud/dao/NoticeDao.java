package com.cloud.dao;

import com.cloud.entity.Notice;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeDao {
    public Notice findByNoticeName(String  notice_name);
}
