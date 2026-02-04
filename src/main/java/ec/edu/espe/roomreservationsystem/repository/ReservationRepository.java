package ec.edu.espe.roomreservationsystem.repository;

import ec.edu.espe.roomreservationsystem.model.RoomReservation;

import java.util.Optional;

public interface ReservationRepository {
    
    void save(RoomReservation reservation);
    
    Optional<RoomReservation> findByRoomCode(String roomCode);
    
    boolean existsByRoomCode(String roomCode);
}
