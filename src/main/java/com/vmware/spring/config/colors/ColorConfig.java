package com.vmware.spring.config.colors;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Profile;

import javax.validation.constraints.NotBlank;

@ConstructorBinding
@ConfigurationProperties(prefix = "color")
//@Validated
@Profile("color")
public class ColorConfig {

    @NotBlank // no effect due to lack of @Validated annotation
    private final String appColor;


    // constructor, getter
    public ColorConfig(String appColor) {
        this.appColor = appColor;
    }

    public String getAppColor() {
        return appColor;
    }
}
