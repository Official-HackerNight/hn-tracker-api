package com.hackernight.hntrackerapi.util;

import java.io.Serializable;

import com.hackernight.hntrackerapi.beans.ExpenseType;

public enum EnumExpenseType implements Serializable {
	SINGLE, DAILY, WEEKLY, MONTHLY, YEARLY;
	
	public String toString() {
		switch (this) {
		case SINGLE :
			return "single";
		case DAILY :
			return "daily";
		case WEEKLY :
			return "weekly";
		case MONTHLY :
			return "MONTHLY";
		case YEARLY :
			return "YEARLY";
		}
		return null;
	}

	
}
