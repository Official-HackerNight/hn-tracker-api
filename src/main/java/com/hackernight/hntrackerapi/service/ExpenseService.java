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
	
	public List<Expense> findAllExpensesByUserId(String id){
		System.out.println("expense service -findAll: " + id);
		return eRepo.findByUserId(id);
	}
	
	public void persistExpense(Expense expense) {
		System.out.println("expense service -create: " + expense);
		eRepo.save(expense);
	}
}
