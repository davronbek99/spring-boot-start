package com.example.dev.davron.springbootstart2710.service;

import com.example.dev.davron.springbootstart2710.model.Transaction;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class TransactionService {

    private final String URI = "http://localhost:8081/api/transactions";

    public String getMessage() {
        RestTemplate restTemplate = new RestTemplate();
        String msg = restTemplate.getForObject(URI + "/test", String.class);
        return msg;
    }

    public ResponseEntity<Transaction> save(Transaction transaction) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Transaction> transaction1 = restTemplate.postForEntity(URI, transaction, Transaction.class);
        return transaction1;
    }

    public List<Transaction> getAll() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<List<Transaction>> entity = new HttpEntity<>(httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(URI + "/test", HttpMethod.GET, entity, List.class).getBody();
    }

    public Transaction saveExchange(Transaction transaction) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Transaction> entity = new HttpEntity<>(transaction,httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(URI, HttpMethod.POST, entity, Transaction.class).getBody();
    }

    public Transaction update(Transaction transaction) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Transaction> entity = new HttpEntity<>(transaction,httpHeaders);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange(URI, HttpMethod.PUT, entity, Transaction.class).getBody();
    }

}
