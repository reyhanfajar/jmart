package com.FajarJmartPK.controller;

import com.FajarJmartPK.Algorithm;
import com.FajarJmartPK.JsonTable;
import com.FajarJmartPK.Store;
import com.FajarJmartPK.dbjson.JsonAutowired;
import org.springframework.web.bind.annotation.*;

import com.FajarJmartPK.Account;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
class AccountController implements BasicGetController<Account>
{
    @JsonAutowired(value=Account.class, filepath="db/account.json")
    public static JsonTable<Account> accountTable;

    public static final String REGEX_EMAIL    = "(?!.\\.{2,})(?!\\.)[0-9A-z.&~*]+@\\w+([.-]?\\w+)+$";
    public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d][^-\\s]{7,}$";

    public static final Pattern REGEX_PATTERN_EMAIL    = Pattern.compile(REGEX_EMAIL);
    public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);

    @Override
    public JsonTable<Account> getJsonTable() { return accountTable; }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    Account login
            (
                    @RequestParam String email,
                    @RequestParam String password
            )
    {
        Account acc = Algorithm.<Account>find(accountTable, obj -> obj.email.equals(email));
        return acc != null && acc.password.equals(password) ? acc : null;
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    Account register
            (
                    @RequestParam String name,
                    @RequestParam String email,
                    @RequestParam String password
            )
    {
        if
        (
                name.isBlank() ||
                        !REGEX_PATTERN_EMAIL.matcher(email).matches() ||
                        !REGEX_PATTERN_PASSWORD.matcher(password).matches() ||
                        Algorithm.<Account>exists(accountTable, obj -> obj.email.equals(email))
        )
        { return null; }

        Account acc = new Account(name, email, password, 0);
        accountTable.add(acc);
        return acc;
    }

    @RequestMapping(value="/{id}/registerStore", method=RequestMethod.POST)
    Store registerStore
            (
                    @PathVariable int id,
                    @RequestParam String name,
                    @RequestParam String address,
                    @RequestParam String phoneNumber
            )
    {
        Account acc = Algorithm.<Account>find(accountTable, obj -> obj.id == id);
        if (acc == null || acc.store != null)
            return null;

        acc.store = new Store(name, address, phoneNumber);
        return acc.store;
    }

    @RequestMapping(value="/{id}/topUp", method=RequestMethod.POST)
    boolean topUp
            (
                    @PathVariable int id,
                    @RequestParam double balance
            )
    {
        Account acc = Algorithm.<Account>find(accountTable, obj -> obj.id == id);
        if (acc == null)
            return false;
        acc.balance += balance;
        return true;
    }
}
