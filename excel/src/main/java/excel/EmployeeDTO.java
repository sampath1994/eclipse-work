package excel;

public class EmployeeDTO {
	
	private String eName;
	
	private String ePasswd;
	
	private String eEmail;
	
	private String eAge;
	
	private String eDepartment;
	
	private String eSkill;

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getePasswd() {
		return ePasswd;
	}

	public void setePasswd(String ePasswd) {
		this.ePasswd = ePasswd;
	}

	public String geteEmail() {
		return eEmail;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public String geteAge() {
		return eAge;
	}

	public void seteAge(String eAge) {
		this.eAge = eAge;
	}

	public String geteDepartment() {
		return eDepartment;
	}

	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}

	public String geteSkill() {
		return eSkill;
	}

	public void seteSkill(String eSkill) {
		this.eSkill = eSkill;
	}

	public EmployeeDTO(String eName, String ePasswd, String eEmail, String eAge, String eDepartment, String eSkill) {
		super();
		this.eName = eName;
		this.ePasswd = ePasswd;
		this.eEmail = eEmail;
		this.eAge = eAge;
		this.eDepartment = eDepartment;
		this.eSkill = eSkill;
	}

	@Override
	public String toString() {
		StringBuffer retBuf = new StringBuffer();
		retBuf.append("Employee Info : Name = ");
		retBuf.append(this.geteName());
		retBuf.append(" , Password = ");
		retBuf.append(this.getePasswd());
		retBuf.append(" , Email = ");
		retBuf.append(this.geteEmail());
		retBuf.append(" , Age = ");
		retBuf.append(this.geteAge());
		retBuf.append(" , Department = ");
		retBuf.append(this.geteDepartment());
		retBuf.append(" , Skill = ");
		retBuf.append(this.geteSkill());
		return retBuf.toString();
	}
}