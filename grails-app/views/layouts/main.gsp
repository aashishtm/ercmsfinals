<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>
    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">

    <div class="mr-auto">
        <h1 class="text-uppercase font-weight-bold text-white">ECRMS</h1>
    </div>
    <div class="ml-auto">
        <ul class="navbar-nav">
            <UIHelper:memberActionMenu/>
        </ul>
    </div>
</nav>
<div class="navbar navbar-expand-md">
    <ul class="navbar-nav bg-primary">
        <UIHelper:mainNavigation/>
    </ul>
</div>

<g:layoutBody/>

%{--<div class="footer row" role="contentinfo">--}%

%{--</div>--}%


<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
