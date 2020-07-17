package com.cloud.service;

import com.cloud.entity.SearchSentinel1;
import com.cloud.entity.SearchSentinel2;
import com.cloud.entity.SearchSentinel3;

import java.util.List;

public interface SearchSentinelService {
    //添加
    public String addSearchSentinel1(SearchSentinel1 sentinel1);
    public String addSearchSentinel2(SearchSentinel2 sentinel2);
    public String addSearchSentinel3(SearchSentinel3 sentinel3);
    //删除
    public String deleteSearchSentinel1(String type,int search_Id);

    public String deleteSearchSentinel2(String type,int search_Id);
    public String deleteSearchSentinel3(String type,int search_Id);
    //条件查询
    public String searchSentinel1(String type,int search_Id);

    public String searchSentinel2(String type,int search_Id);
    public String searchSentinel3(String type,int search_Id);
    //全部查询
    public List<SearchSentinel1> findAll_1 (String type, int search_Id);

    public  List<SearchSentinel2> findAll_2 (String type,int search_Id);
    public  List<SearchSentinel3> findAll_3(String type,int search_Id);
}
