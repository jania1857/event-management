package pl.jania1857.eventmanagement.auth;

public record RegistrationRequest(
        String firstname,
        String lastname,
        String email,
        String password
) {
}
