package com.mg.demo.core;

import com.github.pagehelper.PageInfo;

import java.util.List;
/**
 * Created by magang on 2017/2/8.
 */
public class DataGridPage<T> {
    private final List<T> rows;
    private final Long total;

    public DataGridPage(List<T> rows, Long total) {
        this.rows = rows;
        this.total = total;
    }

    public static <T> DataGridPage<T> create(List<T> list) {
        PageInfo<T> page=new PageInfo<T>(list);
        return new DataGridPage(page.getList(), page.getTotal());
    }

    public List<T> getRows() {
        return this.rows;
    }

    public Long getTotal() {
        return this.total;
    }
}
