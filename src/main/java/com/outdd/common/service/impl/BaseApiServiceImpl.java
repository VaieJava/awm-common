package com.outdd.common.service.impl;

import com.outdd.common.service.BaseApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.List;

@Slf4j
public class BaseApiServiceImpl<D extends Serializable> implements BaseApiService<D> {

    @Override

    public D save(D o) {
        return getRepository().save(o);
    }

    @Override
    public List<D> findAll() {
        return getRepository().findAll();
    }

    @Override
    public List<D> findAll(Sort var1) {
        return getRepository().findAll(var1);
    }

    @Override
    public List<D> findAllById(Iterable<Long> var1) {
        return getRepository().findAllById(var1);
    }

    @Override
    public <S extends D> List<S> saveAll(Iterable<S> var1) {
        return getRepository().saveAll(var1);
    }

    @Override
    public void flush() {
        getRepository().flush();
    }

    @Override
    public <S extends D> S saveAndFlush(S var1) {
        return getRepository().saveAndFlush(var1);
    }

    @Override
    public void deleteInBatch(Iterable<D> var1) {
        getRepository().deleteInBatch(var1);
    }

    @Override
    public void deleteAllInBatch() {
        getRepository().deleteAllInBatch();
    }

    @Override
    public D getOne(Long var1) {
        return getRepository().getOne(var1);
    }

    @Override
    public <S extends D> List<S> findAll(Example<S> var1) {
        return getRepository().findAll(var1);
    }

    @Override
    public <S extends D> List<S> findAll(Example<S> var1, Sort var2) {
        return getRepository().findAll(var1,var2);
    }
}
