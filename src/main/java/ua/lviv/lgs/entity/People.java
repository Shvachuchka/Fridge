package ua.lviv.lgs.entity;

import javax.persistence.*;

@Entity
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private  int id_People;
    @Column
    private String namePeople;
    @Column
    private String surname;
    @Column
    private String password;
    @Transient
    private String passwordConfirm;
    @Column
    private String email;
    @Column
    private String phone;
    @Column


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Refrigerator refrigerator;


    public People(String password, String passwordConfirm) {
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }


    public People(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public People(int id_People, String namePeople, String surname) {
        this.id_People = id_People;
        this.namePeople = namePeople;
        this.surname = surname;
    }

    public int getId_People() {
        return id_People;
    }

    public void setId_People(int id_People) {
        this.id_People = id_People;
    }

    public String getNamePeople() {
        return namePeople;
    }

    public void setNamePeople(String namePeople) {
        this.namePeople = namePeople;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    @Override
    public String toString() {
        return "People{" +
                "id_People=" + id_People +
                ", namePeople='" + namePeople + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", passwordConfirm='" + passwordConfirm + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", refrigerator=" + refrigerator +
                '}';
    }
}

