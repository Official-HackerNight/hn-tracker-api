package com.hackernight.hntrackerapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hackernight.hntrackerapi.beans.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Integer>{

	List<Expense> findByUserId(int id);
}
