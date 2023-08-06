package com.BudgetWise.BudgetWise.repository;

import com.BudgetWise.BudgetWise.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("select t from Transaction t where t.userId = :userId")
    List<Transaction> findAllTransactionsByUserId(@Param("userId") UUID userId);

    void deleteTransactionById(UUID id);
}