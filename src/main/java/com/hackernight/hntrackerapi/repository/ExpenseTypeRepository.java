package com.hackernight.hntrackerapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.hackernight.hntrackerapi.beans.ExpenseType;

public interface ExpenseTypeRepository extends CrudRepository<ExpenseType, Integer> {

}
