package com.group7ooec.gamevendor.repository;

import com.group7ooec.gamevendor.model.Reviews;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ReviewRepository extends CrudRepository<Reviews, Long> {

}
