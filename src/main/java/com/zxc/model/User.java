package com.zxc.model;

import java.math.BigInteger;
import java.util.Date;

public class User {
	private String uuid;
	private String userID;
	private String companyID;
	private Date createDate;
	private Date modifiedDate;
	private int defaultUser;
	private String contactID;
	private String password;
	private int passwordEncrypted;
	private int passwordReset;
	private Date passwordModifiedDate;
	private String digest;
	private String reminderQueryQuestion;
	private String reminderQueryAnswer;
	private int graceLoginCount;
	private String screenName;
	private String emailAddress;
	private BigInteger facebookId;
	private BigInteger ldapServerId;
	private String openID;
	private BigInteger portraitID;
	private String languageID;
	private String timeZoneID;
	private String greeting;
	private String comments;
	private String firstName;
	private String middleName;
	private String lastName;
	private String jobTitle;
	private Date loginDate;
	private String loginIP;
	private Date lastLoginDate;
	private String lastLoginIP;
	private Date lastFailedLoginDate;
	private int failedLoginAttempts;
	private int lockout;
	private Date lockoutDate;
	private int agreedToTermsOfUse;
	private int emailAddressVerified;
	private int status;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public int getDefaultUser() {
		return defaultUser;
	}
	public void setDefaultUser(int defaultUser) {
		this.defaultUser = defaultUser;
	}
	public String getContactID() {
		return contactID;
	}
	public void setContactID(String contactID) {
		this.contactID = contactID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPasswordEncrypted() {
		return passwordEncrypted;
	}
	public void setPasswordEncrypted(int passwordEncrypted) {
		this.passwordEncrypted = passwordEncrypted;
	}
	public int getPasswordReset() {
		return passwordReset;
	}
	public void setPasswordReset(int passwordReset) {
		this.passwordReset = passwordReset;
	}
	public Date getPasswordModifiedDate() {
		return passwordModifiedDate;
	}
	public void setPasswordModifiedDate(Date passwordModifiedDate) {
		this.passwordModifiedDate = passwordModifiedDate;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	public String getReminderQueryQuestion() {
		return reminderQueryQuestion;
	}
	public void setReminderQueryQuestion(String reminderQueryQuestion) {
		this.reminderQueryQuestion = reminderQueryQuestion;
	}
	public String getReminderQueryAnswer() {
		return reminderQueryAnswer;
	}
	public void setReminderQueryAnswer(String reminderQueryAnswer) {
		this.reminderQueryAnswer = reminderQueryAnswer;
	}
	public int getGraceLoginCount() {
		return graceLoginCount;
	}
	public void setGraceLoginCount(int graceLoginCount) {
		this.graceLoginCount = graceLoginCount;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public BigInteger getFacebookId() {
		return facebookId;
	}
	public void setFacebookId(BigInteger facebookId) {
		this.facebookId = facebookId;
	}
	public BigInteger getLdapServerId() {
		return ldapServerId;
	}
	public void setLdapServerId(BigInteger ldapServerId) {
		this.ldapServerId = ldapServerId;
	}
	public String getOpenID() {
		return openID;
	}
	public void setOpenID(String openID) {
		this.openID = openID;
	}
	public BigInteger getPortraitID() {
		return portraitID;
	}
	public void setPortraitID(BigInteger portraitID) {
		this.portraitID = portraitID;
	}
	public String getLanguageID() {
		return languageID;
	}
	public void setLanguageID(String languageID) {
		this.languageID = languageID;
	}
	public String getTimeZoneID() {
		return timeZoneID;
	}
	public void setTimeZoneID(String timeZoneID) {
		this.timeZoneID = timeZoneID;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public String getLoginIP() {
		return loginIP;
	}
	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}
	public Date getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public String getLastLoginIP() {
		return lastLoginIP;
	}
	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}
	public Date getLastFailedLoginDate() {
		return lastFailedLoginDate;
	}
	public void setLastFailedLoginDate(Date lastFailedLoginDate) {
		this.lastFailedLoginDate = lastFailedLoginDate;
	}
	public int getFailedLoginAttempts() {
		return failedLoginAttempts;
	}
	public void setFailedLoginAttempts(int failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}
	public int getLockout() {
		return lockout;
	}
	public void setLockout(int lockout) {
		this.lockout = lockout;
	}
	public Date getLockoutDate() {
		return lockoutDate;
	}
	public void setLockoutDate(Date lockoutDate) {
		this.lockoutDate = lockoutDate;
	}
	public int getAgreedToTermsOfUse() {
		return agreedToTermsOfUse;
	}
	public void setAgreedToTermsOfUse(int agreedToTermsOfUse) {
		this.agreedToTermsOfUse = agreedToTermsOfUse;
	}
	public int getEmailAddressVerified() {
		return emailAddressVerified;
	}
	public void setEmailAddressVerified(int emailAddressVerified) {
		this.emailAddressVerified = emailAddressVerified;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
