package uet.springboot.identist.service;

import uet.springboot.identist.model.Room;
import uet.springboot.identist.model.Schedule;
import uet.springboot.identist.model.User;
import uet.springboot.identist.model.Visit;

import java.time.LocalDate;
import java.util.Collection;

public interface ClinicService {
    User findUserByID(int userId);

    void addUser(User user);

    Visit findVisitByID(int visitId);

    void addVisit(Visit visit);

    Collection<Room> findAllRoom();

    Collection<Schedule> findScheduleByRoomAnđate(int roomNumber, LocalDate date);

    void saveVisit(Visit visit);

    void saveSchedule(Schedule schedule);
}
