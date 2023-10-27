package com.clova.anifriends.domain.volunteer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class VolunteerImage {

    @Id
    @Column(name = "volunteer_image_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long volunteerImageId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "volunteer_id")
    private Volunteer volunteer;

    @Column(name = "image_url")
    private String imageUrl;

}