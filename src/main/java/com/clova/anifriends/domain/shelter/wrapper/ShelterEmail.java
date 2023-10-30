package com.clova.anifriends.domain.shelter.wrapper;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ShelterEmail {

    @Column(name = "email")
    private String email;

    protected ShelterEmail() {
    }

    public ShelterEmail(String value) {
        this.email = value;
    }

}