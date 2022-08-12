package co.firmareal.controller;

import co.firmareal.model.request.account.AccountDetailRequestModel;
import co.firmareal.model.response.account.AccountRest;
import co.firmareal.service.AccountService;
import co.firmareal.shared.dto.account.AccountDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("restapi/v1.0/accounts")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping
    public String getAccount() {
        return "GetUser was called";
    }

    @PostMapping

    public AccountRest createAccount(@RequestBody AccountDetailRequestModel accountDetails) {

        AccountRest returnValue = new AccountRest();

        AccountDto accountDto = new AccountDto();
        BeanUtils.copyProperties(accountDetails,accountDto);

        AccountDto createAccount = accountService.createAccount(accountDto);
        BeanUtils.copyProperties(createAccount,returnValue);

        return returnValue;
    }

    @PutMapping
    public String updateAccount() {
        return "Update User was called";
    }

    @DeleteMapping
    public String deleteAccount(){
        return "Delete user was called";
    }
}
