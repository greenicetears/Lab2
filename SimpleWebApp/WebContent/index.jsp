<HTML>
    <HEAD>
        <TITLE>Computer Science Questionaire!</TITLE>
    </HEAD>

    <BODY>
    <% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
        <CENTER>
            <H1>Please Share Your opinion about Computer Science!</H1>
            <FORM ACTION="basic.jsp" METHOD="POST">
                Your name *:
                <INPUT TYPE="TEXT" NAME="TEXT1" required>
                <BR>
                <BR>
                <BR>
                How much do You like CS on scale of 10 *: 
                <input type="range" name="points" min="0" max="10" required>
                <br>
                <br>
                <br>
                Your comments:
                <BR>
                <TEXTAREA NAME="TEXTAREA1" ROWS="5" COLS="50"></TEXTAREA>
                <BR>
                <INPUT TYPE="SUBMIT" VALUE="Submit"><INPUT TYPE="RESET" VALUE="Reset">
                <br>
                <br>
                The fields with * are mandatory.
            </FORM>
        </CENTER>
    </BODY>
</HTML>