package org.example.tz1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.Document;


@RestController
@Slf4j
public class CrpApi {

    @PostMapping(value = "/api/v3/lk/documents/create")
    public ResponseEntity<?> createFile(@RequestBody String json) {

        return ResponseEntity.ok("Success upload");
    }
}
