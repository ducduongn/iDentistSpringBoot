package uet.springboot.identist.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Table
@Entity(name = "room")
public class Room{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "schedule", fetch = FetchType.LAZY)
    private Set<Schedule> scheduleList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer", fetch = FetchType.LAZY)
    private Set<Visit> visitList;

    @Column(name = "roomNumber")
    @NotEmpty
    private int roomNumber;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(Set<Schedule> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public Set<Visit> getVisitList() {
        return visitList;
    }

    public void setVisitList(Set<Visit> visitList) {
        this.visitList = visitList;
    }
}
