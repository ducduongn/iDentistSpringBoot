package uet.springboot.identist.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.time.LocalTime;

@MappedSuperclass
public class ClinicEntity{
    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    protected LocalDate date;

    @DateTimeFormat(pattern = "HH:mm")
    @Column(name = "time")
    @NotEmpty
    protected LocalTime time;

    @Column(name = "status")
    @NotEmpty
    protected String status;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
