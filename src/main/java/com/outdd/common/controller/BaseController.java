package com.outdd.common.controller;

import com.outdd.common.service.BaseApiService;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@RestController
public class BaseController<D extends Serializable> {
    public BaseApiService<D> baseApiService;
    
    public void setBaseApiService(BaseApiService baseApiService){
        this.baseApiService = baseApiService;
    }

    public D save(D o) {
        return baseApiService.save(o);
    }

    
    public List<D> findAll() {
        return baseApiService.findAll();
    }

    
    public List<D> findAll(Sort var1) {
        return baseApiService.findAll(var1);
    }

    
    public List<D> findAllById(Iterable<Long> var1) {
        return baseApiService.findAllById(var1);
    }

    
    public <S extends D> List<S> saveAll(Iterable<S> var1) {
        return baseApiService.saveAll(var1);
    }

    
    public void flush() {
        baseApiService.flush();
    }

    
    public <S extends D> S saveAndFlush(S var1) {
        return baseApiService.saveAndFlush(var1);
    }

    
    public void deleteInBatch(Iterable<D> var1) {
        baseApiService.deleteInBatch(var1);
    }

    
    public void deleteAllInBatch() {
        baseApiService.deleteAllInBatch();
    }

    
    public D getOne(Long var1) {
        return baseApiService.getOne(var1);
    }

    
    public <S extends D> List<S> findAll(Example<S> var1) {
        return baseApiService.findAll(var1);
    }

    
    public <S extends D> List<S> findAll(Example<S> var1, Sort var2) {
        return baseApiService.findAll(var1,var2);
    }
}
