package com.cydeo.repository;

import com.cydeo.exception.RecordNotFoundException;
import com.cydeo.model.Account;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    public Account findById(UUID id) {
        //write a method that finds the account inside the list, if not
        //throw RecordNotFoundException

        return accountList.stream().filter(account -> account.getId().equals(id))
                .findAny().orElseThrow(()-> new RecordNotFoundException("Account does not exist in Db"));

    }



}
