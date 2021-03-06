package com.haydikodlayalim.accountservice.api;

import com.haydikodlayalim.accountservice.service.AccountService;
import com.haydikodlayalim.client.contract.AccountDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * localhost:8080/account
 * GET PUT DELETE POST
 * */
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountApi {


    private final AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountDto> get(@PathVariable("id") String id) {
        return ResponseEntity.ok(accountService.get(id));
    }

    @PostMapping
    public ResponseEntity<AccountDto> save(@RequestBody AccountDto account) {
        return ResponseEntity.ok(accountService.save(account));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AccountDto> update(@PathVariable("id")String id, @RequestBody AccountDto accountDto) {
        return ResponseEntity.ok(accountService.update(id, accountDto));
    }

    @DeleteMapping
    public void delete(String id) {
        accountService.delete(id);
    }

    @GetMapping
    public ResponseEntity<Slice<AccountDto>> get(Pageable pageable) {
        return ResponseEntity.ok(accountService.findAll(pageable));
    }

}
