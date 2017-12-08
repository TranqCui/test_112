<%@taglib prefix="show" tagdir="/WEB-INF/tags" %>
<%@page isELIgnored="false" pageEncoding="utf-8" %>
<html>
<body>
<h2>Hello World!</h2>
<show:tagfileDemo></show:tagfileDemo><br>
<show:encode input="<sunny>"></show:encode>
<show:varDemo>
    long format: ${longDate}<br>
    short format: ${shortDate}
</show:varDemo>
</body>
</html>
