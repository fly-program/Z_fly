package com.cloud.controller;

import com.cloud.entity.Notice;
import com.cloud.service.NoticeService;
import com.cloud.service.impl.NoticeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/notice")
@Controller
public class NoticeController {
    @Autowired
    private NoticeServiceImpl noticeService;
    @RequestMapping(value="/byNoticename")
    public String findNotice(String notice_name,Model model){
     Notice notice=noticeService.findByNoticeName(notice_name);
        System.out.println("22222222"+notice.getNotice_comments());
        model.addAttribute("notice",notice);
        return "success";
    }


}
