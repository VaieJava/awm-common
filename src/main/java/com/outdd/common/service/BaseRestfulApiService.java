package com.outdd.common.service;

import com.outdd.common.base.BaseResponse;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@NoRepositoryBean
public interface BaseRestfulApiService<T>{
    default JpaRepository<T, Long> getRepository(){
        return null;
    }

    @RequestMapping("/save")
    BaseResponse save(T o);

    @RequestMapping("/findAll")
    BaseResponse findAll();

    BaseResponse findAll(Sort var1);

    @RequestMapping("/findAllById")
    BaseResponse findAllById(Iterable<Long> var1);

    @RequestMapping("/saveAll")
    BaseResponse saveAll(Iterable<T> var1);

    @RequestMapping("/saveAndFlush")
    BaseResponse flush();

    BaseResponse saveAndFlush(T var1);

    @RequestMapping("/deleteInBatch")
    BaseResponse deleteInBatch(Iterable<T> var1);

    @RequestMapping("/deleteAllInBatch")
    BaseResponse deleteAllInBatch();

    @RequestMapping("/getOne")
    BaseResponse getOne(Long var1);

    BaseResponse findAll(Example<T> var1);

    BaseResponse findAll(Example<T> var1, Sort var2);
}

