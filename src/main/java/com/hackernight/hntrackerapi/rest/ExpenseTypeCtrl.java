package com.hackernight.hntrackerapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackernight.hntrackerapi.beans.ExpenseType;
import com.hackernight.hntrackerapi.service.ExpenseTypeService;

@RestController
public class ExpenseTypeCtrl {

	@Autowired
	private ExpenseTypeService etService; 
	
	@PostMapping("/expensetype/create")
	public ResponseEntity<HttpStatus> newExpenseType(@RequestBody ExpenseType expenseType){
		etService.newExpenseType(expenseType);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("/expensetype/all")
	public ResponseEntity<List<ExpenseType>> getAllExpenseType(){
		return new ResponseEntity<>(etService.getAllExpenseType(), HttpStatus.OK);
	}
}
