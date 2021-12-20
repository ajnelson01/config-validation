package com.vmware.spring.config.colors;

import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/color")
@Profile("color")
public class ColorController {

    private final ColorConfig colorConfig;

    public ColorController(ColorConfig colorConfig) {
        this.colorConfig = colorConfig;
    }

    @GetMapping
    public ResponseEntity<String> getAppColor() {
        return ResponseEntity.ok(colorConfig.getAppColor());
    }
}
