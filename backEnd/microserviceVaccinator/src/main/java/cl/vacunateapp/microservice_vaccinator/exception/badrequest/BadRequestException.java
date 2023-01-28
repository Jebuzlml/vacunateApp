package cl.vacunateapp.microservice_vaccinator.exception.badrequest;

public class BadRequestException extends RuntimeException {

    public static final String DESCRIPTION = "Bad Request Exception (400)";

    public BadRequestException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }
}
