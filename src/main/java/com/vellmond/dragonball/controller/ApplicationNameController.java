package com.vellmond.dragonball.controller;


import com.vellmond.dragonball.config.DragonBallConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application-name")
public class ApplicationNameController {
    private static final Logger log = LoggerFactory.getLogger(ApplicationNameController.class);

    @Autowired
    private DragonBallConfig configuration;

    @GetMapping
    public ResponseEntity<String> getApplicationName() {
        log.info("Getting application name");
        return ResponseEntity.ok(configuration.getApplicationName());
    }
}
