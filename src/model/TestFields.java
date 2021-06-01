package model;

public class TestFields {
	
	private String name;
	private String email;
	private String phone;
	private int experience;
	private int position;
	private String file;

	public TestFields(String name, String email, String phone, int experience, int position, String file) {
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.experience = experience;
		this.position = position;
		this.file = file;
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

	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getFile() {
		return file;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public void setFile(String file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return this.getName() + " " + this.getEmail() + " " + this.getPhone() + " " + this.getExperience() + " " + this.getPosition() +
			   " " + this.getFile();
	}

	public TestFields() {
		super();
	}
	
	
}
