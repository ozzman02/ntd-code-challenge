package com.ntd.constants;

public class ApplicationConstants {

    public static final String BEARER_AUTHENTICATION = "Bearer Authentication";

    public static final String BEARER = "bearer";

    public static final String JWT = "JWT";

    public static final String SECRET = "9999999B59703373367639792F423F";

    public static final String ISSUER = "NTD SOFTWARE";

    public static final String INVALID_CREDENTIALS_ERROR = "Invalid Credentials";

    public static final String ERROR = "error";

    public static final String USERNAME_NOT_FOUND_ERROR_MSG = "Username %s not found";

    public static final String AUTH_URL = "/api/auth";

    public static final String AUTH_URL_MATCHERS = "/api/auth/**";

    public static final String LOGIN = "/login";

    public static final String USER_SERVICE = "ntd-user-service";

    public static final String USER_SERVICE_URL = "/api/user";

    public static final String GET_USER_BY_USERNAME = "/getUserByUsername/{username}";

    public static final String GET_BY_USERNAME_AND_STATUS = "/getUserByUsername/{username}/{status}";

    public static final String[] IGNORED_REQUEST_MATCHERS = { "/v1/auth/**", "/swagger-resources/**",
            "/swagger-ui.html/**", "/swagger-resources/**", "/swagger-ui/**", "/v3/api-docs/**" };

    public static final String CORS_CONFIG_PATTERN = "/**";

    public static final String REACT_APP_ORIGIN = "http://localhost:3000";

    public static final String ALL = "*";

    public static final Long MAX_AGE = 3600L;
}
