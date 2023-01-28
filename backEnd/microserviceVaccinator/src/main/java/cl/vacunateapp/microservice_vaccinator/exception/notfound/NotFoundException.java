package cl.vacunateapp.microservice_vaccinator.exception.notfound;

public class NotFoundException extends RuntimeException{

    public static final String DESCRIPTION = "Not Found Exception (404)";

    public NotFoundException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }
}
