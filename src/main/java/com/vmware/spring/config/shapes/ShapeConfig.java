package com.vmware.spring.config.shapes;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@ConstructorBinding
@ConfigurationProperties(prefix = "shape")
@Validated
public class ShapeConfig {

    @NotBlank
    private final String favorite;

    @NotNull
    @Size(min = 1)
    private final List<String> types;



    // Contructor, getters
    public ShapeConfig(String favorite, List<String> types) {
        this.favorite = favorite;
        this.types = types;
    }

    public String getFavorite() {
        return favorite;
    }

    public List<String> getTypes() {
        return types;
    }
}
