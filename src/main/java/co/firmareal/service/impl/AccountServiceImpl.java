package co.firmareal.service.impl;

import co.firmareal.AccountRepository;
import co.firmareal.entity.AccountEntity;
import co.firmareal.service.AccountService;
import co.firmareal.shared.dto.account.AccountDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountDto account) {

        AccountEntity accountEntity = new AccountEntity();
        BeanUtils.copyProperties(account,accountEntity);

        accountEntity.setSuffixName("suffix");
        accountEntity.setUuid(UUID.fromString("test_uuid"));

        AccountEntity storedAccountDetails = accountRepository.save(accountEntity);

        AccountDto returnValue = new AccountDto();
        BeanUtils.copyProperties(storedAccountDetails,returnValue);


        return returnValue;
    }
}
