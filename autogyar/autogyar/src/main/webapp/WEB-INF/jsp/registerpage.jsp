<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div>
	<form action="/registration" method="post">
		
			<div class="container register-form">
            <div class="form">
                <div class="note">
                    <p>Adja meg a *-al jelölt adatokat a regisztrációhoz.</p>
                </div>

                <div class="form-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Your Name *" value="" name="username"/>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" placeholder="Your Password *" value="" name="password"/>
                            </div>
                        </div>
                    </div>
                    <input type="submit" class="btnSubmit" value="Regisztrál"/>
                </div>
            </div>
        </div>
		
<!-- 		<div class="form-group"> -->
<!-- 			<a href="/login" class="btn btn-primary">Back to login</a> -->
<!-- 		</div> -->
		
	</form>
</div>
