package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Cache(usage=CacheConcurrencyStrategy.READ_ONLY,region="Emp_entity")
@Entity
@Table(name="salary")

public class Emp_entity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="empname")
	private String empname;
	
	@Column(name="totalExperience")
	private float totalExperince;
	
	@Column(name="skills")
    private String skills;
	
	@Column(name="pac_kage")
    private float pac_kage;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public float getTotalExperince() {
		return totalExperince;
	}

	public void setTotalExperince(float totalExperince) {
		this.totalExperince = totalExperince;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public float getPac_kage() {
		return pac_kage;
	}

	public void setPac_kage(float pac_kage) {
		this.pac_kage = pac_kage;
	}

	

	public Emp_entity(int id, String empname, float totalExperince, String skills, float pac_kage) {
		super();
		this.id = id;
		this.empname = empname;
		this.totalExperince = totalExperince;
		this.skills = skills;
		this.pac_kage = pac_kage;
	}

	public Emp_entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Emp_entity [id=" + id + ", empname=" + empname + ", totalExperince=" + totalExperince + ", skills="
				+ skills + ", pac_kage=" + pac_kage + "]";
	}
	

}
