package com.hackernight.hntrackerapi.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EXPENSE_TYPE")
public class ExpenseType {

	@Id
	@Column(name="EXPENSE_TYPE_ID")
	private int expenseTypeId;
	private String type;
	
	
	public ExpenseType() {}

	public int getExpenseTypeId() {
		return expenseTypeId;
	}

	public void setExpenseTypeId(int expenseTypeId) {
		this.expenseTypeId = expenseTypeId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ExpenseType [expenseTypeId=" + expenseTypeId + ", type=" + type + "]";
	}

	
	
}
