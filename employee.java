package org.main;

/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_DETAILS")*/
public class Employee {
	public Employee() {
		super();
	}

	

	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	 public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(int basicSalary) {
			this.basicSalary = basicSalary;
		}

		public float getDearnessAllowance() {
			return dearnessAllowance;
		}

		public void setDearnessAllowance(int dearnessAllowance) {
			this.dearnessAllowance = dearnessAllowance;
		}

		public float getHouseRentAllowance() {
			return houseRentAllowance;
		}

		public void setHouseRentAllowance(int houseRentAllowance) {
			this.houseRentAllowance = houseRentAllowance;
		}

		public float getProvidentFund() {
			return providentFund;
		}

		public void setProvidentFund(int providentFund) {
			this.providentFund = providentFund;
		}

		public float getTravelAllowance() {
			return travelAllowance;
		}

		public void setTravelAllowance(int travelAllowance) {
			this.travelAllowance = travelAllowance;
		}
	
   /* @Id
    @GeneratedValue
    @Column (name="EMP_ID")*/
	private int id;
   // @Column (name="EMP_NAME",nullable=true,length=255)
	private String name;
   
	//@Column (name="EMP_EMAIL")
	private String email;
   // @Column (name="EMP_PHONE")
	private long phone;
   // @Column (name="BASIC_SALARY")
	private double basicSalary;
   // @Column (name="DA")
	private float dearnessAllowance;
  //  @Column (name="HRA")
	private float houseRentAllowance;
  //  @Column (name="PA")
	private float providentFund;
  //  @Column (name="TA")
	private float travelAllowance;
	
	//private boolean gender;
}
