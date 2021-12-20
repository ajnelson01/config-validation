package com.vmware.spring.config.animals;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@ConstructorBinding
@ConfigurationProperties(prefix = "animal")
@Validated
public class AnimalConfig {

    @Pattern(regexp = "^dog$")
    private final String coolest;

    @NotBlank
    private final String lamest;


    // Constructor, getters
    public AnimalConfig(String coolest, String lamest) {
        this.coolest = coolest;
        this.lamest = lamest;
    }

    public String getCoolest() {
        return coolest;
    }

    public String getLamest() {
        return lamest;
    }
}
