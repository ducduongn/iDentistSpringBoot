package uet.springboot.identist.service;

import org.springframework.stereotype.Service;
import uet.springboot.identist.dao.*;
import uet.springboot.identist.model.Room;
import uet.springboot.identist.model.Schedule;
import uet.springboot.identist.model.User;
import uet.springboot.identist.model.Visit;


import java.time.LocalDate;
import java.util.Collection;

@Service
public class ClinicServiceImpl implements ClinicService{
    private UserDAO userDAO;
    private DentistDAO dentistDAO;
    private VisitDAO visitDAO;
    private ScheduleDAO scheduleDAO;
    private RoomDAO roomDAO;
    private RecordDAO recordDAO;

    @Override
    public User findUserByID(int userId) {
        return null;
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public Visit findVisitByID(int visitId) {
        return null;
    }

    @Override
    public void addVisit(Visit visit) {

    }

    @Override
    public Collection<Room> findAllRoom() {
        return null;
    }

    @Override
    public Collection<Schedule> findScheduleByRoomAnđate(int roomNumber, LocalDate date) {
        return null;
    }

    @Override
    public void saveVisit(Visit visit) {

    }

    @Override
    public void saveSchedule(Schedule schedule) {

    }
}
