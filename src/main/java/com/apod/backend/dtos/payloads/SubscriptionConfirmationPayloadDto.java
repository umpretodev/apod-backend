package com.apod.backend.dtos.payloads;

import jakarta.validation.constraints.NotBlank;

public record SubscriptionConfirmationPayloadDto(
        @NotBlank String token
) {
}
