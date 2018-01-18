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

@Entity
@Table(name = "EXPENSE")
public class Expense {

	@Id
	@SequenceGenerator(name = "EXPENSE_SEQ", sequenceName = "EXPENSE_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXPENSE_SEQ")
	@Column(name = "EXPENSE_ID")
	private int expenseId;
	private String description;
	private Date date;
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "IS_ACTIVE")
	private boolean isActive;

	private int occurs;
	@ManyToOne(fetch = FetchType.EAGER)
	private ExpenseType expenseType;

	public Expense() {
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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
		return "Expense [expenseId=" + expenseId + ", description=" + description + ", date=" + date + ", userId="
				+ userId + ", isActive=" + isActive + ", occurs=" + occurs + ", expenseType=" + expenseType + "]";
	}

}
