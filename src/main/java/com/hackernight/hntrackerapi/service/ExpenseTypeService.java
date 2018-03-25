package com.hackernight.hntrackerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackernight.hntrackerapi.beans.ExpenseType;
import com.hackernight.hntrackerapi.repository.ExpenseTypeRepository;
import com.hackernight.hntrackerapi.util.EnumExpenseType;

@Service
public class ExpenseTypeService {

	@Autowired
	private ExpenseTypeRepository etRepo;

	/**
	 * @author hackernight
	 * @param expenseType
	 *            only allows the enums to be created
	 */
	public void newExpenseType(ExpenseType expenseType) {
		System.out.println("Enum return: " + EnumExpenseType.values()[0]);
		if (enumContainsValue(expenseType.getType())) {
			expenseType.setType(expenseType.getType().toLowerCase());
			etRepo.save(expenseType);
		} else {
			throw new IllegalArgumentException("Cannot create that Type of Expense as it does not exist");
		}
	}

	
	public List<ExpenseType> getAllExpenseType(){
		return (List<ExpenseType>) etRepo.findAll();
	}
	
	private static boolean enumContainsValue(String value) {
		for (EnumExpenseType enumExpenseType : EnumExpenseType.values()) {
			System.out.println("comparing " + value + " " + enumExpenseType);
			if (enumExpenseType.name().equalsIgnoreCase((value))) {
				return true;
			}
		}
		return false;
	}
}
