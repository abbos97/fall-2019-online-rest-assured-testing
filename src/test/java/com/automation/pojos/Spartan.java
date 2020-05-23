package com.automation.pojos;

import com.google.gson.annotations.SerializedName;


/**
 * This class represents spartan POJO
 * Example of JSON response:
 * {
 *     "id": 393,               ->   private int id;
 *     "name": "Michael Scott", ->   private String name;
 *     "gender": "Male",        ->   private String gender;
 *     "phone": 6969696969      ->   @SerializedName("phone") private long phoneNumber;
 * }
 *   SerializedName  - an annotation that indicates this member should be serialized to JSON with
 *  * the provided name value as its field name.
 */
import java.util.Objects;

public class Spartan {

    private int id;
    private String name;
    private String gender;
    @SerializedName("phone")//it's mandatory
    private long phoneNumber;

    public Spartan( String name, String gender, long phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
    public Spartan(){}
    public Spartan( int id,String name, String gender, long phoneNumber) {
        this.id=id;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Spartan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Spartan)) return false;
        Spartan spartan = (Spartan) o;
        return getId() == spartan.getId();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getGender(), getPhoneNumber());
    }
}
