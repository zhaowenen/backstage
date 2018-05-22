package com.baojia.backstage.domain.common;

import java.io.Serializable;

/**
 * @author wxr
 * @Title: ${file_name}
 * @Description: ${todo}
 * @date 2018/5/22 18:18
 */
public class BaseDto implements Serializable{
    //第几页
    private Integer pageNum = 1;
    //每页几条
    private Integer pageSize = 10;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
