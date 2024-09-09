package pl.jania1857.eventmanagement.auth;

public record LoginRequest(
        String email,
        String password
) {
}
