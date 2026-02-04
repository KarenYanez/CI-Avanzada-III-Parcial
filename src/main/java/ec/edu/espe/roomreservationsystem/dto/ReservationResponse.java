package ec.edu.espe.roomreservationsystem.dto;

public class ReservationResponse {

    private final String reservationId;
    private final String roomCode;
    private final String reservedByEmail;
    private final int hours;
    private final String status;


    //Constructor
    public ReservationResponse(String reservationId, String roomCode,
                               String reservedByEmail, int hours, String status) {
        this.reservationId = reservationId;
        this.roomCode = roomCode;
        this.reservedByEmail = reservedByEmail;
        this.hours = hours;
        this.status = status;
    }


    //Getters
    public String getReservationId() {
        return reservationId;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public String getReservedByEmail() {
        return reservedByEmail;
    }


    public int getHours() {
        return hours;
    }

    public String getStatus() {
        return status;
    }

}
