package edu.ameier.hockey.security;

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTsForTheDriverQualificationServiceLayer";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/signup";
    public static final String LOG_IN_URL = "/login";
    public static final String H2_URL = "/h2-console/*";
}
