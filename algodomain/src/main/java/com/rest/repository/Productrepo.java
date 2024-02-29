package com.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.Product;
@Repository
public interface Productrepo extends JpaRepository<Product,Integer> {

}
