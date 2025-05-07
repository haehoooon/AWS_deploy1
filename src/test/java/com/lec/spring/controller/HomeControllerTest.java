package com.lec.spring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void hello() {
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v1", String.class);
        assertEquals ("<h1>AWS 배포 v1.1</h1>", response.getBody());
    }
}
