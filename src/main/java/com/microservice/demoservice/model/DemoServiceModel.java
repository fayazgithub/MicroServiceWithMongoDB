package com.microservice.demoservice.model;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;
import org.springframework.data.annotation.Id;

@Service
@Document("demoserviceuser")
public class DemoServiceModel {

    @Id
    String resourceid;

    String firstname;
    String lastname;
    String phone;
    String address;
    String city;
    String country;
    String zipcode;


    /**
     * get field
     *
     * @return resourceid
     */
    public String getResourceid() {
        return this.resourceid;
    }

    /**
     * set field
     *
     * @param resourceid
     */
    public void setResourceid(String resourceid) {
        this.resourceid = resourceid;
    }

    /**
     * get field
     *
     * @return firstname
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * set field
     *
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * get field
     *
     * @return lastname
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * set field
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * get field
     *
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * set field
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * get field
     *
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * set field
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get field
     *
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * set field
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * get field
     *
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * set field
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * get field
     *
     * @return zipcode
     */
    public String getZipcode() {
        return this.zipcode;
    }

    /**
     * set field
     *
     * @param zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
