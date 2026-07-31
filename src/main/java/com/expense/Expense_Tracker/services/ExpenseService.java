package com.expense.Expense_Tracker.services;

import com.expense.Expense_Tracker.DAO.ExpenseDAO;
import com.expense.Expense_Tracker.models.Expense;

import java.time.LocalDate;
import java.util.List;

public class ExpenseService {

    private ExpenseDAO expenseDAO = new ExpenseDAO();

    public boolean addExpense(int userId,
                              double amount,
                              int categoryId,
                              int methodId,
                              String description) {

        return expenseDAO.addExpense(
                userId,
                amount,
                categoryId,
                methodId,
                description,
                LocalDate.now()
        );
    }

    public List<Expense> getAllExpenses() {
        return expenseDAO.getAllExpenses();
    }
}