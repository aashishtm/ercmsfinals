<meta name="layout" content="public"/>
<br/>
<hr/>
<br/>
<div id="global-wrapper">
    <div id="content-wrapper">
        <div class="container">
            <div class="row">
                <div class="col-sm-6 col-md-4 mx-auto">
                    <div class="account-wall text-center">
                        <h1 class="text-uppercase font-weight-bold text-primary"> LOGIN </h1>
                        <g:img dir="images" file="grails.svg" class="profile-img my-2"/>
                        <g:form controller="auth" action="doLogin" class="form-signin">
                            <g:textField name="email" class="form-control" placeholder="Email" required="required" />
                            <g:passwordField name="password" class="form-control" placeholder="Password" required="required" />
                            <br/>
                            <g:submitButton class="btn btn-lg btn-primary btn-block" name="login" value="Login"/>
                            <g:link controller="auth" class="btn btn-lg btn-warning btn-block" action="create">Register</g:link>
                        </g:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>