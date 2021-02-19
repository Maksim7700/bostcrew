package com.botscrew.test.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Degree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(targetEntity = Lector.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "deg_id", referencedColumnName = "id")
    private List<Lector> lectorList = new ArrayList<>();

    public Degree() {
    }

    public Degree(Long id, String name, List<Lector> lectorList) {
        this.id = id;
        this.name = name;
        this.lectorList = lectorList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lector> getLectorList() {
        return lectorList;
    }

    public void setLectorList(List<Lector> lectorList) {
        this.lectorList = lectorList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Degree degree = (Degree) o;
        return Objects.equals(id, degree.id) && Objects.equals(name, degree.name) && Objects.equals(lectorList, degree.lectorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lectorList);
    }
}
