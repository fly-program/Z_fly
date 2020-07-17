package com.cloud.service;

import com.cloud.entity.Data;
import com.cloud.entity.SearchSentinel1;
import com.cloud.entity.Sentinel;

import java.util.Date;
import java.util.List;

public interface DataService {
    //添加Sentinel
    public String addSentinel(Sentinel sentinel);
    //添加data
    public String addData(Date data);

    //查询data条目
    public List<Data> searchData_1(SearchSentinel1 sentinel1);
    public List<Data> searchData_2(SearchSentinel1 sentinel2);
    public List<Data> searchData_3(SearchSentinel1 sentinel3);

    //删除Sentinel条目
    public String deleteSentinel(Sentinel sentinel);
    //删除data条目
    public String deleteData(Date data);
}
