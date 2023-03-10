package dev.adidahari.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
