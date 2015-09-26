	package br.com.core.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.core.Interface.IModel;


 
//...import  statements
 	
@Entity
@Table(name = "contact")
public class Contact implements IModel<Integer> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
 
    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTH_DATE")
    private Date birthDate;
 
    @Column(name = "EMAIL")
    private String email;
 
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
 
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "contact", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Address> contactAddress = new HashSet<Address>();
 
    public Contact() {
        super();
    }
 
    public Contact(String firstName, String lastName, Date birthDate, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
 
    
    public void addAddress(Address address) {
        address.setContact(this);
        getContactAddress().add(address);
    }
 
    public void removeAddress(Address address) {
        getContactAddress().remove(address);
    }
 
   
 
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Set<Address> getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(Set<Address> contactAddress) {
		this.contactAddress = contactAddress;
	}

	@Override
    public String toString() {
        return firstName + " " + lastName + "\nBirth Date: " + birthDate + "\nEmail: " + email + " \nPhone Number: " + phoneNumber ;
    }

	
	public boolean getAtivo() {
		// TODO Auto-generated method stub
		return false;
	}


	public void setAtivo(boolean ativo) {
		// TODO Auto-generated method stub
		
	}

	public String getNameClass() {
	
		return "Contact";
	}

	

	public HashMap<String, String> getCriterios() {
		// TODO Auto-generated method stub
		return null;
	}

	public HashMap<String, String> getForeignKey() {
		// TODO Auto-generated method stub
		return null;
	}    
}