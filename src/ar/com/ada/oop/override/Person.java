package ar.com.ada.oop.override;

import org.omg.CORBA.PERSIST_STORE;

import java.util.Objects;

public class Person {
    private String name;
    private String lastName;

    public Person () {}
    public Person (String pName) {
        this.name = pName;
    }
    public Person (String pName, String pLastName) {
        this.name = pName;
        this.lastName = pLastName;
    }
    public String getName () {
        return this.name;
    }
    public String getLastName () {
        return this.lastName;
    }
    public void setName (String pName) {
        this.name = pName;
    }
    public void setLastName (String pLastName) {
        this.lastName = pLastName;
    }
    @Override
    public String toString () {
        return "Person: { Name: " +name+ " and Last Name: " +lastName ;
    }
    @Override
    public int hashCode () {
        return 2 * Objects.hash(name, lastName);
    }
    @Override
    public boolean equals (Object x) {
        if (this == x) {
            return true;
        }
        if (x == null || this.getClass() != x.getClass() ) {
            return false;
        }
        Person that = (Person) x ;
        boolean tmp = this.lastName.equals(that.lastName) &&
                this.name.equals(that.name);
        return tmp;

    }
}
