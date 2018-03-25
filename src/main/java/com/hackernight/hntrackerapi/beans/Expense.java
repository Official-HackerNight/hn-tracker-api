package com.hackernight.hntrackerapi.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "EXPENSE")
public class Expense {

	@Id
	@SequenceGenerator(name = "EXPENSE_SEQ", sequenceName = "EXPENSE_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXPENSE_SEQ")
	@Column(name = "EXPENSE_ID")
	private int expenseId;

	@NotNull
	// @Size(min = 1, max = 1_000_000) for integers...
	@DecimalMin(value = "0.01")
	@DecimalMax(value = "1000000")
	@Column(nullable = false)
	private Double amount;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	private String description;
	private Date date;
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "IS_ACTIVE")
	private boolean isActive;

	private int occurs;
	@ManyToOne(fetch = FetchType.EAGER)
	private ExpenseType expenseType;

	public Expense() {
	}

	public Expense(int expenseId, Double amount, String description, Date date, String userId, boolean isActive,
			int occurs, ExpenseType expenseType) {
		super();
		this.expenseId = expenseId;
		this.amount = amount;
		this.description = description;
		this.date = date;
		this.userId = userId;
		this.isActive = isActive;
		this.occurs = occurs;
		this.expenseType = expenseType;
	}

	public Expense(int expenseId, Double amount, String description, Date date, String userId, boolean isActive,
			int occurs, String expenseType) {
		super();
		this.expenseId = expenseId;
		this.amount = amount;
		this.description = description;
		this.date = date;
		this.userId = userId;
		this.isActive = isActive;
		this.occurs = occurs;
		this.expenseType = new ExpenseType();
		this.expenseType.setType(expenseType);
	}
	
	public int getExpenseId() {
		return expenseId;
	}

	public void setExpenseId(int expenseId) {
		this.expenseId = expenseId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getOccurs() {
		return occurs;
	}

	public void setOccurs(int occurs) {
		this.occurs = occurs;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public ExpenseType getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}

	@Override
	public String toString() {
		return "Expense [expenseId=" + expenseId + ", amount=" + amount + ", description=" + description + ", date="
				+ date + ", userId=" + userId + ", isActive=" + isActive + ", occurs=" + occurs + ", expenseType="
				+ expenseType + "]";
	}

}
