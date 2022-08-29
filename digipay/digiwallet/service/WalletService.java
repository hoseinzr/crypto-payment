package ir.digipay.digiwallet.service;

import ir.digipay.digiwallet.model.*;
import ir.digipay.digiwallet.repository.TransactionRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;

public class WalletService {
    protected final TransactionRepository transactionRepository;

    public WalletService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public boolean addTransaction(Transaction transaction) throws IllegalArgumentException {
        // TODO: Implement
        return false;
    }

    public List<Transaction> getTransactions(Wallet wallet) {
        // TODO: Implement
        return null;
    }

    public List<Transaction> getTransactions(Wallet wallet, Predicate<Transaction> predicate) {
        // TODO: Implement
        return null;
    }

    public BigDecimal getBalance(Wallet wallet) {
        // TODO: Implement
        return null;
    }

    public boolean setTransactionStatus(Transaction transaction, TransactionStatus status) {
        // TODO: Implement
        return false;
    }
}
