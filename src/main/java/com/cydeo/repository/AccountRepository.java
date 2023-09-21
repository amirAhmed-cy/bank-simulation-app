package com.cydeo.repository;

import com.cydeo.model.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class AccountRepository {

    public static List<Account> accountList = new ArrayList<>();

    //finds and returns all the account created
    public static List<Account> findAll() {
        return accountList;
    }

    public Account save(Account account){
        accountList.add(account);
        return account;
    }

}
