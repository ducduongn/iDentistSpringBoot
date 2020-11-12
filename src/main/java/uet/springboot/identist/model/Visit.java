package uet.springboot.identist.model;


import javax.persistence.*;

@Table
@Entity(name = "visit")
public class Visit extends ClinicEntity {
    private static final String CURRENT_STATUS = "current";
    private static final String COMPLETED_STATUS = "completed";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Room room;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Dentist dentist;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Record record;


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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCurrentStatus() {
        this.status = CURRENT_STATUS;
    }

    public void setCompletedStatus() {
        this.status = COMPLETED_STATUS;
    }
}
