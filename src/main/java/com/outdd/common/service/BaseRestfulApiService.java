package com.outdd.common.service;

import com.outdd.common.base.BaseResponse;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BaseRestfulApiService<T>{
    default JpaRepository<T, Long> getRepository(){
        return null;
    }

    BaseResponse save(T o);

    BaseResponse findAll();

    BaseResponse findAll(Sort var1);

    BaseResponse findAllById(Iterable<Long> var1);

    BaseResponse saveAll(Iterable<T> var1);

    BaseResponse flush();

    BaseResponse saveAndFlush(T var1);

    BaseResponse deleteInBatch(Iterable<T> var1);

    BaseResponse deleteAllInBatch();

    BaseResponse getOne(Long var1);

    BaseResponse findAll(Example<T> var1);

    BaseResponse findAll(Example<T> var1, Sort var2);
}

