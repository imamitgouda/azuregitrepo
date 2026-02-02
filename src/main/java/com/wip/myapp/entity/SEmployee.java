package com.wip.myapp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class SEmployee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eid;

	@Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters")
	@Pattern(regexp = "[^0-9]*", message = "Name must not contain Numbers")
	@NotBlank(message = "Name is mandatory field")
	private String ename;

	public SEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SEmployee(Long eid,
			@Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters") @Pattern(regexp = "[^0-9]*", message = "Name must not contain Numbers") @NotBlank(message = "Name is mandatory field") String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "SEmployee [eid=" + eid + ", ename=" + ename + "]";
	}

}
