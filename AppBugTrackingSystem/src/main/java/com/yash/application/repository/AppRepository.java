package com.yash.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.application.entity.AppEntity;

public interface AppRepository extends CrudRepository<AppEntity, Integer> {

}
