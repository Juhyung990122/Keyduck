package com.yoeleum.keyduck.keyboard.domain;

import java.time.LocalDateTime;
import javax.persistence.Embeddable;

@Embeddable
public class KeyboardProfile {

    private LocalDateTime releaseDate;
    private String brand;
    private String connect;
    private String hotswap;
    private Integer price;
    private String led;
    private Integer arrangement;
    private Integer weight;
    private String cable;
    private Float star;
    private String switchBrand;
    private String switchColor;
    private String keycap;
    private String keycapImprint;
    private String keycapProfile;
}
