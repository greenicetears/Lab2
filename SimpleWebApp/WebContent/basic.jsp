<%@ page import="java.io.*" %>
<HTML>
    <HEAD>
        <TITLE>Thanks for Sharing opinion about Computer Science!</TITLE>
    </HEAD>

    <BODY>
        <H1>Thanks for Sharing opinion about Computer Science!</H1>
        Here's what you and others have said:
        <BR>
        <BR>
        <%
            String name = request.getParameter("TEXT1");
            String text = request.getParameter("TEXTAREA1");
           	String like = request.getParameter("points");
            String file = application.getRealPath("/") + "test.txt";
    
            FileWriter filewriter = new FileWriter(file, true);
            filewriter.write("<B>Name: </B>" + name + "<BR>");
            filewriter.write("<B>One To Ten: </B>" + like + "<BR>");
            filewriter.write("<B>Comments: </B><BR>");
            filewriter.write(text + "<BR><BR>");
            filewriter.close();
        %>
        <jsp:include page="test.txt" flush="true"/>
    </BODY>
</HTML>