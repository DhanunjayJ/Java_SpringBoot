package com.dj.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.dj.model.Transaction;
import com.dj.repository.TransactionRepository;

public class TransactionService {
    
    private TransactionRepository transRepo = new TransactionRepository();

    public List<Transaction> getFilteredHistory (int accountid,String filterType){
        List<Transaction> all = transRepo.getTransactionsByAccountId(accountid);

        return all.stream()
              .filter(t -> filterType.equalsIgnoreCase("ALL") || t.getType().equalsIgnoreCase(filterType))
              .sorted(Comparator.comparing(Transaction::getAmount).reversed())
              .collect(Collectors.toList());
        
    }

    public double calculateTotalVolume(int accountId,String filterType){
        return transRepo.getTransactionsByAccountId(accountId).stream()
               .filter(t -> filterType.equalsIgnoreCase("ALL") || t.getType().equalsIgnoreCase(filterType))
               .mapToDouble(Transaction::getAmount)
               .sum();
    }

}
