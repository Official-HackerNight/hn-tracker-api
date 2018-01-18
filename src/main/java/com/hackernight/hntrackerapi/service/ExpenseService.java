package com.hackernight.hntrackerapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackernight.hntrackerapi.beans.Expense;
import com.hackernight.hntrackerapi.repository.ExpenseRepository;
@Service
@Transactional
public class ExpenseService {

	@Autowired
	private ExpenseRepository eRepo;
	
	public List<Expense> findAllExpensesByUserId(int id){
		System.out.println("Service getting all expense for " + id);
		return eRepo.findByUserId(id);
	}
	
}
