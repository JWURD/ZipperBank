package io.zipcoder.services;

import io.zipcoder.Account;
import io.zipcoder.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }

    public List<Account> getAllAccountsForACutomer(Long id) {
        List<Account> accounts = new ArrayList<>();
        accountRepository.findOne(id);
        return accounts;
    }

    public void createAccount(Account account) {
        accountRepository.save(account);
    }

    public Account getAccount(Long id) {
        return accountRepository.findOne(id);
    }

    public void updateAccount(Long id, Account theAccount){
        accountRepository.save(theAccount);
    }

    public void deleteAccount(Long id){
        accountRepository.delete(id);
    }

}
