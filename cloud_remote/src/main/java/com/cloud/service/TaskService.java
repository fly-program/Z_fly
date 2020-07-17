package com.cloud.service;

import com.cloud.entity.Task;

import java.util.List;

public interface TaskService {
    //添加任务
    public String addTask(Task task);
    //删除任务
    public String deleteTask(Task task);
    //更新用户下载次数
    public  String updateDownNum();
    //查询任务
    public List<Task> findTask(String Type);

    //查询下载（fpt中存在的）
    public List<Task> findDownLoad();
    //添加下载条目
    public String addDownLoad();
    //删除下载条目
    public String deleteDownLoad();



}
