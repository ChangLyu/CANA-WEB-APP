package org.cana.reservation.model;


import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Student {
		//Primary Key
		private long id;
		private String emailAddress;
		private String password;
		private String firstName;
		private String lastName;
		private int age;
		private String phoneNumber;
		private Date dateCreated;
		//Not interviewed before (0), after interview (1), finish lessons(2), found a job(3) 
		private int interview_status;
		//International student(0), work permit(1), permanent resident(2), citizen(3)
		private int visa_status;
		private String major;
		private String type;
		//Describe the process in CANA, will be updated after each course
		private String description;
		

		//No argument constructor
		public Student(){
			
		}
		
		public Student(long id, String emailAddress, String password, String firstName, String lastName, int age, String phoneNumber, int interview_status, int visa_status, String major, String type, String description){
			this.id = id;
			this.emailAddress = emailAddress;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.phoneNumber = phoneNumber;
			this.interview_status = interview_status;
			this.visa_status = visa_status;
			this.major = major;
			this.type = type;
			this.description = description;
		}
		
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public int getInterview_status() {
			return interview_status;
		}

		public void setInterview_status(int interview_status) {
			this.interview_status = interview_status;
		}

		public int getVisa_status() {
			return visa_status;
		}

		public void setVisa_status(int visa_status) {
			this.visa_status = visa_status;
		}

		public String getEmailAddress() {
			return emailAddress;
		}

		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Date getDateCreated() {
			return dateCreated;
		}

		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getMajor() {
			return major;
		}

		public void setMajor(String major) {
			this.major = major;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getCreated() {
			return dateCreated;
		}

		public void setCreated(Date created) {
			this.dateCreated = created;
		}

}
