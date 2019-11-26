package com.example.test.entity;

/**
 * @author: LiuTaoYi
 * @create_time: 2019-11-26 16:14
 * @description:
 **/

public class MyBaseExample {
    private Integer currentPage;
    private Integer pageSize;


    public MyBaseExample(Integer currentPage, Integer pageSize) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
