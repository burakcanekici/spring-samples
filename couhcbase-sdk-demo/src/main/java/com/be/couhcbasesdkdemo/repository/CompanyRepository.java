package com.be.couhcbasesdkdemo.repository;

import com.be.couhcbasesdkdemo.model.entity.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, String> {

}
