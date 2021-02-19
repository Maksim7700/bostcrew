package com.botscrew.test.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String head;

    @OneToMany(targetEntity = Lector.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "dep_id", referencedColumnName = "id")
    private List<Lector> lectorList = new ArrayList<>();

    public Departament() {
    }

    public Departament(Long id, String name, String head, List<Lector> lectorList) {
        this.id = id;
        this.name = name;
        this.head = head;
        this.lectorList = lectorList;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
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
        Departament that = (Departament) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(head, that.head) && Objects.equals(lectorList, that.lectorList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, head, lectorList);
    }
}
