<%@ page
  language="java"
  contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"
%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<link
  rel="stylesheet"
  href="<%= application.getContextPath() %>/css/styles.css"
/>
</head>
<body>
  <div class="container">
    <%@ include file="menu.jsp"%>
    <div class="main">
      <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
        Sunt in tenetur tempora minus maxime enim eos nobis quisquam
        voluptas nulla vero voluptatem odit consequatur iusto commodi
        ducimus totam nemo reprehenderit!</p>
        <br />
        <img class="background-image"src="<%= application.getContextPath() %>/images/background-image.jpg" alt="background image of a landscape" />
    </div>
  </div>
  <script src="<%= application.getContextPath() %>/js/script.js"></script>
</body>
</html>
