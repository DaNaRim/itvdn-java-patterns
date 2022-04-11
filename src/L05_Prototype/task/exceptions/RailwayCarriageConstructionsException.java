package L05_Prototype.task.exceptions;

public class RailwayCarriageConstructionsException extends RuntimeException {


    public RailwayCarriageConstructionsException(String message) {
        super("Can not construct carriage: " + message);
    }
}
