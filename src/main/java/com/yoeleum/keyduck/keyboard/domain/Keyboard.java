package com.yoeleum.keyduck.keyboard.domain;

import com.yoeleum.keyduck.keyboard.domain.like.Like;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Keyboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    private String thumbnailImg;
    private String descriptionImg;
    private String name;

    @Embedded
    private KeyboardMeta keyboardMeta;

}
