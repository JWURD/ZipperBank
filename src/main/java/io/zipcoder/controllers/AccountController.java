package io.zipcoder.controllers;

import io.zipcoder.Account;
import io.zipcoder.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
  @Autowired
    AccountService theAccountService;

   @RequestMapping("/accounts")
    public List<Account> getAllAccounts(){
     return theAccountService.getAllAccounts();
   }

   @RequestMapping("accounts/{accountId}")
    public Account  getAccountById(@PathVariable Long id){
        return theAccountService.getAccount(id);
    }

    @RequestMapping("customers/{customerId}/accounts")
    public List<Account> getAllAccountsForCustomer(Long id) {
        return theAccountService.getAllAccounts();
    }
}
