<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include  file="/WEB-INF/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>USER INFO</h1>
	<span>uuid : ${user.uuid }</span><br/>
	<span>userID : ${user.userID }</span><br/>
	<span>companyID : ${user.companyID }</span><br/>
	<span>defaultUser : ${user.defaultUser }</span><br/>
	<span>contactID : ${user.contactID }</span><br/>
	<span>password : ${user.password }</span><br/>
	<span>passwordEncrypted : ${user.passwordEncrypted }</span><br/>
	<span>passwordReset : ${user.passwordReset }</span><br/>
	<span>digest : ${user.digest }</span><br/>
	<span>reminderQueryQuestion : ${user.reminderQueryQuestion }</span><br/>
	<span>reminderQueryAnswer : ${user.reminderQueryAnswer }</span><br/>
	<span>graceLoginCount : ${user.graceLoginCount }</span><br/>
	<span>screenName : ${user.screenName }</span><br/>
	<span>emailAddress : ${user.emailAddress }</span><br/>
	<span>facebookId : ${user.facebookId }</span><br/>
	<span>ldapServerId : ${user.ldapServerId }</span><br/>
	<span>openID : ${user.openID }</span><br/>
	<span>portraitID : ${user.portraitID }</span><br/>
	<span>languageID : ${user.languageID }</span><br/>
	<span>timeZoneID : ${user.timeZoneID }</span><br/>
	<span>greeting : ${user.greeting }</span><br/>
	<span>comments : ${user.comments }</span><br/>
	<span>firstName : ${user.firstName }</span><br/>
	<span>middleName : ${user.middleName }</span><br/>
	<span>lastName : ${user.lastName }</span><br/>
	<span>jobTitle : ${user.jobTitle }</span><br/>
	<span>lastLoginIP : ${user.lastLoginIP }</span><br/>
	<span>loginIP : ${user.loginIP }</span><br/>
	<span>failedLoginAttempts : ${user.failedLoginAttempts }</span><br/>
	<span>lockout : ${user.lockout }</span><br/>
	<span>agreedToTermsOfUse : ${user.agreedToTermsOfUse }</span><br/>
	<span>emailAddressVerified : ${user.emailAddressVerified }</span><br/>
	<span>status : ${user.status }</span><br/>
	<span>lockoutDate : ${user.lockoutDate }</span><br/>
	<span>lastFailedLoginDate : ${user.lastFailedLoginDate }</span><br/>
	<span>loginDate : ${user.loginDate }</span><br/>
	<span>lastLoginDate : ${user.lastLoginDate }</span><br/>
	<span>passwordModifiedDate : ${user.passwordModifiedDate }</span><br/>
	<span>modifiedDate : ${user.modifiedDate }</span><br/>
	<span>createDate : ${user.createDate }</span><br/>
</body>
</html>