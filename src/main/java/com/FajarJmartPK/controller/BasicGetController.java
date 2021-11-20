package com.FajarJmartPK.controller;

import com.FajarJmartPK.Algorithm;
import com.FajarJmartPK.JsonTable;
import com.FajarJmartPK.Serializable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BasicGetController <T extends Serializable>{
    @GetMapping("/{id}")
    default T getById(@PathVariable int id){
        return (T) Algorithm.<T>find(getJsonTable(), (e) -> e.id == id);
    }

    JsonTable<T> getJsonTable();
    @GetMapping("/page")
    default List<T> getPage (int page, int pageSize){
        return null;
    }

}
