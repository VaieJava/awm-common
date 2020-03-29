package com.outdd.common.service.impl;

import com.outdd.common.base.BaseResponse;
import com.outdd.common.service.BaseRestfulApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.List;

@Slf4j
public class BaseRestfulApiServiceImpl<D extends Serializable>
        implements BaseRestfulApiService<D> {
    @Override
    public BaseResponse save(D o) {
        D ro = null;
        try{
            ro = getRepository().save(o);
        }catch (Exception e){
            log.error("save error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success(ro);
    }

    @Override
    public BaseResponse findAll() {
        List<D> ro = null;
        try{
            ro = getRepository().findAll();
        }catch (Exception e){
            log.error("findAll error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success(ro);
    }

    @Override
    public BaseResponse findAll(Sort var1) {
        List<D> ro = null;
        try{
            ro = getRepository().findAll(var1);
        }catch (Exception e){
            log.error("findAll error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success(ro);
    }

    @Override
    public BaseResponse findAllById(Iterable<Long> var1) {
        List<D> ro = null;
        try{
            ro = getRepository().findAllById(var1);
        }catch (Exception e){
            log.error("findAllById error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success(ro);
    }

    @Override
    public BaseResponse saveAll(Iterable<D> var1) {
        List<D> ro = null;
        try{
            ro = getRepository().saveAll(var1);
        }catch (Exception e){
            log.error("saveAll error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success(ro);
    }

    @Override
    public BaseResponse flush() {
        try{
            getRepository().flush();
        }catch (Exception e){
            log.error("flush error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success();
    }

    @Override
    public BaseResponse saveAndFlush(D var1) {
        D ro = null;
        try{
            ro = getRepository().saveAndFlush(var1);
        }catch (Exception e){
            log.error("saveAndFlush error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success(ro);
    }

    @Override
    public BaseResponse deleteInBatch(Iterable<D> var1) {
        try{
            getRepository().deleteInBatch(var1);
        }catch (Exception e){
            log.error("deleteInBatch error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success();
    }

    @Override
    public BaseResponse deleteAllInBatch() {
        try{
            getRepository().deleteAllInBatch();
        }catch (Exception e){
            log.error("deleteAllInBatch error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success();
    }

    @Override
    public BaseResponse getOne(Long var1) {
        D ro = null;
        try{
            ro = getRepository().getOne(var1);
        }catch (Exception e){
            log.error("getOne error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success(ro);
    }

    @Override
    public BaseResponse findAll(Example<D> var1) {
        List<D> ro = null;
        try{
            ro = getRepository().findAll(var1);
        }catch (Exception e){
            log.error("findAll error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success(ro);
    }

    @Override
    public BaseResponse findAll(Example<D> var1, Sort var2) {
        List<D> ro = null;
        try{
            ro = getRepository().findAll(var1,var2);
        }catch (Exception e){
            log.error("findAll error",e);
            return BaseResponse.error();
        }
        return BaseResponse.success(ro);
    }
}
