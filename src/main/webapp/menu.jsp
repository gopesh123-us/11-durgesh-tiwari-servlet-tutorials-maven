<%@ page
  language="java"
  contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>
<html>
<head>
<title>11-Durgesh Tiwari Servlet Tutorials - Maven</title>
<link
  rel="stylesheet"
  href="<%= application.getContextPath() %>/css/styles.css"
/>
</head>
<body>
  <nav>
  <header class="header">
  <h1>
    <a
      class="brand"
      href="index.jsp"
    >My-App</a>
  </h1>
  <div>
    <ul>
      <li></li>
      <li><a href="<%= application.getContextPath() %>/index.jsp">Home</a></li>
      <li><a href="<%= application.getContextPath() %>/services.jsp">Services</a></li>
      <li><a href="<%= application.getContextPath() %>/about.jsp">About</a></li>
    </ul>
  </div>
    
  </header>
    
    
  </nav>
</body>
</html>
