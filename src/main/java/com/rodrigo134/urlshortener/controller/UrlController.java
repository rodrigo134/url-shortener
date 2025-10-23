package com.rodrigo134.urlshortener.controller;


import com.rodrigo134.urlshortener.dto.ShortenUrlRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {


    @PostMapping(value = "/shorten-url")
    public ResponseEntity<Void> shortenUrl(@RequestBody ShortenUrlRequest request) {
        return ResponseEntity.ok().build();
    }
}
