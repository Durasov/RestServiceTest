package com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SequenceGenerator(name = "personSeqPK", sequenceName = "personSeqPK")
@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(generator = "personSeqPK")
    @Column(name = "person_id", nullable = false)
    @JsonIgnore
    private int personId;

    @Basic
    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = com.entity.Contacts.class, mappedBy = "sickPerson", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private Set<Contacts> contacts = new HashSet<>();

    public Person(){

    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "id: " + personId + " name: " + name + " contacts: " + contacts;
    }

}
