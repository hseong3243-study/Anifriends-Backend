package com.clova.anifriends.domain.review.dto.request;

import java.util.List;

public record RegisterReviewRequest(
    Long applicationId,
    String content,
    List<String> imageUrls
) {

}
