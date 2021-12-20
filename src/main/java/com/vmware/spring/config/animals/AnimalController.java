package com.vmware.spring.config.animals;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/animals")
public class AnimalController {

    private final AnimalConfig animalConfig;

    public AnimalController(AnimalConfig animalConfig) {
        this.animalConfig = animalConfig;
    }

    @GetMapping("/coolest")
    public ResponseEntity<String> getCoolest() {
        return ResponseEntity.ok(animalConfig.getCoolest());
    }

    @GetMapping("/lamest")
    public ResponseEntity<String> getLamest() {
        return ResponseEntity.ok(animalConfig.getLamest());
    }
}
