package com.vmware.spring.config.shapes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/shapes")
public class ShapeController {

    private final ShapeConfig shapeConfig;

    public ShapeController(ShapeConfig shapeConfig) {
        this.shapeConfig = shapeConfig;
    }

    @GetMapping
    public ResponseEntity<List<String>> getAll() {
        return ResponseEntity.ok(shapeConfig.getTypes());
    }

    @GetMapping("/favorite")
    public ResponseEntity<String> getFavorite() {
        return ResponseEntity.ok(shapeConfig.getFavorite());
    }
}
