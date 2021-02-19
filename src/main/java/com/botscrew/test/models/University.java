package com.botscrew.test.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany(targetEntity = Lector.class, cascade = CascadeType.ALL)
    @JoinColumn(name="un_id", referencedColumnName = "id")
    private List<Lector> lectors = new ArrayList<>();

    @OneToMany(targetEntity = Departament.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "un_id", referencedColumnName = "id")
    private List<Departament> departaments = new ArrayList<>();

    public University() {
    }

    public University(Long id, String name, List<Lector> lectors) {
        this.id = id;
        this.name = name;
        this.lectors = lectors;
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

    public List<Lector> getLectors() {
        return lectors;
    }

    public void setLectors(List<Lector> lectors) {
        this.lectors = lectors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(lectors, that.lectors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lectors);
    }
}
