package com.example.dev.davron.springbootstart2710.web.rest;

import com.example.dev.davron.springbootstart2710.model.Transaction;
import com.example.dev.davron.springbootstart2710.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TransactionResource {

    private final TransactionService transactionService;

    public TransactionResource(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/transactions")
    public ResponseEntity getMessage() {
        return ResponseEntity.ok(transactionService.getAll());
    }

    @PostMapping("/transactions")
    public ResponseEntity create(@RequestBody Transaction transaction) {
        return ResponseEntity.ok(transactionService.saveExchange(transaction));
    }

  @PutMapping("/transactions")
    public ResponseEntity update(@RequestBody Transaction transaction) {
        return ResponseEntity.ok(transactionService.update(transaction));
    }

}
