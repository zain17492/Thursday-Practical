package com.spring.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.entity.Stud;

public interface Studrepo extends CrudRepository<Stud, Integer>
{

}
