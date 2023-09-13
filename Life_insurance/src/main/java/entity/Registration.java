package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Cache(usage=CacheConcurrencyStrategy.READ_ONLY,region="Registration")
@Entity
@Table(name="Hiber_mapping")
public class Registration {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
@Column(name="name")
	private String name;
@Column(name="address")
	private String address;
@Column(name="email")
	private String email;
	
	
	
	
	public Registration(int id, String name, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}


	public Registration() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Registration [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	
	

}
