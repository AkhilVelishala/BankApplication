package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Bank;
@Repository
public interface Bankrepo extends  JpaRepository<Bank,String> {

}
