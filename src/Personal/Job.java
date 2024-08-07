package Personal;

import java.util.Date;

public class Job {
	private String companyName;
	private String title;
	private Date startDate;
	private Date endDate;
	private boolean stillWorkingHere;
	private String description;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		if (this.stillWorkingHere) {
			return;
		}
		this.endDate = endDate;
	}

	public boolean isStillWorksHere() {
		return stillWorkingHere;
	}

	public void setStillWorkingHere(boolean stillWorkingHere) {
		this.stillWorkingHere = stillWorkingHere;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Job{" +
				"companyName='" + companyName + '\'' +
				", title='" + title + '\'' +
				", startDate=" + startDate +
				", endDate=" + endDate +
				", stillWorkingHere=" + stillWorkingHere +
				", description='" + description + '\'' +
				'}';
	}
}
