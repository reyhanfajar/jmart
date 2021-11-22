package com.FajarJmartPK.controller;

import com.FajarJmartPK.Algorithm;
import com.FajarJmartPK.JsonTable;
import org.springframework.web.bind.annotation.*;
import com.FajarJmartPK.Account;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

@RestController
    @RequestMapping("/account")

    public class AccountController implements BasicGetController<Account> {
        public static final String REGEX_EMAIL = "^[A-Za-z0-9&_*~[.]{0,1}]+@(.+)$";
        public static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
        public static final Pattern REGEX_PATTERN_EMAIL = null;
        public static final Pattern REGEX_PATTERN_PASSWORD = null;

        @jmart.goldenSample.dbjson.JsonAutowired(value = Account.class, filepath = "data/account.json")
        public static JsonTable<Account> accountTable;
        Account acc = Algorithm.<Account>find(accountTable, obj -> obj.id == id);
            if(acc == null || acc.store!=null){
                return null;
            }

        @Override
        public JsonTable<Account> getJsonTable() {
            return accountTable;
        }

        @PostMapping("/login")
        Account login
                (
                        @RequestParam String email,
                        @RequestParam String password
                )
        {
            String checkPass = null;
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(password.getBytes());
                byte[] bytes = md.digest();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < bytes.length; i++){
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }
                checkPass = sb.toString();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            if (checkPass.equals(Account.password)) {
                return login(email, password);
            }
            return null;
        }

        @PostMapping("/register")
        Account register
                (
                        @RequestParam String name,
                        @RequestParam String email,
                        @RequestParam String password
                )
        {
            String generatedPass = null;
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.update(password.getBytes());
                byte[] bytes = md.digest();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < bytes.length; i++){
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }
                generatedPass = sb.toString();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }
            return new Account(name, email, generatedPass, 0);
        }

        @PostMapping("/{id}/registerStore")
        Account registerStore
                (
                        @PathVariable int id,
                        @RequestParam String name,
                        @RequestParam String address,
                        @RequestParam String phoneNumber
                )
        {
            return null;
        }

        @PostMapping()
        Account topUp
                (
                        @RequestParam int id,
                        @RequestParam double balance
                )
        {
            return null;
        }
        //@GetMapping
        //String index() { return "account page"; }

        //@GetMapping("/{id}")
        //String getById(@PathVariable int id) { return "account id " + id + " not found!"; }
    }
