package com.hackernight.hntrackerapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackernight.hntrackerapi.beans.Expense;
import com.hackernight.hntrackerapi.service.ExpenseService;

@RestController
@CrossOrigin("*")
public class ExpenseCtrl {

	@Autowired
	private ExpenseService expService;
	
	// CREATE
	@PostMapping("expense/create")
	public ResponseEntity<HttpStatus> newExpense(@RequestBody Expense expense) {
		System.out.println("expensesCtrl create: " + expense);
		expService.persistExpense(expense);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	// GET
	@GetMapping(value="expense/{id}/life")
	public ResponseEntity<List<Expense>> expenseslife(@PathVariable String id){
		System.out.println("expensesCtrl for " + id);
		List<Expense> userExpenses = expService.findAllExpensesByUserId(id);
		
		return new ResponseEntity<List<Expense>>(userExpenses, HttpStatus.OK);
	}
	
	@GetMapping(value="expense/{id}")
	public ResponseEntity<List<Expense>> expensesDefaultAll(@PathVariable String id){
		System.out.println("expensesCtrl for " + id);
		List<Expense> userExpenses = expService.findAllExpensesByUserId(id);
		
		return new ResponseEntity<List<Expense>>(userExpenses, HttpStatus.OK);
	}
	
	@GetMapping(value="expense/{id}/year")
	public ResponseEntity<Double> expensesYear(@PathVariable String id){
		System.out.println("expensesCtrl for " + id);
//		List<Expense> userExpenses = expService.findAllExpensesByUserId(id);
		
		return new ResponseEntity<Double>(500.00, HttpStatus.OK);
	}
	
}
