<HTML>
<BODY>
<%
    // This is a scriptlet.  Notice that the "date"
    // variable we declare here is available in the
    // embedded expression later on.
    System.out.println( "Evaluating date now" );
    java.util.Date date = new java.util.Date();
    
    
%>
<center><font color="green"> Todays Date: </font><%= date %></font></center>

<center><h1> <font color="black"> Output Page </font> </h1></center>
<center><font color="blue">================ You entered following Values ==================</font></center>
<br>
<br>
<br>
<center><font color=blue size=2> Your FirstName is    : </font><%=session.getAttribute("ofname")%>;</center><br>
<center><font color=blue size=2> Your LastName is     : </font><%=session.getAttribute("olname")%>;</center><br>
<center><font color=blue size=2> Your MiddleName is   : </font><%=session.getAttribute("omname")%>;</center><br>
<center><font color=blue size=2> Your CityName is     : </font><%=session.getAttribute("ocity")%>;</center><br>
<center><font color=blue size=2> Your Address is      : </font><%=session.getAttribute("oaddress")%>;</center><br>
<center><font color=blue size=2> Your countryName is  : </font><%=session.getAttribute("ocountry")%>;</center><br>
<center><font color=blue size=2> Your StateName is    : </font><%=session.getAttribute("ostate")%>;</center><br>
<center><font color=blue size=2> Your Contact no is   : </font><%=session.getAttribute("ocontact")%>;</center><br>

<center><font color=blue size=2> Your bankName is     : </font><%=session.getAttribute("obank")%>;</center><br>
<center><font color=blue size=2> Your accountNo is    : </font><%=session.getAttribute("oaccount")%>;</center><br>
<center><font color=blue size=2> Your SSN No no is    : </font><%=session.getAttribute("ossn")%>;</center><br>

<center><font color="blue">================ End of the display=============================</font></center>
</BODY>
</HTML>