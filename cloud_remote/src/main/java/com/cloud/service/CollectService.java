package com.cloud.service;

import com.cloud.entity.Collect;
import com.cloud.entity.Group;

import java.util.List;

public interface CollectService {
    //新建收藏夹
    public String addGroup(Group group);
    //删除收藏夹
    public String deleteGroup(Group group);
    //添加收藏条目
    public String addCollect(Collect collect);
    //删除收藏夹中的条目
    public String deleteCollect(Collect collect);
    //查询所有的收藏夹
    public List<Group> findAllGroup();
    //查询收藏的所有条目
    public List<Collect> findAllCollect();
}
