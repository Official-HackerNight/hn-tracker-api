package com.hackernight.hntrackerapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hackernight.hntrackerapi.beans.Expense;
import com.hackernight.hntrackerapi.service.ExpenseService;

@RestController
public class ExpenseCtrl {

	@Autowired
	private ExpenseService expService;
	
	@GetMapping(value="expense/{id}")
	public ResponseEntity<List<Expense>> expenses(@PathVariable int id){
		System.out.println("expensesCtrl for " + id);
		List<Expense> userExpenses = expService.findAllExpensesByUserId(id);
		
		return new ResponseEntity<List<Expense>>(userExpenses, HttpStatus.OK);
	}
}
