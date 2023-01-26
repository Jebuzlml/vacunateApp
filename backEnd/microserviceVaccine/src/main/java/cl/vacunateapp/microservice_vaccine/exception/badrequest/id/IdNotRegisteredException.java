package cl.vacunateapp.microservice_vaccine.exception.badrequest.id;

public class IdNotRegisteredException extends BadIdException {
    public static final String DESCRIPTION = "No existe un usuario registrado con el id";

    public IdNotRegisteredException(String detail) {
        super(DESCRIPTION + ": " + detail);
    }
}
