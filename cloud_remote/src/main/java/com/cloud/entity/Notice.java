package com.cloud.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Notice {
    private int notice_id;
    private String notice_name;
    private Date notice_date;
    private  String notice_comments;

    public int getNotice_id() {
        return notice_id;
    }

    public void setNotice_id(int notice_id) {
        this.notice_id = notice_id;
    }

    public String getNotice_name() {
        return notice_name;
    }

    public void setNotice_name(String notice_name) {
        this.notice_name = notice_name;
    }

    public Date getNotice_date() {
        return notice_date;
    }

    public void setNotice_date(Date notice_date) {
        this.notice_date = notice_date;
    }

    public String getNotice_comments() {
        return notice_comments;
    }

    public void setNotice_comments(String notice_comments) {
        this.notice_comments = notice_comments;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "notice_id=" + notice_id +
                ", notice_name='" + notice_name + '\'' +
                ", notice_date=" + notice_date +
                ", notice_comments='" + notice_comments + '\'' +
                '}';
    }
}
