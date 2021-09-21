package com.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.io.Serializable;

@SequenceGenerator(name = "contactsSeqPK", sequenceName = "contactsSeqPK")
@Entity
@Table(name = "contacts")
public class Contacts implements Serializable {

    @Id
    @GeneratedValue(generator = "contactsSeqPK")
    @Column(name = "contact_id", nullable = false)
    private int contactId;

    @ManyToOne(targetEntity = com.entity.Person.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "sick_person", referencedColumnName = "person_id")
    @JsonBackReference
    private Person sickPerson;

    @ManyToOne(targetEntity = com.entity.Person.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "infected_person", referencedColumnName = "person_id")
    private Person infectedPerson;

    public Person getSickPerson() {
        return sickPerson;
    }

    public void setSickPerson(Person sickPerson) {
        this.sickPerson = sickPerson;
    }

    public Person getInfectedPerson() {
        return infectedPerson;
    }

    public void setInfectedPerson(Person infectedPerson) {
        this.infectedPerson = infectedPerson;
    }

    public String toString(){
        return "Sick Person: " + sickPerson.getName() + " Infected Person: " + infectedPerson.getName();
    }

}