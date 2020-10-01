<%@ include file="common/header.jspf" %>

<div class="container">
	<form:form method="post" action="register">
		<fieldset class="form-group">
			<form:label path="firstName" id="firstNamelbl">First Name</form:label>
			<form:input path="firstName" id="firstName" type="text" class="form-control"
				required="required" />
			<form:errors path="firstName" cssClass="text-warning" id="firstName"/>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="lastName" id="lastNamelbl">Last Name</form:label>
			<form:input path="lastName" id="lastName" type="text" class="form-control"
						required="required" />
			<form:errors path="lastName" cssClass="text-warning" id="lastName"/>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="address1" id="address1lbl">Address 1</form:label>
			<form:input path="address1" id="address1" type="text" class="form-control"
				required="required" />
			<form:errors path="address1" cssClass="text-warning" id="address1"/>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="address2" id="address2lbl">Address 2</form:label>
			<form:input path="address2" id="address2" type="text" class="form-control"
						required="required" />
			<form:errors path="address2" cssClass="text-warning" id="address2"/>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="city" id="citylbl">City</form:label>
			<form:input path="city" id="city" type="text" class="form-control"
						required="required" />
			<form:errors path="city" cssClass="text-warning" id="city"/>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="state" id="statelbl">State</form:label>
			<form:input path="state" id="state" type="text" class="form-control"
						required="required" />
			<form:errors path="state" cssClass="text-warning" id="state"/>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="zip" id="ziplbl">ZipCode</form:label>
			<form:input path="zip" id="zip" type="text" class="form-control"
						required="required" />
			<form:errors path="zip" cssClass="text-warning" id="zip"/>
		</fieldset>

		<fieldset class="form-group">
			<form:label path="country" id="countrylbl">Country</form:label>
			<form:input path="country" type="text" class="form-control"
						value="US" disabled="true" id="country"/>
		</fieldset>

		<button type="submit" class="btn btn-success">Register</button>
	</form:form>
</div>
<%@ include file="common/footer.jspf" %>