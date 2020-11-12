package uet.springboot.identist.model;

import javax.persistence.*;

@Table
@Entity(name = "schedule")
public class Schedule extends ClinicEntity {
    private static final String FREE_STATUS = "free";
    private static final String OCCUPIED_STATUS = "occupied";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Room room;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Dentist dentist;

    public void setFreeStatus(){
        this.status = FREE_STATUS;
    }

    public void setOccupiedStatus() {
        this.status = OCCUPIED_STATUS;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
