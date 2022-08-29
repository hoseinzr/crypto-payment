package ir.digipay.digiwallet.repository;

import ir.digipay.digiwallet.model.Transaction;

import java.util.*;
import java.util.function.Predicate;

public class TransactionRepositoryImpl implements TransactionRepository {
    @Override
    public boolean add(Transaction transaction) throws IllegalArgumentException {
        // TODO: Implement
        return false;
    }

    @Override
    public List<Transaction> getAll() {
        // TODO: Implement
        return null;

    }

    @Override
    public Transaction get(Long id) {
        // TODO: Implement
        return null;
    }

    @Override
    public List<Transaction> get(Predicate<Transaction> predicate) {
        // TODO: Implement
        return null;
    }
}
