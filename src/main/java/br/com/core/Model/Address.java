package br.com.core.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.core.Interface.IModel;


@Entity
@Table(name = "contact_address")
public class Address implements IModel<Integer> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "STREET")
    private String street;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "ZIP")
    private String zip;
 
    @ManyToOne
    @JoinColumn(name = "CONTACT_ID")
    private Contact contact;
 
    public Address() {
        super();
    }
 
    public Address(String street, String city, String country, String zip) {
        super();
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }
  

 
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
    public String toString() {
        return  street + ", city=" + city + ", country=" + country + ", zip=" + zip;
    }



	public boolean getAtivo() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setAtivo(boolean ativo) {
		// TODO Auto-generated method stub
		
	}

	public String getNameClass() {
		return "Address";
	}
}