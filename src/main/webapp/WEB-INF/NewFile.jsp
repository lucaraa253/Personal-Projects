<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/newPlayer" method="post" modelAttribute="player">
		<p>
        	<form:label path="id">ID</form:label>
        	<form:input type="number" path="id"/>
    	</p>
		<p>
        	<form:label path="diceOne">Dice One</form:label>
        	<form:input type="number" path="diceOne"/>
    	</p>
    	<p>
        	<form:label path="diceTwo">Dice Two</form:label>
        	<form:input type="number" path="diceTwo"/>
    	</p>
    	<p>
        	<form:label path="diceThree">Dice Three</form:label>
        	<form:input type="number" path="diceThree"/>
    	</p>
    	<p>
        	<form:label path="diceFour">Dice Four</form:label>
        	<form:input type="number" path="diceFour"/>
    	</p>
    	<p>
        	<form:label path="diceFive">Dice Five</form:label>
        	<form:input type="number" path="diceFive"/>
    	</p>
    	<p>
        	<form:label path="onesVal">Ones Val</form:label>
        	<form:input type="number" path="onesVal"/>
    	</p>
    	<p>
        	<form:label path="twosVal">Twos Val</form:label>
        	<form:input type="number" path="twosVal"/>
    	</p>
    	<p>
        	<form:label path="threesVal">Threes Val</form:label>
        	<form:input type="number" path="threesVal"/>
    	</p>
    	<p>
        	<form:label path="foursVal">Fours Val</form:label>
        	<form:input type="number" path="foursVal"/>
    	</p>
    	<p>
        	<form:label path="fivesVal">Fives Val</form:label>
        	<form:input type="number" path="fivesVal"/>
    	</p>
    	<p>
        	<form:label path="sixesVal">Ones Val</form:label>
        	<form:input type="number" path="sixesVal"/>
    	</p>
    	<p>
        	<form:label path="upperTotal">Upper Total</form:label>
        	<form:input type="number" path="upperTotal"/>
    	</p>
    	<p>
        	<form:label path="lowerTotal">Lower Total</form:label>
        	<form:input type="number" path="lowerTotal"/>
    	</p>
    	<p>
        	<form:label path="roll">Roll</form:label>
        	<form:input type="number" path="roll"/>
    	</p>
    	<p>
        	<form:label path="round">Round</form:label>
        	<form:input type="number" path="round"/>
    	</p>
    	<p>
        	<form:label path="diceOneStatus">Dice One Status</form:label>
        	<form:input type="Boolean" path="diceOneStatus"/>
    	</p>
    	<p>
        	<form:label path="diceTwoStatus">diceTwoStatus</form:label>
        	<form:input type="Boolean" path="diceTwoStatus"/>
    	</p>
    	<p>
        	<form:label path="diceThreeStatus">diceThreeStatus</form:label>
        	<form:input type="Boolean" path="diceThreeStatus"/>
    	</p>
    	<p>
        	<form:label path="diceFourStatus">diceFourStatus</form:label>
        	<form:input type="Boolean" path="diceFourStatus"/>
    	</p>
    	<p>
        	<form:label path="diceFiveStatus">diceFiveStatus</form:label>
        	<form:input type="Boolean" path="diceFiveStatus"/>
    	</p>
    	
    	
		<input type="submit" value="Create" />
	</form:form>
</body>
</html>