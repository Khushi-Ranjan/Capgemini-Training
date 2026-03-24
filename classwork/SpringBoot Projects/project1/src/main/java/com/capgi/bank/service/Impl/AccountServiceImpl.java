package com.capgi.bank.service.Impl;

import com.capgi.bank.config.CustomMapper;
import com.capgi.bank.constants.AccountConstant;
import com.capgi.bank.entity.Account;
import com.capgi.bank.entity.dto.AccountDto;
import com.capgi.bank.entity.dto.AccountResponseDto;
import com.capgi.bank.entity.dto.ResponseDto;
import com.capgi.bank.repository.AccountRepository;
import com.capgi.bank.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.DialectOverride;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    private final ModelMapper modelMapper;

    @Override
    public void createAccount(AccountDto accountDto){
        Account account = CustomMapper.mapAccountDtoToAccount(accountDto, new Account());
        accountRepository.save(account);
    }

    @Override
    public AccountResponseDto getAccountById(Integer id){
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found"));

        return modelMapper.map(account, AccountResponseDto.class);
    }
    @Override
    public AccountResponseDto findById(Integer id){
        Account account = accountRepository.findById(id);
        .orElseThrow(() -> new AccountNotFoundException("Account not found by your id "+ id));
         return modelMapper.map(account, AccountDto.class);
    }


}
