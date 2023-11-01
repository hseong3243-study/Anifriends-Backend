package com.clova.anifriends.domain.recruitment.support.fixture;

import com.clova.anifriends.domain.recruitment.Recruitment;
import com.clova.anifriends.domain.shelter.Shelter;
import java.time.LocalDateTime;
import java.util.List;

public class RecruitmentFixture {

    private static final LocalDateTime NOW = LocalDateTime.now();
    private static final String RECRUITMENT_TITLE = "recruitmentTitle";
    private static final String RECRUITMENT_CONTENT = "recruitmentContent";
    private static final LocalDateTime START_TIME = NOW.plusDays(1);
    private static final LocalDateTime END_TIME = START_TIME.plusHours(2);
    private static final LocalDateTime DEADLINE = NOW.plusHours(5);
    private static final int CAPACITY = 10;
    private static final List<String> IMAGE_URL_LIST = List.of("imageUrl1", "imageUrl2");

    public static Recruitment recruitment(Shelter shelter) {
        return new Recruitment(
            shelter,
            RECRUITMENT_TITLE,
            CAPACITY,
            RECRUITMENT_CONTENT,
            START_TIME,
            END_TIME,
            DEADLINE,
            IMAGE_URL_LIST
        );
    }

}