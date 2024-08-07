import Personal.Certificate;
import Personal.Developer;
import Personal.Education;
import Personal.Job;

import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Developer developer = buildDeveloper();
		developer.setJobs(buildJobs());
		developer.setCertificates(buildCertificates());
		developer.setEducations(buildEducation());

		System.out.println(developer);
	}

	private static Developer buildDeveloper() {
		Developer developer = new Developer();
		developer.setName("Abdelaziz Al. Tally");
		developer.setEmail("abdelaziz.altally@gmail.com");
		developer.setPhoneNumber("00962796880052");
		developer.setCurrentTitle("Senior Backend Engineer (Level 2) | OPTIMUM PARTNERS");

		String summary = "Talented Senior Backend developer adept at contributing to highly collaborative work environment, finding solutions, and\n" +
				"determining customer satisfaction.\n" +
				"Designed and developed web applications across multiple APIs, third party integrations and databases.\n" +
				"Passionate and hardworking with penchant for developing customized interfaces that factor in unique demands for\n" +
				"accessibility, reachability, and security";
		developer.setSummary(summary);
		return developer;
	}

	private static List<Job> buildJobs() {
		Job job4 = new Job();
		job4.setCompanyName("Optimum Partners | FORBES");
		job4.setTitle("Senior Backend Engineer (Level 2)");
		job4.setStartDate(new Date("12/1/2023"));
		job4.setStillWorkingHere(true);
		String description = "- Conducted training sessions covering API architecture, coding standards, and development processes,\n" +
				"ensuring new hires are quickly integrated and productive.\n" +
				"- Created and maintained detailed documentation and training materials, enhancing the onboarding\n" +
				"experience.\n" +
				"- Work closely with Product Owners and Stakeholders to gather requirements and set realistic timelines, and\n" +
				"set our goals for the next quarter, or next year.\n" +
				"- Perform internal reviews for newly hired employees to ensure the adherence to coding standards, best\n" +
				"practices, and security protocols, while also mentoring them to write high-quality and maintainable code";
		job4.setDescription(description);

		Job job3 = new Job();
		job3.setCompanyName("Optimum Partners | FORBES");
		job3.setTitle("Backend Engineer");
		job3.setStartDate(new Date("2/1/2022"));
		job3.setEndDate(new Date("12/1/2023"));
		description = "- Participate regularly in peer code review and Pair Programming\n" +
				"- Worked on many projects with different programming languages such as but not limited to: JS, TS, Java,\n" +
				"Python, PHP, and event driven Cloud Functions implemented in TS.\n" +
				"- Implement and maintain Endpoints, Services and DAO-Services from scratch.\n" +
				"- Manage technical communications with clients and Product owners.\n" +
				"- Develop efficient process workflows, and ensure they are rolled out and standardized based on Forbes\n" +
				"standards.\n" +
				"- Handled the migration of a project from Python/Flask to TS/Express from scratch.\n" +
				"- Handled the migration of 33 GCP Cloud Functions from Javascript to Typescript, along with their refactoring.\n" +
				"- First point of contact and a single point of success for multiple projects including API and Cloud Functions.\n" +
				"- Promoted to Senior 2 in December/2023\n" +
				"- Conducted training sessions covering API architecture, coding standards, and development processes,\n" +
				"ensuring new hires are quickly integrated and productive.\n" +
				"- Created and maintained detailed documentation and training materials, enhancing the onboarding\n" +
				"experience.";
		job3.setDescription(description);

		Job job2 = new Job();
		job2.setCompanyName("Optimum Partners | FORBES");
		job2.setTitle("Wordpress Engineer");
		job2.setStartDate(new Date("6/1/2021"));
		job2.setEndDate(new Date("2/1/2022"));
		description = "- Develop and extend WordPress backends for website builds.\n" +
				"- Interface with third party APIs such as Google Maps, Salesforce and Bizzabo\n" +
				"- Work with account managers to develop estimates and ensure that deliverables are completed on time and\n" +
				"on budget.\n" +
				"- Create OKTA Application and integrate it with the web-app to provide a seamless authentication experience\n" +
				"for end users.\n" +
				"- Help maintain and improve internal projects.\n" +
				"- Develop efficient process workflows, and ensure they are rolled out and standardized based on Forbes\n" +
				"standards.";
		job2.setDescription(description);

		Job job1 = new Job();
		job1.setCompanyName("MenaITech");
		job1.setTitle("FullStack Web Engineer");
		job1.setStartDate(new Date("8/1/2019"));
		job1.setEndDate(new Date("9/1/2020"));
		description = "- Started with the company as a trainee, with simple knowledge of HTML and CSS.\n" +
				"- Got familiar and started working with PHP, JS, Bootstrap, MYSQL, jQuery and PHP CodeIgniter MVC\n" +
				"framework in a matter of 4 months.\n" +
				"- Was trusted to work on the company's HRMS and optimize its code, after I've shown and proven my quality\n" +
				"on the internship phase and was the only undergraduate with that privilege.";
		job1.setDescription(description);

		return List.of(job4, job3, job2, job1);
	}

	private static List<Certificate> buildCertificates() {
		Certificate certificate6 = new Certificate();
		certificate6.setName("The Web Developer Bootcamp (NodeJS, EJS)");
		certificate6.setDateAcquired(new Date("1/1/2022"));
		certificate6.setIssuer("UDEMY");
		certificate6.setUrl("https://udemy-certificate.s3.amazonaws.com/pdf/UC-8e61c699-c860-4add-ac1a-92917fed9fcc.pdf");
		certificate6.setDuration("63.5 Hours");


		Certificate certificate5 = new Certificate();
		certificate5.setName("MongoDB Basics, M001");
		certificate5.setDateAcquired(new Date("12/1/2021"));
		certificate5.setIssuer("MongoDB University");
		certificate5.setDuration("N/A");

		Certificate certificate4 = new Certificate();
		certificate4.setName("Complete WordPress Website Developer");
		certificate4.setDateAcquired(new Date("7/1/2021"));
		certificate4.setIssuer("UDEMY");
		certificate4.setUrl("https://udemy-certificate.s3.amazonaws.com/pdf/UC-22ee73b7-8c7f-497f-a5f7-774c280f2fc9.pdf");
		certificate4.setDuration("3.5 Hours");

		Certificate certificate3 = new Certificate();
		certificate3.setName("Microsoft Technology Associate: Intro to Programming (JAVA)");
		certificate3.setDateAcquired(new Date("3/1/2021"));
		certificate3.setIssuer("Microsoft");
		certificate3.setUrl("https://www.certiport.com/Portal/Pages/PrintTranscriptInfo.aspx?action=Cert&id=398&cvid=PLB2mmsJhb0Xyc9buVz6cQ==");
		certificate3.setDuration("88% Grade");

		Certificate certificate2 = new Certificate();
		certificate2.setName("Python, Introduction to advance with Simple Machine Learning");
		certificate2.setDateAcquired(new Date("3/1/2021"));
		certificate2.setIssuer("UDEMY");
		certificate2.setUrl("https://udemy-certificate.s3.amazonaws.com/pdf/UC-e772eb6b-f3a9-44c6-b69e-f36f213eaf61.pdf");
		certificate2.setDuration("5.5 Hours");

		Certificate certificate1 = new Certificate();
		certificate1.setName("Introduction to Python");
		certificate1.setDateAcquired(new Date("3/1/2021"));
		certificate1.setIssuer("UDEMY");
		certificate1.setUrl("https://udemy-certificate.s3.amazonaws.com/pdf/UC-5fc5ba66-78ff-48b8-9885-eb394d1433fe.pdf");
		certificate1.setDuration("5 Hours");

		return List.of(certificate6, certificate5, certificate4, certificate3, certificate2, certificate1);
	}

	private static List<Education> buildEducation() {
		Education education2 = new Education();
		education2.setName("The Hashemite Univesity");
		education2.setDegree("Bachelor of Science: SOFTWARE ENGINEERING");
		education2.setGraduationDate(new Date("6/1/2021"));
		education2.setGrade("3.27 out of 4.00");

		Education education1 = new Education();
		education1.setName("Al Jazeera Schools");
		education1.setDegree("Tawjihi");
		education1.setGraduationDate(new Date("6/1/2017"));
		return List.of(education2, education1);
	}
}
