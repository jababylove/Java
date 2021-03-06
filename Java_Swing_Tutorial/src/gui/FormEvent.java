package gui;
import java.util.EventObject;

@SuppressWarnings("serial")
public class FormEvent extends EventObject {
	private String name;
	private String occupation;
	private int ageCategory;
	private String text;
	private String empCategory;
	private String taxId;
	private boolean usCitizen;
	private String gender;
	
	public FormEvent(Object source) {
		super(source);
	}
	
	public FormEvent(Object source, String name, 
			         String occupation, int ageCategory, 
			         String text, String empCategory,
			         String taxId, boolean usCitizen, String gender) {
		super(source);
		
		this.name = name;
		this.occupation = occupation;
		this.ageCategory = ageCategory;
		this.text = text;
		this.empCategory = empCategory;
		this.taxId = taxId;
		this.usCitizen = usCitizen;
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public String getTaxId() {
		return taxId;
	}

	public boolean isUsCitizen() {
		return usCitizen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	public int getAgeCategory() {
		return ageCategory;
	}
	
	public String getText() {
		return text;
	}
	
	public String getEmploymentCategory() {
		return empCategory;
	}

}
