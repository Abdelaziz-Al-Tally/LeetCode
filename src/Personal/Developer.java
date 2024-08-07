package Personal;

import java.util.List;

public class Developer {
	private String Name;
	private String email;
	private String phoneNumber;
	private String summary;
	private String currentTitle;
	private List<Job> jobs;
	private List<Certificate> certificates;
	private List<Education> educations;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getCurrentTitle() {
		return currentTitle;
	}

	public void setCurrentTitle(String currentTitle) {
		this.currentTitle = currentTitle;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public void setEducations(List<Education> educations) {
		this.educations = educations;
	}

	public List<Education> getEducations() {
		return educations;
	}

	@Override
	public String toString() {
		return "Developer{" +
				"Name='" + Name + '\'' +
				", email='" + email + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", summary='" + summary + '\'' +
				", currentTitle='" + currentTitle + '\'' +
				", jobs=" + jobs +
				", certificates=" + certificates +
				", educations=" + educations +
				'}';
	}
}
