package uet.springboot.identist.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@MappedSuperclass
public class Person{

    @Column(name = "firstName")
    @NotEmpty
    protected String firstName;

    @Column(name = "lastName")
    @NotEmpty
    protected String lastName;

    @Column(name = "gender")
    @NotEmpty
    protected String gender;

    @Column(name = "birthDate")
    @NotEmpty
    protected LocalDate birthDate;

    @Column(name = "address")
    @NotEmpty
    protected String address;

    @Column(name = "phone")
    @NotEmpty
    protected String phone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
